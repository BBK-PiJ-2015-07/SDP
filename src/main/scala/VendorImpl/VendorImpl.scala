package VendorImpl
import scala.io.Source
import scala.collection.immutable.Vector
import vendor._
import vendor.Instruction



/**
  * Created by davidasfaha on 25/02/2017.
  */
class VendorImpl extends ProgramParser {
  /**
    * Parses a file representation of a bytecode program
    * into an `InstructionList`.
    *
    * @param file the file to parse
    * @return an instruction list
    */
  override def parse(file: String): InstructionList = {
    var all_instructions = scala.io.Source.fromFile(file).mkString
    parseString(all_instructions)
  }

  /**
    * Parses a string representation of a bytecode program
    * into an `InstructionList`.
    *
    * @param string the string to parse
    * @return an instruction list
    */
  override def parseString(string: String): InstructionList = {
    
    var list = Vector[Instruction]()

    for(str <- string.split("\n")){
      if(!str.isEmpty()) {
        val instrStr = str.split("\\s+")
        var instrCode = instrStr(0)
        var args =  Vector();///[Int](instrStr.length-1)

        for(a <- 1 to instrStr.length){
          args :+ a.toInt
        }
        list :+ new Instruction(instrCode, args)
      }

    }
    list

  }

}

object Demo {
  def main(args: Array[String]) {
      val vi = new VendorImpl()
      vi.parse("asdfs")
  }
}

