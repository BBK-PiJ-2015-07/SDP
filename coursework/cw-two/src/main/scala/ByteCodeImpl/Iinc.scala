package ByteCodeImpl

import bc.ByteCode
import vm.VirtualMachine

/* Implements the increment byte code
 */
class Iinc extends ByteCode {
  /**
    * A unique byte value representing the bytecode. An implementation
    * will set this to the bytecode corresponding to the name of the
    * bytecode in [[ByteCodeValues]]
    */
  override val code: Byte = bytecode.get("iinc").get

  /**
    * Returns a new [[VirtualMachine]] after executing the increment operation.
    *
    * @param vm the initial virtual machine
    * @return a new virtual machine
    */
  override def execute(vm: VirtualMachine): VirtualMachine = {
    var (x: Int, vm1: VirtualMachine) = vm.pop()
    vm1.push(x+1)
  }
}
