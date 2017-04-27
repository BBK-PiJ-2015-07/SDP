package mediator

class Heater extends Colleague {

  private var mediator: MachineMediator = _
  override def setMediator(mediator: MachineMediator): Unit = this.mediator  = mediator

  def on(temp: Int): Unit = {
    println("Heater is on...")
    if(mediator.checkTemperature(temp)){
      println("Temperature is set to " + temp + "C.")
      mediator.off()
    }else{
      mediator.on()
    }
  }

  def off(): Unit = {
    println("Heater is off...")
    mediator.wash()
  }
}