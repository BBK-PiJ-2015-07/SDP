package decorator

class GreenOlives(val pizza: Pizza) extends PizzaDecorator (pizza){
  var ownDesc: String = ", Green Olives"
  var ownPrice: Double = 1.00

  override def getDesc: String = pizza.getDesc + ownDesc
  override def getPrice: Double = pizza.getPrice + ownPrice
}
