package command

class LoggingJob extends Job {

  var logging: Option[Logging] = None
  def setLogging(logging: Logging): Unit = this.logging = Some(logging)

  override def run(): Unit = logging match {
    case Some(logging) => logging.log()
    case _ => println("No Logging set in LoggingJob."); throw new RuntimeException("No Logging set in LoggingJob.")
  }
}