package ByteCodeImpl

import bc.ByteCode
import vm.VirtualMachine

/**
  * Created by davidasfaha on 25/02/2017.
  */
class Idec extends ByteCode  {
  /**
    * A unique byte value representing the bytecode. An implementation
    * will set this to the bytecode corresponding to the name of the
    * bytecode in [[bc.ByteCodeValues]]
    */
  override val code: Byte = bytecode.get("idec").get

  /**
    * Returns a new [[VirtualMachine]] after executing the decrement operation.
    *
    * @param vm the initial virtual machine
    * @return a new virtual machine
    */
  override def execute(vm: VirtualMachine): VirtualMachine = {

    var(x: Int, vm_inner: VirtualMachine) = vm.pop()
    vm_inner.push(x-1)

  }
}
