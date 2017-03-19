package vm

/**
  * Created by Andras on 19/03/2017.
  * To Test VirtualMachineImpl - the implementation of the VirtualMachine trait
  */

import org.scalatest.{BeforeAndAfterEach, FunSuite}
import vmImpl._

class VirtualMachineImplTest extends FunSuite with BeforeAndAfterEach{
  var vm: VirtualMachine = new VirtualMachineImpl
  var vm1: VirtualMachine = new VirtualMachineImpl    //One arg on the stack
  var vmMul: VirtualMachine = new VirtualMachineImpl  //Multiple args on the stack

  override def beforeEach() {
    vm = new VirtualMachineImpl
    vm1 = new VirtualMachineImpl
    vm1 = vm1.push(1)
    vmMul = new VirtualMachineImpl
    vmMul = vmMul.push(10)
    vmMul = vmMul.push(20)
  }

  test("New virtual machine is initiated with an empty stack."){
    assert(vm.state.isEmpty)
  }

  test("Correct number of args on the stack."){
    assert(vm.state.isEmpty)
    assert(vm1.state.length == 1)
    assert(vmMul.state.length == 2)
  }

  test("push returns new VirtualMachine object"){
    var vm2: VirtualMachine = vm.push(1)
    assert(vm != vm2)
    assert(!vm.equals(vm2))
    assert(vm.hashCode() != vm2.hashCode())
  }

  test("pop returns new VirtualMachine object"){
    var vm2: VirtualMachine = vmMul.pop._2
    assert(vmMul != vm2)
    assert(!vmMul.equals(vm2))
    assert(vmMul.hashCode() != vm2.hashCode())
  }

  test("correct values on stack after push"){
    assert(vm1.pop()._1 == 1)

    val vmPop = vmMul.pop()
    assert(vmPop._1 == 20)
    assert(vmPop._2.pop()._1 == 10)
  }

  test("pop from empty stack throws MachineUnderflowException"){

    assertThrows[MachineUnderflowException] {
      val vmError = vm.pop()
    }
  }

}
