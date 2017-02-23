import scala.util.Random

/**
  * Created by Case on 23/02/2017.
  */
class MotionSensor extends Sensor{

  private var _location: String = _
  private var _battery: Double = _
  private val _sensorType: String = "Motion Sensor"
  private val _sensorCategory: String = "Security"

  def MotionSensor(location: String, battery: Double) ={
    this._location = location
    this._battery = battery
  }

  override def getSensorCategory: String = _sensorCategory

  //Say triggered 5% of the time
  override def isTriggered: Boolean = Random.nextInt(100) < 5

  override def getLocation: String = _location

  override def getSensorType: String = _sensorType

}
