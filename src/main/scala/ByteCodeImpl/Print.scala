package ByteCodeImpl

import bc.ByteCode
import vm.VirtualMachine

/**
  * Created by davidasfaha on 25/02/2017.
  */
class Print extends ByteCode {
  /**
    * A unique byte value representing the bytecode. An implementation
    * will set this to the bytecode corresponding to the name of the
    * bytecode in [[bc.ByteCodeValues]]
    */
  override val code: Byte = bytecode.get("print").get

  /**
    * Returns a new [[VirtualMachine]] after executing this bytecode operation.
    *
    * @param vm the initial virtual machine
    * @return a new virtual machine
    */
  override def execute(vm: VirtualMachine): VirtualMachine = {
    val (x: Int, vm1: VirtualMachine) = vm.pop()
    println(x)
    vm1
  }
}
