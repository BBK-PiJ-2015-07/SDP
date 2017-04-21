package abstractfactory

// Any part that implements the interface ESWeapon
// can replace that part in any ship
trait ESWeapon {
  // User is forced to implement this method
  // It outputs the string returned when the
  // object is printed
  override def toString: String
}
