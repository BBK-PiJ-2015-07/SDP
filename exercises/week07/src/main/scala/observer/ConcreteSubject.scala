package observer

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Case on 20/04/2017.
  */
class ConcreteSubject extends Subject{

  var observers = ArrayBuffer[Observer]()

  override def subscribeObserver(observer: Observer): Unit = observers += observer

  override def unSubscribeObserver(observer: Observer): Unit = observers -= observer

  override def notifyObservers(): Unit = ???

  override def subjectDetails: String = ???
}
