import scala.util.Random

class FireSensor extends Sensor {

  private val _location: String = "Lobby"
  private var _battery: Double = 100
  private val _sensorType: String = "Fire Sensor"

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