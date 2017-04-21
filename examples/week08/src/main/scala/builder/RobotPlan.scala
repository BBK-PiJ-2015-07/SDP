package builder

// This is the interface that will be returned from the builder
trait RobotPlan {
  def setRobotHead(head: String)

  def setRobotTorso(torso: String)

  def setRobotArms(arms: String)

  def setRobotLegs(legs: String)
}
