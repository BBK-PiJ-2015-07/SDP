package ByteCodeImpl

import bc.ByteCode
import vm.VirtualMachine

/* Implements the remainder byte code - it returns the reminder of a dvision operation between two values
 */
class Irem extends ByteCode  {
  /**
    * A unique byte value representing the bytecode. An implementation
    * will set this to the bytecode corresponding to the name of the
    * bytecode in [[bc.ByteCodeValues]]
    */
  override val code: Byte =  bytecode.get("irem").get

  /**
    * Returns a new [[VirtualMachine]] after executing this remainder operation.
    *
    * @param vm the initial virtual machine
    * @return a new virtual machine
    */
  override def execute(vm: VirtualMachine): VirtualMachine = {
    var (x: Int, vm1: VirtualMachine) = vm.pop()
    var (y: Int, vm2: VirtualMachine) = vm1.pop()
    vm2.push(x % y)
  }
}
