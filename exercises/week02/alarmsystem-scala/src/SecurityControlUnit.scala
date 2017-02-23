import scala.collection.mutable.ListBuffer
import java.util.Calendar

/**
  * Created by Case on 23/02/2017.
  */
  class SecurityControlUnit(sensors: ListBuffer[Sensor]) extends ControlUnit(sensors){
    private var _sensors: ListBuffer[Sensor] = _
    private var _startTime: Int = 22
    private var _endTime: Int = 6


    def SecurityControlUnit(sensors: ListBuffer[Sensor]) ={
      _sensors = sensors
    }



    override def pollSensors(): Unit = {
      val now = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)

      if(now >= _startTime && now <= _endTime)
        super.pollSensors()
    }
}
