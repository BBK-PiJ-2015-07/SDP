package ByteCodeImpl

import bc.ByteCodeValues

/**
  * A lookup of bytecode to name
  */
class ByteCodeLookUp extends ByteCodeValues{

  /**
    * A map of instruction names corresponding to bytes.
    */
  val bytecodeInverse = this.bytecode.map(_.swap)


}