package scalaSingleton

import scalaSingleton.SingletonLazyWithOption.wait

/**
  * Created by apinter on 18/04/2017.
  */
class SingletonLazyWithOption private () {}

object SingletonLazyWithOption extends Serializable{
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

  def readResolve: AnyRef = instance

}