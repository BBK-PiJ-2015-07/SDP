package films

import functions.Funcs._
import org.scalatest.FunSuite

/**
  * Created by apinter on 30/03/2017.
  */
class CounterTest extends FunSuite {

  var c: Counter = new Counter(0)
  var c10: Counter = new Counter(0)

  override def beforeEach() {
    c = Counter(0)
    c10 = Counter(10)
  }

  test("Counter constructor creates correct field"){
    assert(c._num == 0)
    assert(c10._num == 10)
  }
}
