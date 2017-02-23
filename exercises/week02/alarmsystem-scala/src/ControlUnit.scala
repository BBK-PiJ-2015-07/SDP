import scala.collection.mutable.ListBuffer

class ControlUnit {

  private var sensors: ListBuffer[Sensor] = _

  def ControlUnit(sensors: ListBuffer[Sensor]){
    this.sensors = sensors
  }

  def pollSensors() {
    /*val sensors = new ListBuffer[Sensor]()
    sensors += new FireSensor()
    sensors += new SmokeSensor()*/

    for (sensor <- sensors) {
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
