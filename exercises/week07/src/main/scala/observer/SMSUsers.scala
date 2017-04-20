package observer

class SMSUsers(s: Subject, msg: String) extends Observer {

  var desc: String = _

  def update(desc: String) = { this.desc = desc}

  def subscribe() = s.subscribeObserver(this)

  def unSubscribe() = s.unSubscribeObserver(this)
}
