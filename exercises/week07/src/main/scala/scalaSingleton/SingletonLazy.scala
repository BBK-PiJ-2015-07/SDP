package scalaSingleton

/**
  * Created by apinter on 18/04/2017.
  */
class SingletonLazy private extends Serializable{
  //def getDetails = 1
}

object SingletonLazy{
  private var instance : Option[SingletonLazy] = None

  def getInstance: Option[SingletonLazy] = instance match {
    case Some(sl) => Some(sl)
    case None => {instance = Some(new SingletonLazy); instance }
  }

  //def getDetails(sl: SingletonLazy) = System.identityHashCode(sl)
  def getDetails = System.identityHashCode(this.instance)
  def readResolve: AnyRef = instance

}