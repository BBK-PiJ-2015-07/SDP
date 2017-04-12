package person

import org.scalatest.FunSuite


/**
  * Created by apinter on 12/04/2017.
  */
class PersonTest extends FunSuite {
  val firstName = "DudeFirstName"
  val lastName = "DudeLastName"
  val dude = new Person(firstName, lastName)

  test("getFullName works"){
    assert(dude.getFullName == firstName + " " + lastName)
  }

  test("apply method in Person companion object accepts single String as full name"){
    val fullName = "DudeFirstName DudeLastName"
    val newDude = Person(fullName)
    assert(newDude.getFullName == fullName)
  }

  test("Person class two parameter constructor works"){
    assert(dude.getFirstName == firstName )
    assert(dude.getSurname == lastName)
  }
}
