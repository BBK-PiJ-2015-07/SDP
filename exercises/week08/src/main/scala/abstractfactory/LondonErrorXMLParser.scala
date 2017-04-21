package abstractfactory

/**
  * Created by apinter on 21/04/2017.
  */
case class LondonErrorXMLParser() extends XMLParser {
  override def parse: String = {
    println("London Parsing Error XML...")
    "London Error XML Message"
  }
}
