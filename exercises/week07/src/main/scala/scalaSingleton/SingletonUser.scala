package scalaSingleton


/**
  * Created by Case on 18/04/2017.
  */
class SingletonUser extends Runnable {

  def run = {
    println("\nSingletonUser process started. Creating instance of SingletonLazyWithOption")
    val newInstance: SingletonLazyWithOption = SingletonLazyWithOption.getInstance.get

    //println("newInstance: " + SingletonLazy.getDetails(newInstance))
    println("SingletonUser process. SingletonLazyWithOption Instance created. ID: " + SingletonLazyWithOption.getDetails)
  }

}
