package builder

// The director / engineer class creates a Robot using the
// builder interface that is defined (OldRobotBuilder)
case class RobotEngineer(var robotBuilder: RobotBuilder) {
  // OldRobotBuilder specification is sent to the engineer
  // Return the Robot made from the OldRobotBuilder spec
  def getRobot: Robot = robotBuilder.getRobot

  // Execute the methods specific to the RobotBuilder
  // that implements RobotBuilder (OldRobotBuilder)
  def makeRobot() {
    robotBuilder.buildRobotHead()
    robotBuilder.buildRobotTorso()
    robotBuilder.buildRobotArms()
    robotBuilder.buildRobotLegs()
  }
}
