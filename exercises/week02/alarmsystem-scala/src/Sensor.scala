trait Sensor {
  def isTriggered: Boolean

  def getLocation: String

  def getSensorType: String

  def isHazardSensor: Boolean

}
