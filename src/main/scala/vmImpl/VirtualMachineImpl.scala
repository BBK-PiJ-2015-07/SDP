package vmImpl

/**
  * Created by davidasfaha on 04/03/2017.
  */

import bc.ByteCode
import vm.{MachineUnderflowException, VirtualMachine}

/**
  * Implementation of a stack-based virtual machine.
  * It is capable of executing a vector of [[bc.ByteCode]] values.
  */
class VirtualMachineImpl extends VirtualMachine {

  var stack = List[Int]()

  /**
    * Executes a vector of bytecodes.
    *
    * Note, that this is an "immutable" object. That is, it
    * will return a new virtual machine after executing each
    * of the bytecode objects in the vector.
    *
    * @param bc a vector of bytecodes
    * @return a new virtual machine
    */
  override def execute(bc: Vector[ByteCode]): VirtualMachine = {
    if(bc.isEmpty){
      this
    }else {
      val (bcs, vm) = executeOne(bc)
      vm.execute(bcs)
    }
  }

  /**
    * Executes the next bytecode in the vector of bytecodes.
    *
    * This method only executes a single byte code in the vector of bytecodes.
    * It returns a tuple of the new vector of bytecodes (with the executed
    * bytecode removed) and the new virtual machine.
    *
    * You may assume that `bc` contains at least 1 bytecode.
    *
    * @param bc the vector of bytecodes
    * @return a tuple of a new vector of bytecodes and virtual machine
    */
  override def executeOne(bc: Vector[ByteCode]): (Vector[ByteCode], VirtualMachine) = {
    val instr = bc(0)
    val rest = bc.tail
    (rest, instr.execute(this))
  }

  /**
    * Pushes an integer value onto the virtual machine stack.
    *
    * @param value the integer to push
    * @return a new virtual machine with the integer `value` pushed
    */
  override def push(value: Int): VirtualMachine = {
    var vm = new VirtualMachineImpl()
    vm.stack = value :: stack
    vm
  }

  /**
    * Pops an integer value off of the virtual machine stack.
    *
    * @return (i, vm), where i is the integer popped and vm is the
    *         new virtual machine
    */
  override def pop(): (Int, VirtualMachine) = {
    var vm = new VirtualMachineImpl()
    if (stack.isEmpty)
      throw new MachineUnderflowException("Stack is empty")
    val num = stack.head
    vm.stack = stack.tail
    (num, vm)
  }

  /**
    * Returns the state of the virtual machine stack.
    *
    * The value at index 0 is the value on the top of the stack.
    *
    * @return the state of the stack
    */
  override def state: Vector[Int] = {
    stack.toVector
  }
}
