package films

import org.scalatest.FunSuite

/**
  * Created by Case on 16/04/2017.
  */
class MyDirectorTest extends  FunSuite{
  val eastwood = new Director("Clint", "Eastwood", 1930)
  val mcTiernan = new Director("John", "McTiernan", 1951)
  val nolan = new Director("Christopher", "Nolan", 1970)
  val someGuy = new Director("Just", "Some Guy", 1990)

  test("Director companion object works"){
    val compEastwood = Director("Clint", "Eastwood", 1930)
    assert(eastwood ne compEastwood)
    assert(eastwood.name == compEastwood.name)
    assert(eastwood.yearOfBirth == compEastwood.yearOfBirth)
  }

  test("older dir1 DOB = dir2 DOB returns dir 1"){
    val dir1 = eastwood
    val dir2 = Director("first", "last", eastwood.yearOfBirth)
    assert(Director.older(dir1, dir2) eq dir1)
  }

  test("older dir1 older than dir2 returns dir 1"){
    val dir1 = eastwood
    val dir2 = Director("first", "last", eastwood.yearOfBirth + 1)
    assert(Director.older(dir1, dir2) eq dir1)
  }

  test("older dir1 younger than dir2 returns dir 2"){
    val dir1 = eastwood
    val dir2 = Director("first", "last", eastwood.yearOfBirth - 1)
    assert(Director.older(dir1, dir2) eq dir2)
  }

}
