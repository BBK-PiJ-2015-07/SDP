package abstractfactory

// This factory uses the EnemyShipFactory interface
// to create very specific UFO Enemy Ship
// This is where we define all of the parts the ship
// will use by defining the methods implemented
// being ESWeapon and ESEngine
// The returned object specifies a specific weapon & engine
case class UFOBossEnemyShipFactory() extends EnemyShipFactory {
  // Defines the weapon object to associate with the ship
  override def addESGun: ESWeapon = ESUFOBossGun() // Specific to Boss UFO

  // Defines the engine object to associate with the ship
  override def addESEngine: ESEngine = ESUFOBossEngine()
}
