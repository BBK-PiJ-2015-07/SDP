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
    assert(dude.getFullName() == firstName + " " + lastName)
  }
}
