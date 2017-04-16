package films

import person.Person

/**
  * Created by Case on 16/04/2017.
  */
class Director (firstName: String, lastName: String, val yearOfBirth: Int){
  def name = firstName +  " " + lastName
}

object Director {
  def apply(firstName: String, lastName: String, yearOfBirth: Int): Director = {
    //println("apply in companion object of Director class. Same parameters as class.")
    new Director(firstName, lastName, yearOfBirth)
  }

  def older(dir1: Director, dir2: Director): Director =  dir1.yearOfBirth match {
    case x if x == dir2.yearOfBirth || x < dir2.yearOfBirth => dir1
    case _ => dir2
  }
}