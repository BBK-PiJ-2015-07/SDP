package builder

// The concrete builder class that assembles the parts
// of the finished Robot object
case class OldRobotBuilder() extends RobotBuilder {
  private val robot: Robot = Robot()

  override def buildRobotHead() = robot.setRobotHead("Tin Head")

  override def buildRobotTorso() = robot.setRobotTorso("Tin Torso")

  override def buildRobotArms() = robot.setRobotArms("Blowtorch Arms")

  override def buildRobotLegs() = robot.setRobotLegs("Rollar Skates")

  override def getRobot: Robot = robot
}
