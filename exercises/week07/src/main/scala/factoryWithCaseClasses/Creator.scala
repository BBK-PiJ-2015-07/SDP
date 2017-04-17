package factoryWithCaseClasses

import factoryWithCaseClasses.Product.ConcreteProduct

/**
  * Created by Case on 17/04/2017.
  */
sealed trait Creator {
//  def makeProduct: Product = new Product("DefaultConcreteProductName", 99)
}


/*object Creator {
  case class ConcreteCreator private[Creator] (productName: String, productCode: Int) extends Creator {

    override def makeProduct: Product = new ConcreteProduct(productName, productCode)
    //def getProductName: String = this.name
    //def getProductCode: Int = this.code
  }
}
*/