package ByteCodeImpl

import bc.ByteCodeValues

/**
  * Created by Case on 25/02/2017.
  */
class ByteCodeLookUp extends ByteCodeValues{

  /**
    * A map of instruction names corresponding to bytes.
    */
  val bytecodeInverse = this.bytecode.map(_.swap)


}