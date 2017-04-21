package abstractfactory

// This is the only class that needs to change, if you
// want to determine which enemy ships you want to
// provide as an option to build
class UFOEnemyShipBuilding extends EnemyShipBuilding {
  override protected def makeEnemyShip(typeOfShip: String): EnemyShip = {
    var theEnemyShip: EnemyShip = null
    // If UFO was sent grab use the factory that knows
    // what types of weapons and engines a regular UFO
    // needs. The EnemyShip object is returned & given a name
    if (typeOfShip == "UFO") {
      val shipPartsFactory: EnemyShipFactory = UFOEnemyShipFactory()
      theEnemyShip = UFOEnemyShip(shipPartsFactory)
      theEnemyShip.setName("UFO Grunt Ship")
    } else {
      // If UFO BOSS was sent grab use the factory that knows
      // what types of weapons and engines a Boss UFO
      // needs. The EnemyShip object is returned & given a name if (typeOfShip == "UFO BOSS") {
      val shipPartsFactory: EnemyShipFactory = UFOBossEnemyShipFactory()
      theEnemyShip = UFOBossEnemyShip(shipPartsFactory)
      theEnemyShip.setName("UFO Boss Ship")
    }
    theEnemyShip
  }
}
