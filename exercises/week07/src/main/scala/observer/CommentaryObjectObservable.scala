package observer

import scala.collection.mutable.ListBuffer

/**
  * Created by apinter on 20/04/2017.
  */
class CommentaryObjectObservable (var subscribers: ListBuffer[Observer], val title: String) extends Subject with Commentary {

  def this(val title: String){}

  var desc = null

  override def setDesc(desc: String): Unit = this.desc = desc

  def subscribeObserver(observer: Observer) = subscribers += observer

  def unSubscribeObserver(observer: Observer) = subscribers -= observer

  def notifyObservers() = {
    for (s <- subscribers) s.update(desc)
  }
  def subjectDetails: String = "CommentaryObjectObservable. subscribers: " + subscribers.toString + " title: " + title + " desc: " + desc
}
