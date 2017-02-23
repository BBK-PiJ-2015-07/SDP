

import scala.util.Random

class SmokeSensor extends Sensor with UsesBattery{


  private var _location: String = _
  private var _battery: Double = _
  private val _sensorType: String = "Smoke Sensor"
  private val _isHazardSensor = true

  def SmokeSensor(location: String, battery: Double) ={
    this._location = location
    this._battery = battery
  }


  override def isTriggered: Boolean = Random.nextInt(100) < 10

  override def getLocation: String = _location

  override def getSensorType: String = _sensorType


  override def isHazardSensor: Boolean = _isHazardSensor

  override def getBatteryPercentage: Double = _battery match {
    case 0.0 => 0.0
    case _ => {
      _battery -= 20;
      _battery
    }
  }
}

object  SmokeSensor




