package ByteCodeImpl

import bc.ByteCodeValues

/**
  * Created by Case on 25/02/2017.
  */
class ByteCodeLookUp extends ByteCodeValues{

  val bytecodeInverse = this.bytecode.map(_.swap)

}
