package films

import org.scalatest.FunSuite


/**
  * Created by apinter on 12/04/2017.
  */
class MyFilmTest extends FunSuite {
  val eastwood = new Director("Clint", "Eastwood", 1930)
  val mcTiernan = new Director("John", "McTiernan", 1951)
  val nolan = new Director("Christopher", "Nolan", 1970)
  val someGuy = new Director("Just", "Some Guy", 1990)

  val memento = new Film("Memento", 2000, 8.5, nolan)
  val darkKnight = new Film("Dark Knight", 2008, 9.0, nolan)
  val inception = new Film("Inception", 2010, 8.8, nolan)

  val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7, eastwood)
  val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9, eastwood)
  val unforgiven = new Film("Unforgiven", 1992, 8.3, eastwood)
  val granTorino = new Film("Gran Torino", 2008, 8.2, eastwood)
  val invictus = new Film("Invictus", 2009, 7.4, eastwood)

  val predator = new Film("Predator", 1987, 7.9, mcTiernan)
  val dieHard = new Film("Die Hard", 1988, 8.3, mcTiernan)
  val huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6, mcTiernan)
  val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8, mcTiernan)

  test("Eastwood year of birth correct"){
    assert(eastwood.yearOfBirth == 1930)
  }

  test("Die Hard director name correct"){
    assert(dieHard.director.name == "John McTiernan")
  }

  test("Invictus directed by correct"){
    assert(invictus.isDirectedBy(nolan) == false)
  }

  test("Copy memento creates new object"){
    val mementoCopy = memento.copy()
    assert(memento != mementoCopy)

    //test from exercise sheet

    val i2 = inception.copy().copy().copy()
    assert(i2 != inception)
  }

  test("Copy default values kept"){
    val invictusCopy = invictus.copy()
    assert(invictusCopy.name == invictus.name)
    assert(invictusCopy.yearOfRelease == invictus.yearOfRelease)
    assert(invictusCopy.imdbRating == invictus.imdbRating)
    assert(invictusCopy.director == invictus.director)
  }

  test("Copy default values can be changed"){
    val granTorinoCopy = granTorino.copy("GT", 2000, 1.1, nolan)
    assert(granTorinoCopy.name == "GT")
    assert(granTorinoCopy.yearOfRelease == 2000)
    assert(granTorinoCopy.imdbRating == 1.1)
    assert(granTorinoCopy.director == nolan)
  }

  test("copy name test"){
    val newName = new Film("L’homme des hautes plaines", 1973, 7.7, eastwood)
    assert(highPlainsDrifter.copy(name = "L’homme des hautes plaines").name == newName.name)
  }

  test("Film apply method returns new object"){
    val newFilm = Film("Predator", 1987, 7.9, mcTiernan)
    assert(newFilm != predator)
    assert(newFilm.name == predator.name)
    assert(newFilm.yearOfRelease == predator.yearOfRelease)
    assert(newFilm.imdbRating == predator.imdbRating)
    assert(newFilm.director == predator.director)
  }

  test("Film highestRating: film1 rating equal to film2 rating returns film1"){
    assert(Film.highestRating(outlawJoseyWales, predator) == outlawJoseyWales.imdbRating)
  }

  test("Film highestRating: film1 rating higher than film2 rating returns film1"){
    assert(Film.highestRating(memento, invictus) == memento.imdbRating)
  }

  test("Film highestRating: film1 rating lower than film2 rating returns film2"){
    assert(Film.highestRating(invictus, memento) == memento.imdbRating)
  }



  def oldestDirectorAtTheTime(film1: Film, film2: Film): Director = film1.directorsAge match {
    case x if x == film2.directorsAge || x > film2.directorsAge => film1.director
    case _ => film2.director
  }












}