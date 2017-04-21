package abstractfactory

/**
  * Created by apinter on 21/04/2017.
  */
case class NYCOrderXMLParser() extends XMLParser{
  override def parse: String = {
    println("NYC Parsing Order XML...")
    "NYC Order XML Message"
  }
}
