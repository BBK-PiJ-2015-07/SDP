package observer

import scala.collection.mutable.ListBuffer

/**
  * Created by apinter on 20/04/2017.
  */
class CommentaryObjectObservable (var subscribers: ListBuffer[Observer], val title: String) extends Subject with Commentary {

  private var desc: String = _

  def this(title: String){ this(new ListBuffer[Observer], title) }

  override def setDesc(desc: String): Unit = {
    this.desc = desc
    notifyObservers()
  }

  def subscribeObserver(observer: Observer) = subscribers += observer

  def unSubscribeObserver(observer: Observer) = subscribers -= observer

  def notifyObservers() = {
    for (s <- subscribers) s.update(desc)
  }
  def subjectDetails: String = "CommentaryObjectObservable. subscribers: " + subscribers.toString + " title: " + title + " desc: " + desc

  def getDesc = this.desc
}
