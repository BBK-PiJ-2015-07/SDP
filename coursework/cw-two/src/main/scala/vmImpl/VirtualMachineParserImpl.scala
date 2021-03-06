package vmImpl

import ByteCodeImpl.{ByteCodeLookUp, ByteCodeParserImpl}
import VendorImpl.VendorImpl
import bc.{ByteCode, InvalidBytecodeException}
import vendor.{Instruction, ProgramParser}
import vm._

import scala.collection.mutable.ListBuffer

/**
  * Created by davidasfaha on 04/03/2017.
  * Implementation of VirtualMachineParser. It is used to parse a file of bytecode
  * instructions (as defined by [[vendor.ProgramParser]]).
  */
class VirtualMachineParserImpl extends VirtualMachineParser {

  var vendorParser = new VendorImpl()
  var byteCodeParser = new ByteCodeParserImpl()
  var lookup = new ByteCodeLookUp()

  /**
    * Returns a vector of [[bc.ByteCode]].
    *
    * This method parses a file into a vector of bytecode objects.
    * Note, this method should throw a [[bc.InvalidBytecodeException]]
    * if it fails to parse a program file correctly.
    *
    * @param file the file containing a program
    * @return a vector of bytecodes
    */
  override def parse(file: String): Vector[ByteCode] = {
    val instructions = vendorParser.parse(file)
    parseInstructions(instructions)
  }

  /**
    * Returns a vector of [[bc.ByteCode]].
    *
    * This method parses a string into a vector of bytecode objects.
    * Note, this method should throw a [[bc.InvalidBytecodeException]]
    * if it fails to parse a program string correctly.
    *
    * @param str a string containing a program
    * @return a vector of bytecodes
    */
  override def parseString(str: String): Vector[ByteCode] = {
    val instructions = vendorParser.parseString(str)
    parseInstructions(instructions)
  }

private def  parseInstructions ( instructions: Vector[Instruction]): Vector[ByteCode] = {
    var byteCodes = List[Byte]()

    for(i <- instructions){
      val instrCode: Byte = lookup.bytecode.getOrElse(i.name, 0)
      val args: List[Byte] = i.args.map(x => x.toByte).toList

      //if bytecode instruction doesn't exist OR the instruction is "iconst" without an argument -> throw InvalidBytecodeException.
      if((instrCode == 0) || (instrCode == 1 && args.length == 0)){ throw new InvalidBytecodeException("Invalid ByteCode!") }

      byteCodes = byteCodes ::: (instrCode :: List()) ::: args
    }
    byteCodeParser.parse(byteCodes.toVector)
  }
}
