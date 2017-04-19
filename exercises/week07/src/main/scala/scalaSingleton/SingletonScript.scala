package scalaSingleton

/**
  * Created by Case on 18/04/2017.
  */
object SingletonScript extends  App {
  println("\nSingletonScript. Creating first SingletonUser")
  //Thread.sleep(2000)
  val su: SingletonUser = new SingletonUser
  //Thread.sleep(2000)
  println("\nSingletonScript. Creating second SingletonUser")
  //Thread.sleep(2000)
  val su2: SingletonUser = new SingletonUser
  //Thread.sleep(2000)


  println("\nSingletonScript. Running first SingletonUser")
  //Thread.sleep(2000)
  new Thread(su).start()
  //Thread.sleep(2000)
  println("\nSingletonScript. Running second SingletonUser")
  //Thread.sleep(2000)
  new Thread(su2).start()

}
