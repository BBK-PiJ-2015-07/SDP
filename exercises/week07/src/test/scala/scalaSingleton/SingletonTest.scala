package scalaSingleton

import org.scalatest.FunSuite
/**
  * Created by Case on 20/04/2017.
  */
class SingletonTest extends FunSuite {

    var singleton: SingletonForTesting = SingletonForTesting.getInstance.get
    var singleton2: SingletonForTesting = SingletonForTesting.getInstance.get


  test("clone throws exception"){
    assertThrows[CloneNotSupportedException]{
      var singletonClone = SingletonForTesting.cloneMe
    }
  }

  test("only one singleton"){
    assert(singleton.hashCode() == singleton2.hashCode())
  }
}
