package VendorImpl

import vendor.{Instruction, ProgramParser}
/**
  * Created by davidasfaha on 25/02/2017.
  */
class VendorParser extends ProgramParser {
  override type InstructionList = Vector[Instruction]


  def parse(file: String): InstructionList = {
    var i = Instruction("A",scala.collection.immutable.Vector.empty)
  }


  def parseString(string: String): InstructionList {

  }

}
