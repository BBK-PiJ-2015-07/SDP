package composite

import scala.collection.mutable.ArrayBuffer

case class SongGroup(// Contains any Songs or SongGroups that are added
                     // to this ArrayList
                     var groupName: String, var groupDescription: String) extends SongComponent {
  private[composite] var songComponents: ArrayBuffer[SongComponent] = new ArrayBuffer()

  override def add(newSongComponent: SongComponent) {
    songComponents += newSongComponent
  }

  override def remove(newSongComponent: SongComponent) {
    songComponents -= newSongComponent
  }

  override def getComponent(componentIndex: Int): SongComponent = songComponents(componentIndex)

  override def displaySongInfo() {
    println(getGroupName + " " + getGroupDescription + "\n")
    // Cycles through and prints any Songs or SongGroups added
    // to this SongGroups ArrayList songComponents
    songComponents.foreach(_.displaySongInfo())
  }

  def getGroupName: String = groupName

  def getGroupDescription: String = groupDescription
}
