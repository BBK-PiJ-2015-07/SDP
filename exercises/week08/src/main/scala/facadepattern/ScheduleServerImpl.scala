package facadepattern

//TODO

case class ScheduleServerImpl() extends ScheduleServer {
  override def startBooting: Unit = println("Booting up.")

  override def readSystemConfigFile: Unit = println("Reading config")

  override def init: Unit = println("Initialising")

  override def initializeContext: Unit = println("Initialising context")

  override def initializeListeners: Unit = println("Initialising listeners")

  override def createSystemObjects: Unit = println("Creating sys objects")

  override def releaseProcesses: Unit = println("Release processes")

  override def destory: Unit = println("Destroying objects")

  override def destroySystemObjects: Unit = println("Destroying sys objects")

  override def destoryListeners: Unit = println("Destroying Listeners")

  override def destoryContext: Unit = println("Destroying Context")

  override def shutdown: Unit = println("Shutting down")
}