package films

/**
  * Created by Case on 16/04/2017.
  */
class Film (name: String, yearOfRelease: Int, imdbRating: Double, val director: Director){

  def directorsAge = yearOfRelease - director.yearOfBirth
  def isDirectedBy(d: Director) = d == director

  def copy(name: String = this.name, yearOfRelease: Int = this.yearOfRelease, imdbRating: Double = this.imdbRating, director: Director = this.director) = {
    new Film(name, yearOfRelease, imdbRating, director)
  }


}
