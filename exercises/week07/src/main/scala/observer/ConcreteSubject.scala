package observer

/**
  * Created by Case on 20/04/2017.
  */
class ConcreteSubject extends Subject{
  override def subscribeObserver(observer: Observer): Unit = ???

  override def unSubscribeObserver(observer: Observer): Unit = ???

  override def notifyObservers(): Unit = ???

  override def subjectDetails: String = ???
}
