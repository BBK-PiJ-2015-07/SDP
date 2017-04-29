package flyweight

/**
  * Created by apinter on 28/04/2017.
  */
class RubyPlatform extends Platform{

    println("RubyPlatform object created")

    override def execute(code: Code): Unit = println("Compiling and executing Ruby code.")
}
