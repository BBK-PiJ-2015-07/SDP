package chain

case class AudioFileHandler(s: String) extends Handler {

  var handler: Option[Handler] = None
  val handlerStr = " Handler"
  val handlerStrLength = handlerStr.length()
  val Str = getHandlerName.dropRight(handlerStrLength).toLowerCase()

  override def setHandler(handler: Handler): Unit = this.handler = Some(handler)

  override def process(file: File): Unit = file.fileType match {
    case Str => println("Process and saving " + Str + " file... by " + getHandlerName())
    case _ => handler match {
      case Some(handler) => println(getHandlerName() + " forwards the request to " + handler.getHandlerName()); handler.process(file)
      case None => println("File not supported")
    }
  }

  override def getHandlerName(): String = this.s
}