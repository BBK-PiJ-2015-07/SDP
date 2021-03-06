package factory

import bc.{ByteCodeFactory, ByteCodeParser}
import vendor.ProgramParser
import vm.{VirtualMachine, VirtualMachineParser}
import VendorImpl._
import ByteCodeImpl._
import vmImpl.{VirtualMachineImpl, VirtualMachineParserImpl}

/**
  * The `VirtualMachineFactory` follows the *factory pattern*. It provides
  * methods for each of the important parts in this assignment. You must
  * implement each method such that it returns an object of the correct type.
  */
object VirtualMachineFactory {
  // TODO
  def byteCodeFactory: ByteCodeFactory =
    new ByteCodeFactoryImpl

  def vendorParser: ProgramParser = { new VendorImpl()   }
  // TODO
  def byteCodeParser: ByteCodeParser = new ByteCodeParserImpl

  // TODO
  def virtualMachineParser: VirtualMachineParser = new VirtualMachineParserImpl

  // TODO
  def virtualMachine: VirtualMachine = new VirtualMachineImpl
}