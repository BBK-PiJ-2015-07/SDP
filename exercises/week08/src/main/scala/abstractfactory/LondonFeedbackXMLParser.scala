package abstractfactory

/**
  * Created by apinter on 21/04/2017.
  */
case class LondonFeedbackXMLParser() extends XMLParser {
  override def parse: String = {
    println("London Parsing Feedback XML...")
    "London Feedback XML Message"
  }
}