package bridge

// Implementor
// With the Bridge Design Pattern you create 2 layers of abstraction
// In this example I'll have an abstract class representing
// different types of devices. I also have an abstract class
// that will represent different types of remote controls
// This allows me to use an infinite variety of devices and remotes
abstract class EntertainmentDevice {
  var deviceState: Int = 0
  var maxSetting: Int = 0
  var volumeLevel: Int = 0

  def buttonFivePressed()

  def buttonSixPressed()

  def deviceFeedback() {
    if (deviceState > maxSetting || deviceState < 0) {
      deviceState = 0
    }
    System.out.println("On Channel " + deviceState)
  }

  def buttonSevenPressed() {
    volumeLevel += 1
    System.out.println("Volume at: " + volumeLevel)
  }

  def buttonEightPressed() {
    volumeLevel -= 1
    System.out.println("Volume at: " + volumeLevel)
  }
}
