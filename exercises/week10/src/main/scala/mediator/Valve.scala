package mediator

class Valve extends Colleague {

  private var mediator: MachineMediator = _
  override def setMediator(mediator: MachineMediator): Unit = this.mediator = mediator

  def open(): Unit = {
    println("Valve is opened...")
    mediator.
  }

  def closed(): Unit = {
    println("Valve is closed...")
    mediator.on()
  }

}