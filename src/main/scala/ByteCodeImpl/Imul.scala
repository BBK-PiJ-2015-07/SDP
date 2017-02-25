package ByteCodeImpl

import bc.ByteCode
import vm.VirtualMachine

/**
  * Created by Case on 25/02/2017.
  */
class Imul extends ByteCode{
  /**
    * A unique byte value representing the bytecode. An implementation
    * will set this to the bytecode corresponding to the name of the
    * bytecode in [[ByteCodeValues]]
    */
  override val code: Byte = bytecode.get("imul").get


  /**
    * Returns a new [[VirtualMachine]] after executing this bytecode operation.
    *
    * @param vm the initial virtual machine
    * @return a new virtual machine
    */
  override def execute(vm: VirtualMachine): VirtualMachine = {
    var (x: Int, vm1: VirtualMachine) = vm.pop()
    var (y: Int, vm2: VirtualMachine) = vm1.pop()
    vm2.push(x * y)
  }
}
