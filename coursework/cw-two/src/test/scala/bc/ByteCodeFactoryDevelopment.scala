package bc

import ByteCodeImpl._
import org.scalatest.FunSuite

/**
  * Harness to run ByteCodeFactory code -- delete? // TODO delete
  */
class ByteCodeFactoryDevelopment extends FunSuite {


  var byteCodeFactory = new ByteCodeFactoryImpl()

  test("RUN code") {
    var b = byteCodeFactory.make(7, 4,3)
    println("----" + b.toString)
    var c = byteCodeFactory.make(1, 4)
    println("----" + c.toString)
  }
}
