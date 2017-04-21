package builder

object TestBuilderPattern {
  def main(args: Array[String]) {
    var carBuilder: CarBuilder = SedanCarBuilder
    var director: CarDirector = CarDirector(carBuilder)


    director.build
    println(carBuilder.getCar)
    val car1: Car = carBuilder.getCar

    director.build
    val car2: Car = carBuilder.getCar

    println("\ncar1 hash: " + car1.hashCode())
    println("car2 hash: " + car2.hashCode())
    println("car1 eq car2: " + (car1 eq car2))

    carBuilder = SportsCarBuilder
    director = CarDirector(carBuilder)

    director.build
    val car3: Car = carBuilder.getCar

    println("car3 hash: " + car3.hashCode())
    println("car3 eq car1: " + (car3 eq car1))

    director.build
    val car4 = carBuilder.getCar
    println("car4 hash: " + car4.hashCode())
    println("car3 eq car4: " + (car3 eq car4) + "\n")

    println(carBuilder.getCar)
  }
}
