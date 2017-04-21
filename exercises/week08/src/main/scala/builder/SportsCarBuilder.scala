package builder

// TODO

object SportsCarBuilder extends CarBuilder {
  private var car: Car = Car("SPORTS")

  override def buildBodyStyle: Unit = car.setBodyStyle("External dimensions: overall length (inches): 192.3,\noverall width (inches): 75.5, overall height (inches): 54.2,\nwheelbase (inches): 112.3, front track (inches): 63.7,\nrear track (inches): 64.1 and curb to curb turning circle (feet): 37.7")

  override def buildPower: Unit = car.setPower("323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm")

  override def buildEngine: Unit = car.setEngine("3.6L V 6 DOHC and variable valve timing")

  override def buildBreaks: Unit = car.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution.\nStability control")

  override def buildSeats: Unit = car.setSeats("Driver sports front seat with one power adjustments manual height,\nfront passenger seat sports front seat with one power adjustments")

  override def buildWindows: Unit = car.setWindows("Front windows with one-touch on two windows")

  override def buildFuelType: Unit = car.setFuelType("Petrol 17 MPG city, 28 MPG highway, 20 MPG combined and 380 mi. range")

  override def getCar: Car = car
}
