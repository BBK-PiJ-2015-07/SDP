package builder

// The concrete Robot class based on the RobotPlan interface
case class Robot() extends RobotPlan {
  private var robotHead: String = null
  private var robotTorso: String = null
  private var robotArms: String = null
  private var robotLegs: String = null

  def getRobotHead: String = robotHead

  override def setRobotHead(head: String) = {
    robotHead = head
  }

  def getRobotTorso: String = robotTorso

  override def setRobotTorso(torso: String) {
    robotTorso = torso
  }

  def getRobotArms: String = robotArms

  override def setRobotArms(arms: String) {
    robotArms = arms
  }

  def getRobotLegs: String = robotLegs

  override def setRobotLegs(legs: String) {
    robotLegs = legs
  }
}
