package decorator

class RomaTomatoes(val pizza: Pizza) extends PizzaDecorator (pizza) {

  var ownDesc: String = ", Roman Tomatoes"
  var ownPrice: Double = 0.50

  override def getDesc: String = pizza.getDesc + ownDesc
  override def getPrice: Double = pizza.getPrice + ownPrice
}