package observer

class SMSUsers(s: Subject, msg: String) extends Observer {
  def update(desc: String) = msg = desc

  def subscribe() = ???

  def unSubscribe() = ???
}
