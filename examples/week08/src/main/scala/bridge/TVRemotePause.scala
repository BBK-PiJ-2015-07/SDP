package bridge

// Refined Abstraction
// If I decide I want to further extend the remote I can
case class TVRemotePause(newDevice: EntertainmentDevice) extends RemoteButton(newDevice) {
  override def buttonNinePressed() = println("TV was Paused")
}
