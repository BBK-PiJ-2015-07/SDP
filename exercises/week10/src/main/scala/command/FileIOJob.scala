package command

class FileIOJob extends Job {

  var fileIO: Option[FileIO] = None

  def setFileIO(fileIO: FileIO): Unit = this.fileIO = fileIO

  override def run(): Unit = fileIO match {
    case Some(fileIO) => fileIO.execute()
    case _ => println("No FileIO instance set in FileIOJob"); throw new RuntimeException("No FileIO instance set in FileIOJob.")
  }
}