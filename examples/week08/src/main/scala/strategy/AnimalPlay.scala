package strategy

object AnimalPlay extends App {
  val sparky: Animal = new Dog
  val tweety: Animal = new Bird

  println("Dog: " + sparky.tryToFly)
  println("Bird: " + tweety.tryToFly)

  // This allows dynamic changes for flyingType
  sparky.setFlyingAbility(new ItFlys)
  println("Dog: " + sparky.tryToFly)
}
