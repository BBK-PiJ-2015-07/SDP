package abstractfactory

object EnemyShipTesting extends App {
    // EnemyShipBuilding handles orders for new EnemyShips
    // You send it a code using the orderTheShip method &
    // it sends the order to the right factory for creation
    val MakeUFOs: EnemyShipBuilding = new UFOEnemyShipBuilding
    val theGrunt: EnemyShip = MakeUFOs.orderTheShip("UFO")
    println(theGrunt + "\n")
    val theBoss: EnemyShip = MakeUFOs.orderTheShip("UFO BOSS")
    println(theBoss + "\n")
}
