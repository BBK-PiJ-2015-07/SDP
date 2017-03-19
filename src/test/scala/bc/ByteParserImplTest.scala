package bc

import ByteCodeImpl._
import org.scalatest.FunSuite
import bc._
import vm.MachineUnderflowException

/**
  * Tests for ByteParserImpl
  */
class ByteCodeParserImplTest extends FunSuite {


  var byteCodeParser = new ByteCodeParserImpl()
  var bcl = new ByteCodeLookUp()

  test("Test vector") {
   val testVector: Vector[ByteCode] =  byteCodeParser.parse(Vector(bcl.bytecode.getOrElse("iconst", 0), 4.toByte, bcl.bytecode.getOrElse("iconst", 0), 5.toByte
     , bcl.bytecode.getOrElse("iadd",0), bcl.bytecode.getOrElse("print", 0)))
    assert(testVector(0).code == testVector(0).bytecode.getOrElse("iconst", 0))
    assert(testVector(1).code == testVector(1).bytecode.getOrElse("iconst", 0))
    assert(testVector(2).code == testVector(2).bytecode.getOrElse("iadd", 0))
    assert(testVector(3).code == testVector(3).bytecode.getOrElse("print", 0))
  }

  test("Test empty vector") {
    val testVector: Vector[ByteCode] =  byteCodeParser.parse(Vector())
    assert(testVector.isEmpty)
  }

  test("single iconst at end ") {
    assertThrows[MachineUnderflowException] {
      val testVector: Vector[ByteCode] =  byteCodeParser.parse(Vector(bcl.bytecode.getOrElse("iconst",0)))
    }
  }

  }
