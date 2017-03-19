package ByteCodeImpl

import bc.{ByteCode, ByteCodeFactory, ByteCodeValues, InvalidBytecodeException}
import java.lang.Class
import java.lang.reflect.Constructor

/*
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

    val name = lookUp.bytecodeInverse.getOrElse(byte,"").capitalize

    if(name.isEmpty)
      throw new InvalidBytecodeException("Unrecognised byte code.")

    var thisByteCode = Class.forName("ByteCodeImpl." + name)
    var constrs = thisByteCode.getConstructors
    var paramCount = constrs(0).getParameterCount
    var thisByteCodeConstructor = constrs(0)

    var commandByteCode : Any = None

    if (paramCount==1) {
      commandByteCode = thisByteCodeConstructor.newInstance(Int.box(args(0)))
    }else{
      commandByteCode  = thisByteCodeConstructor.newInstance()
    }

    commandByteCode.asInstanceOf[ByteCode]

  }



}



