package decorator

class Meat(val pizza: Pizza) extends PizzaDecorator (pizza) {

  var ownDesc: String = ", Meat"
  var ownPrice: Double = 3.00

  override def getDesc: String = pizza.getDesc + ownDesc
  override def getPrice: Double = pizza.getPrice + ownPrice
}