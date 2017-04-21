package abstractfactory

abstract class EnemyShip {
  private[abstractfactory] var weapon: ESWeapon = null
  // Newly defined objects that represent weapon & engine
  // These can be changed easily by assigning new parts
  // in UFOEnemyShipFactory or UFOBossEnemyShipFactory
  private[abstractfactory] var engine: ESEngine = null
  private var name: String = null

  def makeShip()

  // Because I defined the toString method in engine
  // when it is printed the String defined in toString goes
  // on the screen
  def followHeroShip() = println(getName + " is following the hero at " + engine)

  def displayEnemyShip() = println(getName + " is on the screen")

  def enemyShipShoots() = println(getName + " attacks and does " + weapon)

  def getName: String = name

  def setName(newName: String) = {
    name = newName
  }

  // If any EnemyShip object is printed to screen this shows up
  override def toString: String =
    "The " + name + " has a top speed of " + engine + " and an attack power of " + weapon
}
