package ByteCodeImpl

import bc.{ByteCode, ByteCodeFactory, ByteCodeValues, InvalidBytecodeException}

/**
  * Created by Case on 25/02/2017.
  */
class ByteCodeFactoryImpl extends ByteCodeFactory{
  var lookUp: ByteCodeLookUp = new ByteCodeLookUp()

  /**
    * Returns a [[ByteCode]].
    *
    * This method creates a new [[ByteCode]] object given the `byte`
    * that corresponds to the bytecode (see [[bc.ByteCodeValues]]. If
    * the bytecode requires arguments then an optional integer
    * argument is provided.
    *
    * This method should throw an [[bc.InvalidBytecodeException]] if the
    * given bytecode value is unknown.
    *
    * @param byte the byte code of a bytecode
    * @param args an optional integer argument (depends on bytecode)
    * @return a new bytecode object
    */
  override def make(byte: Byte, args: Int*): ByteCode = {
    val name = lookUp.bytecodeInverse.get(byte).getOrElse("").toLowerCase
    if(name.isEmpty)
      throw new InvalidBytecodeException("Unrecognised byte code.")

    var byteCode: ByteCode = Class.forName(name).newInstance().asInstanceOf[ByteCode]
    var constrs = byteCode.getClass.getConstructors()
    var constr = constrs(0)





    new Print
  }
}



