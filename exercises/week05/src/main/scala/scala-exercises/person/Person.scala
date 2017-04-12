package person



/**
  * Created by apinter on 12/04/2017.
  */
class Person(firstname: String, surname: String) {

  def getFullName() = { firstname + " " + surname}
  def getFirstName = firstname
  def getSurname = surname

}

object  Person{
  def apply(fullname: String): Person ={
    val parts = fullname.split(" ")
    new Person(parts(0), parts(1))
  }
}
