package abstractfactory

/**
  * Created by apinter on 21/04/2017.
  */
case class LondonOrderXMLParser() extends XMLParser {
  override def parse: String = {
    println("London Parsing Order XML")
    "London Order XML Message"
  }
}