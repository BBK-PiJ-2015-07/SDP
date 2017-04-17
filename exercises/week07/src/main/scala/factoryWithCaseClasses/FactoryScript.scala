package factoryWithCaseClasses

import factoryWithCaseClasses.Product._
import factoryWithCaseClasses.Creator._

/**
  * Created by Case on 17/04/2017.
  */
object FactoryScript extends App{

  def getProductInfo(p: Product) = p match {
    case ConcreteProduct(name, code) => println("ConcreteProduct name: " + name + " - code: " + code)
    case OtherConcreteProduct(name, code, otherFeature) => println("OtherConcreteProduct name: " + name + " - code: " + code + " - otherFeature: " + otherFeature)
  }

  //-------------------------  Factory pattern with Creator -------------------------------------
  val concreteCreatorTwoParam: Creator = ConcreteCreator("CreatedByConcreteCreatorWithTwoParams", 50,  None: Option[String])
  val concreteCreatorThreeParam: Creator = ConcreteCreator("CreatedByConcreteCreatorWithThreeParams", 60, Some("otherFeatureNameConcreteCreatorThreeParam"))

  val p1: Product = concreteCreatorTwoParam.makeProduct
  val p2: Product = concreteCreatorThreeParam.makeProduct

  println("\nTesting product p1 (should be ConcreteProduct with name = CreatedByConcreteCreatorWithTwoParams):")
  getProductInfo(p1)

  println("\nTesting product p2 (should be OtherConcreteProduct with CreatedByConcreteCreatorWithThreeParams):")
  getProductInfo(p2)
}

