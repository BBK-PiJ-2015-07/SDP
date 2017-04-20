package decorator

/**
  * Created by apinter on 20/04/2017.
  */
abstract class PizzaDecorator (protected var basePizza: Pizza) extends Pizza {

  override def getDesc: String = basePizza.getDesc
  override def getPrice: Double = basePizza.getPrice
}
