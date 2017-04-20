package decorator

class Spinach(val pizza: Pizza) extends PizzaDecorator (pizza) {

  var ownDesc: String = ", Spinach"
  var ownPrice: Double = 0.20

  override def getDesc: String = pizza.getDesc + ownDesc
  override def getPrice: Double = pizza.getPrice + ownPrice
}