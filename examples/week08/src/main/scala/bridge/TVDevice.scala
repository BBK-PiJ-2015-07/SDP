package bridge

// Concrete Implementor
// Here is an implementation of the EntertainmentDevice
// abstract class. I'm specifying what makes it different
// from other devices
case class TVDevice(newDeviceState: Int, newMaxSetting: Int) extends EntertainmentDevice {
  deviceState = newDeviceState
  maxSetting = newMaxSetting

  override def buttonFivePressed() {
    println("Channel Down")
    deviceState -= 1
  }

  override def buttonSixPressed() {
    println("Channel Up")
    deviceState += 1
  }
}
