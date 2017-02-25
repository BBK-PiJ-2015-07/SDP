package vendor

import VendorImpl.VendorImpl
import org.scalatest.FunSuite

/**
  * To test VendorImpl class
  * Created by Dave and Andras on 25/02/2017.
  */
class VendorImplTest extends FunSuite{

  val vi = new VendorImpl

  testParseOutput("Output length") {
    val testStr = "iconst 4\niconst 5\niadd\nprint"
    var instructions : Vector[Instruction] = vi.parse(testStr)

    assert(instructions.length == 4)
  }
}
