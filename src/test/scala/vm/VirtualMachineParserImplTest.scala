package vm

/**
  * Created by davidasfaha on 04/03/2017.
  */

import org.scalatest.FunSuite
import vmImpl._

class VirtualMachineParserImplTest extends FunSuite {
  var v = new VirtualMachineParserImpl();

  test("Test - parseString") {
    val parsedByteCodes = v.parseString("iconst 4\niconst 5\niadd\nprint")
    println(parsedByteCodes(0))
    println(parsedByteCodes(1))
  }

  test("Test - parse") {

    //Dave's test path
    //val f = "/Users/davidasfaha/Documents/Personal/BBK-2017-LOCAL/coursework - shared working/SDP-coursework2/programs/p03.vm"
    //Andras' test path
    val f = "/Users/Case/Documents/Uni/SDP/CW2/SDP-coursework2/programs/p03.vm"

    val parsedByteCodes = v.parse(f)

    println(parsedByteCodes(0))
    println(parsedByteCodes(1))
  }
  }
