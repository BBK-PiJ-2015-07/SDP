package vendor

import VendorImpl.VendorImpl
import org.scalatest.FunSuite

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


}
