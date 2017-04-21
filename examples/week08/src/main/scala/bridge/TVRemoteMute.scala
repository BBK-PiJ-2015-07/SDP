package bridge

// Refined Abstraction
// If I decide I want to further extend the remote I can
class TVRemoteMute(val newDevice: EntertainmentDevice) extends RemoteButton(newDevice) {
  def buttonNinePressed() {
    System.out.println("TV was Muted")
  }
}
