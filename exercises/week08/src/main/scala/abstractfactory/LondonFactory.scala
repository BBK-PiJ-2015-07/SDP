package abstractfactory

/**
  * Created by apinter on 21/04/2017.
  */
case class LondonFactory() extends AbstractParserFactory{
  override def getParserInstance(parserType: String): XMLParser = parserType match {
    case "LondonORDER" => LondonOrderXMLParser()
    case "LondonERROR" => LondonErrorXMLParser()
    case "LondonRESPONSE" => LondonResponseXMLParser()
    case "LondonFEEDBACK" => LondonFeedbackXMLParser()
    case _ => throw new ClassNotFoundException("Parser not implemnented");
  }
}