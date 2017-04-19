package scalaSingleton


/**
  * Created by Case on 18/04/2017.
  */
class SingletonUser extends Runnable {

  def run = {
    println("\nSingletonUser process started. Creating instance of SingletonLazyWithOption")
    val newInstance: SingletonLazyWithOption = SingletonLazyWithOption.getInstance.get

    println("SingletonUser process. SingletonLazyWithOption Instance created. ID: " + SingletonLazyWithOption.getDetails)


    println("\n\n----------------- \nTrying to break it with clone()")
    var cloneInstance = None
    println("BEFORE CLONING: cloneInstance hash: " + cloneInstance.hashCode())

    try {
      val cloneInstance = SingletonLazyWithOption.cloneMe
    }catch {
      case e => println("Exception thrown during cloning (as it should be):\n" + e.getMessage)
    }

    println("newInstance hash: " + newInstance.hashCode())
    println("AFTER CLONING: cloneInstance hash: " + cloneInstance.hashCode())

  }
}
