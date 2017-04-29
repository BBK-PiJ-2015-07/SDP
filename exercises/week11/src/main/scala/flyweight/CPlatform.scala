package flyweight

/**
  * Created by apinter on 28/04/2017.
  */
class CPlatform extends  Platform{

    println("CPlatform object created")

    override def execute(code: Code): Unit = println("Compiling and executing C code.")
}
