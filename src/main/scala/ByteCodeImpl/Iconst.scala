package ByteCodeImpl

import bc.{ByteCode, ByteCodeValues}
import vm.VirtualMachine
/**
  * Created by davidasfaha on 25/02/2017.
  */
class Iconst(value: Int) extends ByteCode with ByteCodeArity {

  /**
    * A unique byte value representing the bytecode. An implementation
    * will set this to the bytecode corresponding to the name of the
    * bytecode in [[ByteCodeValues]]
    */
  override val code: Byte = bytecode.get("iconst").get
  argnum = 1

  /**
    * Returns a new [[VirtualMachine]] after executing this bytecode operation.
    *
    * @param vm the initial virtual machine
    * @return a new virtual machine
    */
  override def execute(vm: VirtualMachine): VirtualMachine = vm.push(value)
}
