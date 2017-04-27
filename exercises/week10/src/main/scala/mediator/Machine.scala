package mediator

class Machine extends Colleague {

  private var mediator: MachineMediator = _
  override def setMediator(mediator: MachineMediator): Unit = this.mediator = mediator

  def start(): Unit = {
    println("Machine start...")
    mediator.open()
  }

  def wash(): Unit = {
    println("Machine wash...")
    //mediator.wash()
  }
}