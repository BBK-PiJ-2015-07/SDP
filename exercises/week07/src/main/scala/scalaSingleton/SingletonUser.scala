package scalaSingleton

/**
  * Created by Case on 18/04/2017.
  */
class SingletonUser extends Runnable {

  def run = {
    val newInstance = SingletonLazy.getInstance.get

    //println("newInstance: " + SingletonLazy.getDetails(newInstance))
    println("newInstance: " + newInstance.getDetails)
  }

}
