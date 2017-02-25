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
    //var all_instructions = scala.io.Source.fromFile(file).mkString
    parseString("aaaa\nbbbb")
  }

  /**
    * Parses a string representation of a bytecode program
    * into an `InstructionList`.
    *
    * @param string the string to parse
    * @return an instruction list
    */
  override def parseString(string: String): InstructionList = {
    // TODO - error checking tests
    string.split("\n").foreach(println(_))

    val vector = scala.collection.immutable.Vector.empty
    println(vector)

    // Add new value at end of vector.
    val vector2 = vector :+ 5
    println(vector2)

    Vector( new Instruction("asads", vector2))
  }

  def main(args: Array[String]): Unit =
    parse("asdasda")
}
