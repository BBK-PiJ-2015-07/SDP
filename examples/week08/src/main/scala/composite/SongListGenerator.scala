package composite

object SongListGenerator {
  def main(args: Array[String]) {
    val industrialMusic: SongComponent = new SongGroup("Industrial", "is a style of experimental music that draws on transgressive and provocative themes")
    val heavyMetalMusic: SongComponent = new SongGroup("\nHeavy Metal", "is a genre of rock that developed in the late 1960s, largely in the UK and in the US")
    val dubstepMusic: SongComponent = new SongGroup("\nDubstep", "is a genre of electronic dance music that originated in South London, England")
    // Top level component that holds everything
    val everySong: SongComponent = new SongGroup("Song List", "Every Song Available")
    // Composite that holds individual groups of songs
    // This holds Songs plus a SongGroup with Songs
    everySong.add(industrialMusic)
    industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990))
    industrialMusic.add(new Song("Headhunter", "Front 242", 1988))
    industrialMusic.add(dubstepMusic)
    dubstepMusic.add(new Song("Centipede", "Knife Party", 2012))
    dubstepMusic.add(new Song("Tetris", "Doctor P", 2011))
    // This is a SongGroup that just holds Songs
    everySong.add(heavyMetalMusic)
    heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970))
    heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980))
    val crazyLarry: DiscJockey = new DiscJockey(everySong)
    crazyLarry.getSongList()
  }
}
