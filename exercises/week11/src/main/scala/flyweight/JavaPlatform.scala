package flyweight

/**
  * Created by apinter on 28/04/2017.
  */
class JavaPlatform extends Platform{

    println("JavaPlatform object created")

    override def execute(code: Code): Unit = println("Compiling and executing Java code.")
}
