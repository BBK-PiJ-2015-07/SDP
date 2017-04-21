package abstractfactory

/**
  * Created by apinter on 21/04/2017.
  */
case class LondonResponseXMLParser() extends XMLParser {
  override def parse: String = {
    println("London Parsing Response XML...")
    "London Response XML Message"
  }
}
