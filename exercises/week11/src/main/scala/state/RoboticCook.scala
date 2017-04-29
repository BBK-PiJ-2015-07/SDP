package state

case class RoboticCook(r: Robot) extends RoboticState {
  def walk(): Unit = {
    println("Walking...")
    r.state = r.roboticOn
  }
  def cook(): Unit = {
    println("Cooking...")
  }
  def off(): Unit = {
    println("Cannot turn Robot off when in Cooking State...")
  }
}
