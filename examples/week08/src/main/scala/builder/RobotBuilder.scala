package builder

// Defines the methods needed for creating parts
// for the robot
trait RobotBuilder {
  def buildRobotHead()

  def buildRobotTorso()

  def buildRobotArms()

  def buildRobotLegs()

  def getRobot: Robot
}
