package bridge

// Abstraction
// This is an abstract class that will represent numerous
// ways to work with each device
abstract class RemoteButton(// A reference to a generic device using aggregation
                            var theDevice: EntertainmentDevice) {
  def buttonFivePressed() = theDevice.buttonFivePressed

  def buttonSixPressed() = theDevice.buttonSixPressed

  def deviceFeedback() = theDevice.deviceFeedback

  def buttonNinePressed()
}
