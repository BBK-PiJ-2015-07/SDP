package ByteCodeImpl

import bc.{ByteCode, ByteCodeFactory, ByteCodeParser}
import vm.MachineUnderflowException

/**
  * The byte code parser class
  */
class ByteCodeParserImpl extends ByteCodeParser {

  val factory = new ByteCodeFactoryImpl()

  /**
    * Parses a vector of `Byte` into a vector of `ByteCode`.
    *
    * You should use [[ByteCodeValues.bytecode]] to help translate
    * the individual `Byte`s into a correponding [[ByteCode]].
    *
    * @param bc a vector of bytes representing bytecodes
    * @return a vector of `ByteCode` objects
    */
  override def parse(bc: Vector[Byte]): Vector[ByteCode] = {
    var byteCodes: List[ByteCode] = List()

    var wasIconst = false

    for (i <-  0  until bc.length) {

        var curr = bc(i)
        if (curr == 1 && !wasIconst) {
          if (i + 1 == bc.length) {
            //TODO - DA - should be underflow?
            throw new MachineUnderflowException("The current instruction is iconst this is the end of the vector")
          }
          byteCodes = byteCodes :+ factory.make(bc(i), bc(i + 1).toInt)
          wasIconst = true

        } else if(curr != 1) {
          if(wasIconst)
            //if the previous byte code was iconst then skip this bytecode as it was processed previously
            wasIconst = false
          else
            byteCodes = byteCodes :+ factory.make(bc(i))

        } else{
          wasIconst = false

        }
    }
    byteCodes.toVector
  }
}
