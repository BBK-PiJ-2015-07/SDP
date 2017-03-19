package VendorImpl
import java.io
import java.io.{FileNotFoundException, IOException}
import java.lang.NumberFormatException

import scala.io.Source
import scala.collection.immutable.Vector
import vendor._
import vendor.Instruction



/**
  * Created by davidasfaha on 25/02/2017.
  * A vendor implementation of ProgramParser which parses a file or string containing a sequence
  * of bytecode programs in textual format.
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
    //TODO
    //Needs try-catch block?
    try {
      var all_instructions = scala.io.Source.fromFile(file).mkString
      parseString(all_instructions)
    } catch {
      case ex @ (_ : FileNotFoundException | _ : IOException) => ex.printStackTrace(); throw ex
    }
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
        val instrCode = instrStr(0)

        var args =  Vector[Int]()

        for(i <- 1 to instrStr.length-1){
          try {
            args = args :+ instrStr(i).toInt
          }catch {
            case e: NumberFormatException => throw new InvalidInstructionFormatException("Invalid instruction input: " + instrStr(i))
          }
        }
        list = list :+ new Instruction(instrCode, args)
      }
    }
    list

  }

}

