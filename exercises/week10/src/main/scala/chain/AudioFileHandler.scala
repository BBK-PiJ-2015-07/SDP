package chain

/**
  * File handler
  * @param s The name of the Handler. Format should be filetype + " Handler"
  */
case class AudioFileHandler(s: String) extends Handler {

  var handler: Option[Handler] = None

  /*
  //The following fields along with the class naming convention described in the javadoc could be used to create a general Handler implementation.
  //The first pattern match in the process() function would match against Str.
  val handlerStr = " Handler"
  val handlerStrLength = handlerStr.length()
  val Str = getHandlerName.dropRight(handlerStrLength).toLowerCase()*/

  override def setHandler(handler: Handler): Unit = this.handler = Some(handler)

  override def process(file: File): Unit = file.fileType match {
    case "audio" => println("Process and saving audio file... by " + getHandlerName())
    case _ => handler match {
      case Some(handler) => println(getHandlerName() + " forwards the request to " + handler.getHandlerName()); handler.process(file)
      case None => println("File not supported")
    }
  }

  override def getHandlerName(): String = this.s
}