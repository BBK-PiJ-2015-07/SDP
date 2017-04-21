package composite

// This acts as an interface for every Song (Leaf)
// and SongGroup (Composite) we create
abstract class SongComponent {
  // We throw UnsupportedOperationException so that if
  // it doesn't make sense for a song, or song group
  // to inherit a method they can just inherit the
  // default implementation
  // This allows me to add components
  def add(newSongComponent: SongComponent) {
    throw new UnsupportedOperationException
  }

  // This allows me to remove components
  def remove(newSongComponent: SongComponent) {
    throw new UnsupportedOperationException
  }

  // This allows me to get components
  def getComponent(componentIndex: Int): SongComponent = {
    throw new UnsupportedOperationException
  }

  // This allows me to retrieve song names
  def getSongName: String = {
    throw new UnsupportedOperationException
  }

  // This allows me to retrieve band names
  def getBandName: String = {
    throw new UnsupportedOperationException
  }

  // This allows me to retrieve release year
  def getReleaseYear: Int = {
    throw new UnsupportedOperationException
  }

  // When this is called by a class object that extends
  // SongComponent it will print out information
  // specific to the Song or SongGroup
  def displaySongInfo() {
    throw new UnsupportedOperationException
  }
}
