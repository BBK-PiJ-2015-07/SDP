package decorator

class SimplyVegPizza extends Pizza {
  val desc: String = "SimplyVegPizza"
  val price: Double = 5.00

  def getDesc: String = this.desc

  def getPrice: Double = this.price
}
