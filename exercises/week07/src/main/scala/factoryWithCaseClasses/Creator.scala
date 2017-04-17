package factoryWithCaseClasses

/**
  * Created by Case on 17/04/2017.
  */
sealed trait Creator {
  //default factory method as per exercise sheet
  def makeProduct: Product = Product("DefaultConcreteProductName", 99)
}

object Creator {
  case class ConcreteCreator(productName: String, productCode: Int, otherFeature: Option[String] = None) extends Creator {

    //overridden factory method as per exercise sheet
    override def makeProduct: Product = otherFeature match {
      case Some(otherFeature) => Product(productName, productCode, otherFeature)
      case None => Product(productName, productCode)
    }
  }
}
