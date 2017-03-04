package ByteCodeImpl

import bc.ByteCode
import vm.VirtualMachine

/**
  * Created by davidasfaha on 25/02/2017.
  */
class Iswap extends ByteCode  with ByteCodeArity {
  /**
    * A unique byte value representing the bytecode. An implementation
    * will set this to the bytecode corresponding to the name of the
    * bytecode in [[bc.ByteCodeValues]]
    */
  override val code: Byte = bytecode.get("iswap").get

  /**
    * Returns a new [[VirtualMachine]] after executing this bytecode operation.
    *
    * @param vm the initial virtual machine
    * @return a new virtual machine
    */
  override def execute(vm: VirtualMachine): VirtualMachine = {

    var(x: Int, vm_inner: VirtualMachine) = vm.pop()
    var(y: Int, vm_inner2: VirtualMachine) = vm_inner.pop()

    vm_inner2 = vm_inner2.push(x)
    vm_inner2.push(y)

  }
}
