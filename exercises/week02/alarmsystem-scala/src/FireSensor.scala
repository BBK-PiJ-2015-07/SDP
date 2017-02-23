import scala.util.Random

class FireSensor extends Sensor with UsesBattery {

  private var _location: String = _
  private var _battery: Double = _
  private val _sensorType: String = "Fire Sensor"
  private val _isHazardSensor: Boolean = true

  def FireSensor(location: String, battery: Double) ={
    this._location = location
    this._battery = battery
  }





  override def isHazardSensor: Boolean = _isHazardSensor

  override def isTriggered: Boolean = Random.nextInt(100) < 5

  override def getLocation: String = _location

  override def getSensorType: String = _sensorType

  override def getBatteryPercentage: Double = _battery match {
    case 0.0 => 0.0
    case _ => { _battery -= 10;
                _battery}
  }
}

object FireSensor