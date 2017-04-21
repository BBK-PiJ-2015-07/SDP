package bridge

// Concrete Implementor
// Here is an implementation of the EntertainmentDevice
// abstract class. I'm specifying what makes it different
// from other devices
case class DVDDevice(newDeviceState: Int, newMaxSetting: Int) extends EntertainmentDevice {
  deviceState = newDeviceState
  maxSetting = newMaxSetting

  override def buttonFivePressed() {
    println("DVD Skips to Chapter")
    deviceState -= 1
  }

  override def buttonSixPressed() {
    println("DVD Skips to Next Chapter")
    deviceState += 1
  }
}
