package decorator

class SimplyNonVegPizza extends Pizza {
  val desc: String = "SimplyNonVegPizza"
  val price: Double = 7.00

  def getDesc: String = this.desc

  def getPrice: Double = this.price
}
