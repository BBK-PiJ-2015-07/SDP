package decorator

class SimplyVegPizza extends Pizza {
  val desc: String = "SimplyVegPizza"
  val price: Double = 5.00

  def getDesc: String = desc
  def getPrice: Double = price
}
