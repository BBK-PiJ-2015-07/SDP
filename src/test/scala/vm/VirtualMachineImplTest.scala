package vm

/**
  * Created by Andras on 19/03/2017.
  * To Test VirtualMachineImpl - the implementation of the VirtualMachine trait
  */

import org.scalatest.{BeforeAndAfterEach, FunSuite}
import vmImpl._

class VirtualMachineImplTest extends FunSuite with BeforeAndAfterEach{
  var vm = new VirtualMachineImpl
  override def beforeEach() { vm = new VirtualMachineImpl }

  test("New virtual machine is initiated with an empty stack."){
    assert(vm.state.isEmpty)
  }




}
