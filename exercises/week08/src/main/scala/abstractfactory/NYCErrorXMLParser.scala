package abstractfactory

/**
  * Created by Case on 20/04/2017.
  */
case class NYCErrorXMLParser() extends XMLParser {
  override def parse: String = {
    println("NYC Parsing Error XML...")
    "NYC Error XML Message"
  }
}
