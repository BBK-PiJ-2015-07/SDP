package vendor

import VendorImpl.VendorImpl
import org.scalatest.FunSuite
import java.io.{File, FileNotFoundException}

/**
  * To test VendorImpl class
  * Created by Dave and Andras on 25/02/2017.
  */
class VendorImplTest extends FunSuite{

  val vi = new VendorImpl()

  test("Correct number of instructions are read") {
    val testStr = "iconst 4\niconst 5\niadd\nprint"
    val instructions : Vector[Instruction] = vi.parseString(testStr)

    assert(instructions.length == 4)
  }

  test("Empty string returns empty InstructionList"){
    val instructions : Vector[Instruction] = vi.parseString("")
    assert(instructions.length == 0)
  }

  test("InvalidInstructionFormatException on string argument") {
    val testStr = "iconst 5 45 ttt"

    assertThrows[InvalidInstructionFormatException] {
      val instructions: Vector[Instruction] = vi.parseString(testStr)
    }
  }

  test("FileNotFoundException is thrown"){
    //Dave's test path
    //val f = "/Users/davidasfaha/Documents/Personal/BBK-2017-LOCAL/coursework - shared working/SDP-coursework2/programs/NoSuchFile.vm"

    //Andras' test path
    val f = "/Users/Case/Documents/Uni/SDP/CW2/SDP-coursework2/programs/NoSuchFile.vm"

    assertThrows[FileNotFoundException] {
      val instructions: Vector[Instruction] = vi.parse(f)
    }
  }

  test("File p01.vm is read correctly"){

    //Dave's test path
    //val f = "/Users/davidasfaha/Documents/Personal/BBK-2017-LOCAL/coursework - shared working/SDP-coursework2/programs/p01.vm"

    //Andras' test path
    val f = "/Users/Case/Documents/Uni/SDP/CW2/SDP-coursework2/programs/p01.vm"


    val instructions : Vector[Instruction] = vi.parse(f)
    assert(instructions(0).toString == "iconst 4")
    assert(instructions(1).toString == "iconst 5")
    assert(instructions(2).toString == "iadd")
    assert(instructions(3).toString == "print")
  }

  test("File p03.vm is read correctly"){

    //Dave's test path
    //val f = "/Users/davidasfaha/Documents/Personal/BBK-2017-LOCAL/coursework - shared working/SDP-coursework2/programs/p03.vm"

    //Andras' test path
    val f = "/Users/Case/Documents/Uni/SDP/CW2/SDP-coursework2/programs/p03.vm"

    val instructions : Vector[Instruction] = vi.parse(f)
    assert(instructions(0).toString == "iconst 7")
    assert(instructions(1).toString == "iconst 7")
    assert(instructions(2).toString == "iswap")
    assert(instructions(3).toString == "iadd")
    assert(instructions(4).toString == "iconst 2")
    assert(instructions(5).toString == "iadd")
    assert(instructions(6).toString == "iconst 4")
    assert(instructions(7).toString == "isub")
    assert(instructions(8).toString == "iconst 1")
    assert(instructions(9).toString == "imul")
    assert(instructions(10).toString == "iconst 2")
    assert(instructions(11).toString == "idiv")
    assert(instructions(12).toString == "iconst 1")
    assert(instructions(13).toString == "irem")
    assert(instructions(14).toString == "ineg")
    assert(instructions(15).toString == "idec")
    assert(instructions(16).toString == "iinc")
    assert(instructions(17).toString == "idup")
    assert(instructions(18).toString == "print")
    assert(instructions(19).toString == "print")
  }
}
