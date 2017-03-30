package ByteCodeImpl

import bc.ByteCode
import vm.VirtualMachine

/* Implements the duplication byte code - it adds the bytecode at the top of the stack again
 */
class Idup extends ByteCode {
  /**
    * A unique byte value representing the bytecode. An implementation
    * will set this to the bytecode corresponding to the name of the
    * bytecode in [[ByteCodeValues]]
    */
  override val code: Byte = bytecode.get("idup").get

  /**
    * Returns a new [[VirtualMachine]] after executing the duplication operation.
    *
    * @param vm the initial virtual machine
    * @return a new virtual machine
    */
  override def execute(vm: VirtualMachine): VirtualMachine = {

    var(x: Int, vm_inner: VirtualMachine) = vm.pop()
    vm_inner = vm_inner.push(x)
    vm_inner.push(x)
  }
}

