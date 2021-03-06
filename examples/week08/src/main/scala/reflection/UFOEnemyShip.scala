package reflection

import abstractfactory.{EnemyShip, EnemyShipFactory}

case class UFOEnemyShip(// We define the type of ship we want to create
                        // by stating we want to use the factory that
                        // makes enemy ships
                        var shipFactory: EnemyShipFactory) extends EnemyShip {
  // The enemy ship required parts list is sent to
  // this method. They state that the enemy ship
  // must have a weapon and engine assigned. That
  // object also states the specific parts needed
  // to make a regular UFO versus a Boss UFO
  // EnemyShipBuilding calls this method to build a
  // specific UFOEnemyShip
  override def makeShip() {
    println("Making enemy ship " + getName)
    // The specific weapon & engine needed were passed in
    // shipFactory. We are assigning those specific part
    // objects to the UFOEnemyShip here
  }

  private def getOtherPrivate(str: String): String = "Test"
}
