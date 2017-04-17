package factoryWithCaseClasses

/**
  * Created by Case on 17/04/2017.
  */
sealed trait Product {

}


object Product {
  case class ConcreteProduct private[Product] (name: String, code: Int) extends Product {
    def apply(name: String, code: Int): ConcreteProduct = ConcreteProduct(name, code)
    //def getProductName: String = this.name
    //def getProductCode: Int = this.code
  }
  case class OtherConcreteProduct private[Product] (name: String, code: Int, otherFeature: String) extends Product{
    def apply(name: String, code: Int, otherFeature: String): OtherConcreteProduct = OtherConcreteProduct(name, code, otherFeature)
    //def getProductName: String = this.name
    //def getProductCode: Int = this.code
    //def getOtherFeature: String = this.otherFeature
  }
}