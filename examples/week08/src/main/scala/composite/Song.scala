package composite

case class Song(var songName: String, var bandName: String, var releaseYear: Int) extends SongComponent {
  override def displaySongInfo() =
    println(getSongName + " was recorded by " + getBandName + " in " + getReleaseYear)

  override def getSongName = songName

  override def getBandName = bandName

  override def getReleaseYear = releaseYear
}
