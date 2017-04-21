package builder

object TestBuilderPattern {
  def main(args: Array[String]) {
    var carBuilder: CarBuilder = SedanCarBuilder
    var director: CarDirector = CarDirector(carBuilder)


    director.build
    //println(carBuilder.getCar)

    val car1: Car = carBuilder.getCar

    director.build

    val car2: Car = carBuilder.getCar


    println("car1 hash: " + car1.hashCode())
    println("car2 hash: " + car2.hashCode())


    /*carBuilder = SportsCarBuilder
    director = CarDirector(carBuilder)

    director.build
    println(carBuilder.getCar)*/
  }
}
