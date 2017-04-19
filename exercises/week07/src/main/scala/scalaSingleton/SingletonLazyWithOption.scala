package scalaSingleton

import scalaSingleton.SingletonLazyWithOption.wait

/**
  * Created by apinter on 18/04/2017.
  */
class SingletonLazyWithOption private () {}

object SingletonLazyWithOption extends Serializable with Cloneable{
  private var instance : Option[SingletonLazyWithOption] = None

  def getInstance: Option[SingletonLazyWithOption] = instance match {
    case Some(sl) => Some(sl)
    case None => {
      classOf[SingletonLazyWithOption] synchronized {
        instance match {
          case Some(sl) =>
          case None => instance = Some(new SingletonLazyWithOption)
        }
      }
      instance
    }
  }

  def getDetails = System.identityHashCode(this.getInstance.get)

  //Apparently scala singletons are safe for serialization but the exercise asked for an explicit implementation for making it safe.
  //https://stackoverflow.com/questions/6004742/which-guarantees-do-scalas-singletons-have-regarding-serialization
  def readResolve: AnyRef = instance
  def cloneMe = {println("in cloneMe. "); this.clone()}
  //override def clone(): AnyRef = super.clone()

  override def clone(): AnyRef = throw new CloneNotSupportedException("cloning of this class is not supported by me…")
}