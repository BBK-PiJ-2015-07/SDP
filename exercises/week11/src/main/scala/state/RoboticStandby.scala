package state

case class RoboticStandby(r: Robot) extends RoboticState {
  def walk(): Unit = {
    println("In standby.")
    r.state = r.roboticOn
    println("Walking...")
  }
  def cook(): Unit = {
    println("In standby.")
    r.state = r.roboticCook
    println("Cooking...")
  }
  def off(): Unit = {
    println("In standby.")
    r.state = r.roboticOff
    println("Robot is Off.")
  }
}
