package bridge

// TODO

case class Motoren(product: Product, s: String) extends Car(product, s) {
  override def assemble: Unit =  println("Assembling " + product.productName + " for Motoren lm model")

  override def produceProduct: Unit = {
    product.produce
    println("Modifying product " + product.productName + " according to Motoren lm model")
  }

  override def printDetails: Unit = println("Car: Motoren lm model, Product: " + product.productName)
}
