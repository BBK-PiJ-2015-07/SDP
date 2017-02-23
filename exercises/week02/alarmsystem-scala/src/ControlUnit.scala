import scala.collection.mutable.ListBuffer

class ControlUnit(sensors: ListBuffer[Sensor]) {

  private var _sensors: ListBuffer[Sensor] = _

  def ControlUnit(sensors: ListBuffer[Sensor]){
    this._sensors = sensors
  }

  def pollSensors() {
    /*val sensors = new ListBuffer[Sensor]()
    sensors += new FireSensor()
    sensors += new SmokeSensor()*/

    for (sensor <- _sensors) {
      if (sensor.isTriggered) {
        System.out.println("A " + sensor.getSensorType + " sensor was triggered at " + sensor.getLocation)
      }
      else {
        System.out.println("Polled " + sensor.getSensorType + " at " + sensor.getLocation + " successfully")
      }
    }
  }
}

object ControlUnit
