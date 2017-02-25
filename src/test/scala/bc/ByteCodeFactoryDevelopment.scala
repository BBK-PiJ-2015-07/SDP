package bc

import ByteCodeImpl._
import org.scalatest.FunSuite

/**
  * Created by davidasfaha on 25/02/2017.
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
