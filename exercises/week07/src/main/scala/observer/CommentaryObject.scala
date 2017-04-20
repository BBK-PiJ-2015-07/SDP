package observer

import scala.collection.mutable.ListBuffer

class CommentaryObject(var subscribers: ListBuffer[Observer], val title: String) extends Subject {
/*  def subscribeObserver(observer: Observer) = subscribers += observer

  def unSubscribeObserver(observer: Observer) = subscribers -= observer

  def notifyObservers() = {
    for (o <- observers) o.update()
  }
  def subjectDetails: String = ???*/
}
