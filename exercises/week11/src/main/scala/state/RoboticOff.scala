package state

case class RoboticOff(r: Robot) extends RoboticState {
  def walk(): Unit = {
    r.state = r.roboticOn
    println("Walking...")
  }
  def cook(): Unit = {
    println("Cannot cook at Off state.")
  }
  def off(): Unit = {
    println("Robot already in Off state.")
  }
}
