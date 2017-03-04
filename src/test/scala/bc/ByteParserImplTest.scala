package bc

import ByteCodeImpl._

import org.scalatest.FunSuite
import bc._

/**
  * Created by davidasfaha on 25/02/2017.
  */
class ByteCodeParserImplTest extends FunSuite {


  var byteCodeParser = new ByteCodeParserImpl()
  var bcl = new ByteCodeLookUp()

  test("Test vector") {
   val testVector: Vector[ByteCode] =  byteCodeParser.parse(Vector(bcl.bytecode.getOrElse("iconst", 0), 4.toByte, bcl.bytecode.getOrElse("iconst", 0), 5.toByte
     , bcl.bytecode.getOrElse("iadd",0), bcl.bytecode.getOrElse("print", 0)))

    assert(testVector(0).code == testVector(0).bytecode.getOrElse("iconst", 0))

/*
    res21: scala.collection.immutable.Map[String,Byte] = Map(ineg -> 7, iswap -> 11, idiv -> 5,
     print -> 12, iinc -> 8, imul -> 4, iconst -> 1, idec -> 9, isub -> 3, irem -> 6, idup -> 10, iadd -> 2)

    */


  }
}
