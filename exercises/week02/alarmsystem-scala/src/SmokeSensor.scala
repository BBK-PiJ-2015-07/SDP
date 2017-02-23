import scala.util.Random

class SmokeSensor extends Sensor {


  private val _location: String = "Smoking room"
  private var _battery: Double = 100
  private val _sensorType: String = "Smoke Sensor"

  override def isTriggered: Boolean = Random.nextInt(100) < 10

  override def getLocation: String = _location

  override def getSensorType: String = _sensorType

  override def getBatteryPercentage: Double = _battery match {
    case 0.0 => 0.0
    case _ => {
      _battery -= 20;
      _battery
    }
  }
}

object  SmokeSensor




