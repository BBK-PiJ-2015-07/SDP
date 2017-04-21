package strategy

class Bird() extends Animal {
  setSound("Tweet")
  // We set the Flys interface polymorphically
  // This sets the behavior as a non-flying Animal
  flyingType = ItFlys()
}
