import scala.io.StdIn._

trait Instruction {
    def action(name:String*): String
}

trait Add extends Instruction
trait Sub extends Instruction

case class AddImpl(s: String, i: Int) extends Add {
    def action(name: String*): String = s"Executing an instruction $name"
//    def action(name: String, anotherName: String)

}

object FooMain extends App {
    print("Enter a class name: ")
    val name = readLine 
    try {
        Class.forName(name)
        val className = name + "Impl"
        try {
            val actualClass = Class.forName(className)
            var args: Array[Object] = Array("asdasd", new Integer(3))
            val cons = actualClass.getConstructors
            val con = cons(0)
            val params = con.getParameterTypes
            println(con)
            println(params)
            val foo = con.newInstance(args: _*).asInstanceOf[Instruction]

//            val foo = actualClass.newInstance().asInstanceOf[Instruction]
            println(foo)
            println(foo.action("Crash the machine!"))
        }
        catch {
            case ex: ClassNotFoundException =>
                println(s"No implementation for [$name] found")
        }
    }
    catch {
        case ex: ClassNotFoundException => 
            println(s"No class of instruction [$name]")
    }
}