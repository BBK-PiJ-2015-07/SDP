package vm

/**
  * Created by davidasfaha on 04/03/2017.
  * To test the implementation of VirtualMachineParser trait
  */

import org.scalatest.FunSuite
import vmImpl._

class VirtualMachineParserImplTest extends FunSuite {
  var vmp = new VirtualMachineParserImpl();

  test("Test - parseString") {
    val parsedByteCodes = vmp.parseString("iconst 4\niconst 5\niadd\nprint")
    assert(parsedByteCodes(0) == "iconst")
    assert(parsedByteCodes(1) == "iconst")
    assert(parsedByteCodes(2) == "iadd")
    assert(parsedByteCodes(3) == "print")
  }

  test("Test - parse") {

    //Dave's test path
    //val f = "/Users/davidasfaha/Documents/Personal/BBK-2017-LOCAL/coursework - shared working/SDP-coursework2/programs/p03.vm"
    //Andras' test path
    val f = "/Users/Case/Documents/Uni/SDP/CW2/SDP-coursework2/programs/p03.vm"

    val parsedByteCodes = vmp.parse(f)

    assert(parsedByteCodes(0) == "iconst")
    assert(parsedByteCodes(1) == "iconst")
    assert(parsedByteCodes(2) == "iadd")
    assert(parsedByteCodes(3) == "print")
  }
  }
