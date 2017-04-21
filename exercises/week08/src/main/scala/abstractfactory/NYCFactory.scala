package abstractfactory

/**
  * Created by apinter on 21/04/2017.
  */
case class NYCFactory() extends AbstractParserFactory{
  override def getParserInstance(parserType: String): XMLParser = parserType match {
    case "NYCORDER" => NYCOrderXMLParser()
    case "NYCERROR" => NYCErrorXMLParser()
    case "NYCRESPONSE" => NYCResponseXMLParser()
    case "NYCFEEDBACK" => NYCFeedbackXMLParser()
    case _ => throw new ClassNotFoundException("Parser not implemnented")
  }
}
