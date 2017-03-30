package vm

/**
  * Created by Andras on 19/03/2017.
  * To Test VirtualMachineImpl - the implementation of the VirtualMachine trait
  */

import ByteCodeImpl.{ByteCodeLookUp, ByteCodeParserImpl}
import bc.ByteCode
import org.scalatest.{BeforeAndAfterEach, FunSuite}
import vmImpl._

class VirtualMachineImplTest extends FunSuite with BeforeAndAfterEach{
  var vm: VirtualMachine = new VirtualMachineImpl
  var vm1: VirtualMachine = new VirtualMachineImpl    //One arg on the stack
  var vmMul: VirtualMachine = new VirtualMachineImpl  //Multiple args on the stack


  val byteCodeParser = new ByteCodeParserImpl
  val bcl = new ByteCodeLookUp

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

  test("executeOne executes one ByteCode and returns the rest of the ByteCode vector with new virtual machine"){
    val testVector: Vector[ByteCode] =  byteCodeParser.parse(Vector(bcl.bytecode.getOrElse("iconst", 0), 4.toByte,
                                                                    bcl.bytecode.getOrElse("iconst", 0), 5.toByte,
                                                                    bcl.bytecode.getOrElse("iadd",0),
                                                                    bcl.bytecode.getOrElse("print", 0)))
    val res1 = vm.executeOne(testVector)
    assert(res1._1.length == 3)
    assert(res1._1(0).code == bcl.bytecode.getOrElse("iconst", 0))
    val res2 = res1._2.executeOne(res1._1)
    assert(res2._1.length == 2)
    assert(res2._1(0).code == bcl.bytecode.getOrElse("iadd", 0))
    val res3 = res2._2.executeOne(res2._1)
    assert(res3._1.length == 1)
    assert(res3._1(0).code == bcl.bytecode.getOrElse("print", 0))
  }

  test("execute returns same virtual machine when ByteCode vector arg is empty."){
    assert(vm == vm.execute(Vector.empty))
  }

  test("execute returns different virtual machine when ByteCode vector arg is not empty."){
    val testVector: Vector[ByteCode] =  byteCodeParser.parse(Vector(bcl.bytecode.getOrElse("iconst", 0), 4.toByte,
      bcl.bytecode.getOrElse("iconst", 0), 5.toByte,
      bcl.bytecode.getOrElse("iadd",0),
      bcl.bytecode.getOrElse("print", 0)))

    assert(vm != vm.execute(testVector))
  }
}
