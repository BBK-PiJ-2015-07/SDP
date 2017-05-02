import akka.actor.{Actor, ActorRef, Props}
import akka.event.LoggingReceive

class TestTransfer extends Actor {
  val accountA = context.actorOf(Props[BankAccount], "AccountA")
  val accountB = context.actorOf(Props[BankAccount], "AccountB")
  
  accountA ! BankAccount.Deposit(100)


  def receive = LoggingReceive {
      case BankAccount.Done => transfer(70)
  }
  
  def transfer(amount: Int) = {
    val transaction = context.actorOf(Props[WireTransfer], "Transaction")
    transaction ! WireTransfer.Transfer(accountA, accountB, amount)
    context.become(LoggingReceive {
        case WireTransfer.Done =>
            println("success")
            context.stop(self)    
        case WireTransfer.Failed =>
            println("failed")
            context.stop(self)
    })
  }
}

object Main extends App {
  akka.Main.main(Array(classOf[TestTransfer].getName))
}
