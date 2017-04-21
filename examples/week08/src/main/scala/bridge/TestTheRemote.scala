package bridge

object TestTheRemote {
  def main(args: Array[String]) {
    val theTV: RemoteButton = new TVRemoteMute(new TVDevice(1, 200))
    val theTV2: RemoteButton = new TVRemotePause(new TVDevice(1, 200))
    // HOMEWORK --------------
    val theDVD: RemoteButton = new DVDRemote(new DVDDevice(1, 14))
    // -----------------------
    System.out.println("Test TV with Mute")
    theTV.buttonFivePressed()
    theTV.buttonSixPressed()
    theTV.buttonNinePressed()
    System.out.println("\nTest TV with Pause")
    theTV2.buttonFivePressed()
    theTV2.buttonSixPressed()
    theTV2.buttonNinePressed()
    theTV2.deviceFeedback()
    // HOMEWORK
    System.out.println("\nTest DVD")
    theDVD.buttonFivePressed()
    theDVD.buttonSixPressed()
    theDVD.buttonNinePressed()
    theDVD.buttonNinePressed()
  }
}
