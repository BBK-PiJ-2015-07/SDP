package vendor

import VendorImpl.VendorImpl
import org.scalatest.FunSuite
import java.io.File

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

  test("InvalidInstructionFormatException on string argument") {
    val testStr = "iconst 5 45 ttt"

    assertThrows[InvalidInstructionFormatException] {
      val instructions: Vector[Instruction] = vi.parseString(testStr)
    }

  }

  test("File is read correctly"){
    //DA

    val f = "/Users/davidasfaha/Documents/Personal/BBK-2017-LOCAL/coursework - shared working/SDP-coursework2/programs/p01.vm"


    val instructions : Vector[Instruction] = vi.parse(f)
    assert(instructions(0).toString == "iconst 4")
    assert(instructions(1).toString == "iconst 5")
    assert(instructions(2).toString == "iadd ")
    assert(instructions(3).toString == "print ")

  }

}
