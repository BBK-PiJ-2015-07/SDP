package strategy

class Dog() extends Animal {
  setSound("Bark")
  // We set the Flys interface polymorphically
  // This sets the behavior as a non-flying Animal
  flyingType =  CantFly()

  def digHole() = println("Dug a hole")
}
