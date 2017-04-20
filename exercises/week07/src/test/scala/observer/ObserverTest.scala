package observer

import org.scalatest.FunSuite
/**
  * Created by Case on 20/04/2017.
  */
class ObserverTest extends FunSuite {
  var concreteSubject = new ConcreteSubject()
  var concreteObserver = new ConcreteObserver()

  test("ConcreteSubject subscribe/unsubscribe") {
    assert(concreteSubject.observers.length == 0)
    concreteSubject.subscribeObserver(concreteObserver)
    assert(concreteSubject.observers.length == 1)
    concreteSubject.unSubscribeObserver(concreteObserver)
    assert(concreteSubject.observers.length == 0)
  }


}