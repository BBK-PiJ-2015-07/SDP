package decorator

class Ham(pizza: Pizza) extends PizzaDecorator (pizza) {

  var ownDesc: String = ", Ham"
  var ownPrice: Double = 2.00

  override def getDesc: String = pizza.getDesc + ownDesc
  override def getPrice: Double = pizza.getPrice + ownPrice
}
