package vm

import bc.{ByteCode, InvalidBytecodeException}
import factory.VirtualMachineFactory
import org.scalatest.FunSuite
import org.scalatest.Matchers._

/**
  * Created by davidasfaha on 19/03/2017.
  */
class VirtualMachineAdditionalOperations extends FunSuite {
  val vmp = VirtualMachineFactory.virtualMachineParser
  val bcp = VirtualMachineFactory.byteCodeParser
  val vm  = VirtualMachineFactory.virtualMachine

// already implemented - swp, isub, iadd,

  test("imul should work correctly") {
    val bc  = vmp.parseString("iconst 3\niconst 2\nimul")
    var completed = vm.execute(bc)
    assert(completed.state.head == 6)
  }

  test("imul should work correctly - negative numbers") {
    val bc  = vmp.parseString("iconst 3\niconst -2\nimul")
    var completed = vm.execute(bc)
    assert(completed.state.head == -6)
  }

  test("imul should work correctly - 0") {
    val bc  = vmp.parseString("iconst 3\niconst 0\nimul")
    var completed = vm.execute(bc)
    assert(completed.state.head == 0)
  }

  test("imul should work correctly - not enough operands") {
    assertThrows[MachineUnderflowException] {
      val bc  = vmp.parseString("iconst 3 \nimul")
      var completed = vm.execute(bc)
      assert(completed.state.head == 0)
    }
  }
  test("idiv should work correctly") {
    val bc  = vmp.parseString("iconst 2\niconst 6\nidiv")
    var completed = vm.execute(bc)
    assert(completed.state.head == 3)
  }
  test("irem should work correctly") {
    val bc  = vmp.parseString("iconst 2\niconst 3\nidiv")
    var completed = vm.execute(bc)
    assert(completed.state.head == 1)
  }
  test("ineg should work correctly") {
    val bc  = vmp.parseString("iconst 2\nineg")
    var completed = vm.execute(bc)
    assert(completed.state.head == -2)
  }
  test("iinc should work correctly") {
    val bc  = vmp.parseString("iconst 2\niinc")
    var completed = vm.execute(bc)
    assert(completed.state.head == 3)
  }
  test("idec should work correctly") {
    val bc  = vmp.parseString("iconst 2\nidec")
    var completed = vm.execute(bc)
    assert(completed.state.head == 1)
  }
  test("idup should work correctly") {
    val bc  = vmp.parseString("iconst 1\niconst 2\nidup")
    var completed = vm.execute(bc)
    assert(completed.state(0)  == 2)
    assert(completed.state(1)  == 2)
  }
}
