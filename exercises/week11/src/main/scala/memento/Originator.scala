package memento

case class Originator(
  var x: Double,
  var y: Double,
  var careTaker: CareTaker
) {

  private var lastUndoSavepoint: String = _

  createSavepoint("INITIAL")

  def createSavepoint(savepointName: String): Unit = {
    println("Saving state..." + savepointName)
    careTaker.saveMemento(Memento(x,y), savepointName)
    lastUndoSavepoint = savepointName
  }

  def undo(): Unit = undo(lastUndoSavepoint)

  def undo(savepointName: String): Unit = {
    println("Undo at..." + savepointName)
    val memento = careTaker.getMemento(savepointName)
    x = memento.x
    y = memento.y
    setOriginatorState(savepointName)
  }

  def undoAll(): Unit = {
    undo("INITIAL")
    careTaker.clearSavepoints()
  }

  private def setOriginatorState(savepointName: String): Unit = lastUndoSavepoint = savepointName

  override def toString(): String = "X: " + x + ", Y: " + y
}
