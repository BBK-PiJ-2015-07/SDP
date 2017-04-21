package composite

case class DiscJockey(var songList: SongComponent) {
  // newSongList contains every Song, SongGroup,
  // and any Songs saved in SongGroups
  // Calls the displaySongInfo() on every Song
  // or SongGroup stored in songList
  def getSongList() = songList.displaySongInfo()
}
