package observer

/**
  * Created by apinter on 20/04/2017.
  */
class SMSUsersObserver(s: Subject, msg: String) extends Observer {
  var desc: String = _

  override def update(desc: String): Unit = {this.desc = desc}

  override def subscribe(): Unit = s.subscribeObserver(this)

  override def unSubscribe(): Unit = s.unSubscribeObserver(this)

  def getMsg = this.msg
}
