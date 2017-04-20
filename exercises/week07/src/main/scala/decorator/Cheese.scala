package decorator

class Cheese(val pizza: Pizza) extends PizzaDecorator (pizza) {
  var ownDesc: String = ", Cheese"
  var ownPrice: Double = 1.50

  override def getDesc: String = pizza.getDesc + ownDesc
  override def getPrice: Double = pizza.getPrice + ownPrice
}
