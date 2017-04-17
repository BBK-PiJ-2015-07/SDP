package factoryWithCaseClasses

import factoryWithCaseClasses.Product._

/**
  * Created by Case on 17/04/2017.
  */
object FactoryScript extends App{
  val firstProduct: Product = ConcreteProduct ("firstProductNmae", 10)
  val secondProduct:  Product = OtherConcreteProduct("secondProductName", 20, "secondProductOtherFeature")

  def getProductInfo(p: Product) = p match {
    case ConcreteProduct(name, code) => println("ConcreteProduct name: " + name + " - code: " + code)
    case OtherConcreteProduct(name, code, otherFeature) => println("OtherConcreteProduct name: " + name + " - code: " + code + " - otherFeature: " + otherFeature)
  }


  println("Testing first product here (should be ConcreteProduct):")
  getProductInfo(firstProduct)

  println("\nTesting second product here (should be OtherConcreteProduct):")
  getProductInfo(secondProduct)

}

