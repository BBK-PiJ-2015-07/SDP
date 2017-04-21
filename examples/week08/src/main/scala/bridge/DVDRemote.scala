package bridge

// Refined Abstraction
// If I decide I want to further extend the remote I can
case class DVDRemote(newDevice: EntertainmentDevice) extends RemoteButton(newDevice) {
  private var play: Boolean = true

  override def buttonNinePressed() {
    play = !play
    println("DVD is Playing: " + play)
  }
}
