package films

/**
  * Created by Case on 16/04/2017.
  */
case class Film (val name: String, val yearOfRelease: Int, val imdbRating: Double, val director: Director){

  def directorsAge = yearOfRelease - director.yearOfBirth

  def isDirectedBy(d: Director) = d == director

  //Commented this out after making Film a case class
  /*def copy(name: String = this.name, yearOfRelease: Int = this.yearOfRelease, imdbRating: Double = this.imdbRating, director: Director = this.director) = {
    new Film(name, yearOfRelease, imdbRating, director)
  }*/
}

object  Film {

  //Commented this out after making Film a case class
  /*def apply(name: String, yearOfRelease: Int, imdbRating: Double, director: Director): Film = {
    println("apply in companion object of Film class. Same parameters.")
    new Film(name, yearOfRelease, imdbRating, director)
  }*/

  def highestRating(film1: Film, film2: Film): Double = film1.imdbRating match {
    case x if x == film2.imdbRating || x > film2.imdbRating => film1.imdbRating
    case _ => film2.imdbRating
  }

  def oldestDirectorAtTheTime(film1: Film, film2: Film): Director = film1.directorsAge match {
    case x if x == film2.directorsAge || x > film2.directorsAge => film1.director
    case _ => film2.director
  }
}

