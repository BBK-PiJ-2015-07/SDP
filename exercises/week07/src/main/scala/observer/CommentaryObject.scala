package observer

import scala.collection.mutable.ListBuffer

class CommentaryObject(var subscribers: ListBuffer[Observer], val title: String) extends Subject {

  def subscribeObserver(observer: Observer) = subscribers += observer

  def unSubscribeObserver(observer: Observer) = subscribers -= observer

  def notifyObservers() = {
    //for (s <- subscribers) s.update(desc)
  }
  def subjectDetails: String = "CommentaryObjectObservable. subscribers: " + subscribers.toString + " title: " + title //+ " desc: " + desc


}
