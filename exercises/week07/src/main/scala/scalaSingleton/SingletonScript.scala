package scalaSingleton

/**
  * Created by Case on 18/04/2017.
  */
object SingletonScript extends  App {
  val su: SingletonUser = new SingletonUser
  val su2: SingletonUser = new SingletonUser

  new Thread(su).start()
  new Thread(su2).start()

}
