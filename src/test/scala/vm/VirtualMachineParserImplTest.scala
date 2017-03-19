package vm

/**
  * Created by davidasfaha on 04/03/2017.
  * To test the implementation of VirtualMachineParser trait
  */

import ByteCodeImpl.{ByteCodeLookUp, ByteCodeParserImpl}
import bc.InvalidBytecodeException
import org.scalatest.FunSuite
import vmImpl._

class VirtualMachineParserImplTest extends FunSuite {
  val vmp = new VirtualMachineParserImpl();
  val byteCodeParser = new ByteCodeParserImpl
  val bcl = new ByteCodeLookUp

  test("Test - parseString") {
    val parsedByteCodes = vmp.parseString("iconst 4\niconst 5\niadd\nprint")
    assert(parsedByteCodes(0).code == bcl.bytecode.getOrElse("iconst", 0))
    assert(parsedByteCodes(1).code == bcl.bytecode.getOrElse("iconst", 0))
    assert(parsedByteCodes(2).code == bcl.bytecode.getOrElse("iadd", 0))
    assert(parsedByteCodes(3).code == bcl.bytecode.getOrElse("print", 0))
  }

  test("parse method gets correct instructin codes") {

    //Dave's test path
    //val f = "/Users/davidasfaha/Documents/Personal/BBK-2017-LOCAL/coursework - shared working/SDP-coursework2/programs/p03.vm"
    //Andras' test path
    val f = "/Users/Case/Documents/Uni/SDP/CW2/SDP-coursework2/programs/p03.vm"

    val parsedByteCodes = vmp.parse(f)

    assert(parsedByteCodes(0).code == bcl.bytecode.getOrElse("iconst", 0))
    assert(parsedByteCodes(1).code == bcl.bytecode.getOrElse("iconst", 0))
    assert(parsedByteCodes(2).code == bcl.bytecode.getOrElse("iswap", 0))
    assert(parsedByteCodes(3).code == bcl.bytecode.getOrElse("iadd", 0))
    assert(parsedByteCodes(4).code == bcl.bytecode.getOrElse("iconst", 0))
    assert(parsedByteCodes(5).code == bcl.bytecode.getOrElse("iadd", 0))
    assert(parsedByteCodes(6).code == bcl.bytecode.getOrElse("iconst", 0))
    assert(parsedByteCodes(7).code == bcl.bytecode.getOrElse("isub", 0))
    assert(parsedByteCodes(8).code == bcl.bytecode.getOrElse("iconst", 0))
    assert(parsedByteCodes(9).code == bcl.bytecode.getOrElse("imul", 0))
    assert(parsedByteCodes(10).code == bcl.bytecode.getOrElse("iconst", 0))
    assert(parsedByteCodes(11).code == bcl.bytecode.getOrElse("idiv", 0))
    assert(parsedByteCodes(12).code == bcl.bytecode.getOrElse("iconst", 0))
    assert(parsedByteCodes(13).code == bcl.bytecode.getOrElse("irem", 0))
    assert(parsedByteCodes(14).code == bcl.bytecode.getOrElse("ineg", 0))
    assert(parsedByteCodes(15).code == bcl.bytecode.getOrElse("idec", 0))
    assert(parsedByteCodes(16).code == bcl.bytecode.getOrElse("iinc", 0))
    assert(parsedByteCodes(17).code == bcl.bytecode.getOrElse("idup", 0))
    assert(parsedByteCodes(18).code == bcl.bytecode.getOrElse("print", 0))
    assert(parsedByteCodes(19).code == bcl.bytecode.getOrElse("print", 0))
  }

  test("parseString throws InvalidBytecodeException for inconst without arg"){
    val invalidStr = "iconst 4\niconst\niadd\nprint"

    assertThrows[InvalidBytecodeException] {
      vmp.parseString(invalidStr)
    }
  }

  test("parseString throws InvalidBytecodeException for nonexistent instruction code"){
    val invalidStr = "iconst 4\niconst 5\niadd\nprint\nFOO"

    assertThrows[InvalidBytecodeException] {
      vmp.parseString(invalidStr)
    }
  }
}
