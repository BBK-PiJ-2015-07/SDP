package builder

object TestRobotBuilder extends App {
    val oldStyleRobot: RobotBuilder = OldRobotBuilder()
    val robotEngineer: RobotEngineer = RobotEngineer(oldStyleRobot)

    robotEngineer.makeRobot()
    val firstRobot: Robot = robotEngineer.getRobot

    robotEngineer.makeRobot()
    robotEngineer.makeRobot()
    robotEngineer.makeRobot()
    val secondRobot: Robot = robotEngineer.getRobot

    println("r1 hash: " + firstRobot.hashCode())
    println("r2 hash: " + secondRobot.hashCode())

    val oldStyleRobot2: RobotBuilder = OldRobotBuilder()
    val robotEngineer2: RobotEngineer = RobotEngineer(oldStyleRobot2)
    robotEngineer2.makeRobot()
    val thirdRobot: Robot = robotEngineer2.getRobot
    println("r3 hash: " + thirdRobot.hashCode())

    println("first third robot ref eq " + (firstRobot eq thirdRobot))

    /*println("Robot Built")
    println("Robot Head Type: " + firstRobot.getRobotHead)
    println("Robot Torso Type: " + firstRobot.getRobotTorso)
    println("Robot Arm Type: " + firstRobot.getRobotArms)
    println("Robot Leg Type: " + firstRobot.getRobotLegs)*/
}
