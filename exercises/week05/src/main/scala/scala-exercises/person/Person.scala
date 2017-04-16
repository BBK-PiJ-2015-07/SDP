package person



/**
  * Created by apinter on 12/04/2017.
  */
case class Person(firstname: String, surname: String) {

  def getFullName() = { firstname + " " + surname}
  def getFirstName = firstname
  def getSurname = surname

}

object  Person {
  def apply(fullname: String): Person = {
    println("apply in companion object of Person class. Single string parameter.")
    val parts = fullname.split(" ")
    new Person(parts(0), parts(1))
  }
}

/*//This would not work in a case class -> "method apply defined twice"
object  Person {
  def apply(fn: String, sn: String): Person = {
    println("apply in companion object of Person class. Single string parameter.")
    new Person(fn, sn)
  }
}*/

