package observer

import org.scalatest.FunSuite
import scala.collection.mutable.ListBuffer
/**
  * Created by Case on 20/04/2017.
  */
class ObserverTest extends FunSuite {


  test("SMSUsersObserver update"){}
  test("SMSUsersObserver subscribe"){ }
  test("SMSUsersObserver unsubscribe"){  }

  test("CommentaryObjectObservable setDesc"){
    val title = "Soccer Match [2014AUG24]"
    val desc = "NewDesc"
    val obj: CommentaryObjectObservable = new CommentaryObjectObservable(title)
    assert(obj.getDesc == null)
    obj.setDesc(desc)
    assert(obj.getDesc == desc)
  }
  test("CommentaryObjectObservable, single param constructor"){
    val title = "Soccer Match [2014AUG24]"
    val obj: CommentaryObjectObservable = new CommentaryObjectObservable(title)
    assert(obj.title == title)
  }

  test("CommentaryObjectObservable subscribeObserver"){
    val obj: CommentaryObjectObservable = new CommentaryObjectObservable("Soccer Match [2014AUG24]")
    val observer: SMSUsersObserver = new SMSUsersObserver(obj, "Adam Warner [New York]")
    val observer2: SMSUsersObserver = new SMSUsersObserver(obj, "Tim Ronney [London]")

    assert(obj.subscribers.length == 0)

    observer.subscribe
    assert(obj.subscribers.length == 1)
    assert(obj.subscribers.contains(observer))
    assert(!obj.subscribers.contains(observer2))

    observer2.subscribe
    assert(obj.subscribers.length == 2)
    assert(obj.subscribers.contains(observer2))

    assert(observer.desc == null)
    assert(observer2.desc == null)

    val newDesc1 = "Welcome to live Soccer match"
    obj.setDesc(newDesc1)

    assert(observer.desc == newDesc1)
    assert(observer2.desc == newDesc1)

    val newDesc2 = "\"Current score 0-0\""
    obj.setDesc(newDesc2)

    assert(observer.desc == newDesc2)
    assert(observer2.desc == newDesc2)

    observer.unSubscribe
    val newDesc3 = "It's a goal!!"
    obj.setDesc(newDesc3)
    assert(observer.desc == newDesc2)
    assert(observer2.desc == newDesc3)


    observer.subscribe
    val newDesc4 = "It's a goal!!"
    obj.setDesc(newDesc4)
    assert(observer.desc == newDesc4)
    assert(observer2.desc == newDesc4)

  }
  test("CommentaryObjectObservable unSubscribeObserver"){}
  test("CommentaryObjectObservable notifyObservers"){}
  test("CommentaryObjectObservable subjectDetails"){}



}

