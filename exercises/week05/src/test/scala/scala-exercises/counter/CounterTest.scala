package counter

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
    assert(c.count == 0)
    assert(c10.count == 10)
  }

  test("inc function works"){
    var c1: Counter = c inc
    var c11: Counter = c10 inc

    assert(c1.count == 1)
    assert(c11.count == 11)
  }

  test("dec function works"){
    var cminus1: Counter = c dec
    var c9: Counter = c10 dec

    assert(cminus1.count == -1)
    assert(c9.count == 9)
  }

  test("inc returns new Counter instance"){
    var cNew: Counter = c inc
    assert(cNew.count == c.count + 1)
    assert(c.count == 0)
  }

  test("dec returns new Counter instance"){
    var cNew: Counter = c dec
    assert(cNew.count == c.count - 1)
    assert(c.count == 0)
  }

}