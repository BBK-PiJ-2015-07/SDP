package factoryWithCaseClasses

/**
  * Created by Case on 17/04/2017.
  */
sealed trait Product {
  def name: String
  def code: Int
}

object Product {
  //implemented two versions of concrete product to demonstrate the benefit of the Factory Pattern + wanted to do this using case classes.
  case class ConcreteProduct private[Product] (name: String, code: Int) extends Product
  case class OtherConcreteProduct private[Product] (name: String, code: Int, otherFeature: String) extends Product

  def apply(name: String, code: Int): ConcreteProduct = ConcreteProduct(name, code)
  def apply(name: String, code: Int, otherFeature: String): OtherConcreteProduct = OtherConcreteProduct(name, code, otherFeature)
}