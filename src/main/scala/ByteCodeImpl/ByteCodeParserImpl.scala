package ByteCodeImpl

import bc.{ByteCode, ByteCodeParser, ByteCodeFactory}

/**
  * Created by davidasfaha on 04/03/2017.
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
      //if(!) {
        var curr = bc(i)
        if (curr == 1) {
          byteCodes = byteCodes :+ factory.make(bc(i), bc(i + 1).toInt)
          wasIconst = true

        } else if(curr != 1) {
          if(wasIconst)
            wasIconst = false
          else
            byteCodes = byteCodes :+ factory.make(bc(i))

        }
    }
    byteCodes.toVector
  }
}
