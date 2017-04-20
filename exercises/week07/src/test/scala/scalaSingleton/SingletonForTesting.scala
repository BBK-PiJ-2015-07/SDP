package scalaSingleton

/**
  * Created by apinter on 18/04/2017.
  */
class SingletonForTesting private () {}


object SingletonForTesting extends Serializable {
  private var instance : Option[SingletonForTesting] = None

  def getInstance: Option[SingletonForTesting] =
  //------ ONLY FOR TESTING - TO REMOVE
  { var firstThread: Boolean = true
  //------ ONLY FOR TESTING - TO REMOVE ^^^

    instance match {
      case Some(sl) => Some(sl)
      case None => {

        //------ ONLY FOR TESTING - TO REMOVE
        if (firstThread) {
          firstThread = false
          Thread.currentThread()
          Thread.sleep(5000)
        }
        //------ ONLY FOR TESTING - TO REMOVE ^^^


        classOf[SingletonForTesting] synchronized {
          instance match {
            case Some(sl) =>
            case None => instance = Some(new SingletonForTesting)
          }
        }
        instance
      }
    }
  }
  def getDetails = System.identityHashCode(this.getInstance.get)

  //Apparently scala singletons are safe for serialization but the exercise asked for an explicit implementation for making it safe.
  //https://stackoverflow.com/questions/6004742/which-guarantees-do-scalas-singletons-have-regarding-serialization
  def readResolve: AnyRef = instance

  //
  def cloneMe = {println("in cloneMe. "); this.clone()}
  //override def clone(): AnyRef = super.clone()

  override def clone(): AnyRef = throw new CloneNotSupportedException("cloning of this class is not supported by me…")
}