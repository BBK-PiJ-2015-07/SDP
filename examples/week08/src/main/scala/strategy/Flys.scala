package strategy

// The interface is implemented by many other
// subclasses that allow for many types of flying
// without effecting Animal, or Flys.
// Classes that implement new Flys interface
// subclasses can allow other classes to use
// that code eliminating code duplication
// I'm decoupling : encapsulating the concept that varies
trait Flys {
  def fly: String
}

// Class used if the Animal can fly
case class ItFlys() extends Flys {
  override def fly: String = "Flying High"
}

//Class used if the Animal can't fly
case class CantFly() extends Flys {
  override def fly: String = "I can't fly"
}
