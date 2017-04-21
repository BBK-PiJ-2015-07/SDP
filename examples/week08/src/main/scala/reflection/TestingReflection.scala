package reflection

// The Java Reflection API is used to manipulate classes
// and everything in a class including fields, methods,
// constructors, private data, etc.
// Because using the Reflection API is most often Dynamic
// it can slow down a program because the JVM can't
// optimize the code.
// The Reflection API can't be used with applets because
// of the added security applets require.
// Because this API allows you to do things like access
// private fields, methods, etc. it should be used
// sparingly, or else potentially destroy the logic
// of a program
import java.lang.reflect.{Constructor, Field, InvocationTargetException, Method, Modifier}

import abstractfactory.EnemyShipFactory

object TestingReflection extends App {
  // Getting the class Object for UFOEnemyShip
  // Everything in Java has a Class Object
  val reflectClass = classOf[UFOEnemyShip]

  // Get the class name of an Object
  val className: String = reflectClass.getName

  println(className + "\n")

  // Check modifiers of a class
  // isAbstract, isFinal, isInterface, isPrivate, isProtected,
  // isStatic, isStrict, isSynchronized, isVolatile
  val classModifiers: Int = reflectClass.getModifiers
  println(Modifier.isPublic(classModifiers) + "\n")

  // You can get a list of interfaces used by a class
  // Class[] interfaces = reflectClass.getInterfaces();
  // Get the super class for UFOEnemyShip
  val classSuper: Class[_] = reflectClass.getSuperclass
  println(classSuper.getName + "\n")

  // Get the objects methods, return type and parameter type
  val classMethods: Array[Method] = reflectClass.getMethods

  for (method <- classMethods) {
    // Get the method name
    println("Method Name: " + method.getName)

    // Check if a method is a getter or setter
    if (method.getName.startsWith("get")) {
      println("Getter Method")
    }
    else if (method.getName.startsWith("set")) {
      println("Setter Method")
    }

    // Get the methods return type
    println("Return Type: " + method.getReturnType)
    val parameterType: Array[Class[_]] = method.getParameterTypes

    // List parameters for a method
    println("Parameters")
    for (parameter <- parameterType) {
      println(parameter.getName)
    }
    println()
  }
  // Return the parameters for a constructor
  val constructParameters: Array[Class[_]] = constructor.getParameterTypes
  val shipFactory: EnemyShipFactory = null
  try {
    // If you know the parameters of the constructor you
    // want you do the following.
    //
    // To return an array of constructors instead do this
    // Constructor[] constructors = reflectClass.getConstructors();
    //
    // If the constructor receives a String you'd use the
    // parameter new Class[]{String.class}
    //
    // For others use int.class, double.class, etc.
    //
    constructor = reflectClass.getConstructor()

    // Call a constructor by passing parameters to create an object
    constructor2 = reflectClass.getConstructor(classOf[Int], classOf[String]).newInstance(new Integer(12), "Random String")
  }
  catch {
    case e: InstantiationException => e.printStackTrace()
    case e: IllegalAccessException => e.printStackTrace()
    case e: IllegalArgumentException => e.printStackTrace()
    case e: InvocationTargetException => e.printStackTrace()
  }
  // How to access class constructors
  var constructor: Constructor[_] = null
  for (parameter <- constructParameters) {
    println(parameter.getName)
  }
  var constructor2: Any = null
  var newEnemyShip: UFOEnemyShip = null
  try {
    // Create a UFOEnemyShip object by calling newInstance
    newEnemyShip = constructor.newInstance(shipFactory).asInstanceOf[UFOEnemyShip]
  }
  catch {
    case e: Any => {
      e.printStackTrace()
    }
  }

  // Now I can call methods in the UFOEnemyShip Object
  newEnemyShip.setName("Xt-1000")
  println("EnemyShip Name: " + newEnemyShip.getName)

  // Access private fields using reflection
  // Field stores info on a single field of a class
  var privateStringName: Field = null
  try {
    // Create a UFOEnemyShip object
    val enemyshipPrivate: UFOEnemyShip = new UFOEnemyShip(shipFactory)

    // Define the private field you want to access
    // I can access any field with just its name dynamically
    privateStringName = classOf[UFOEnemyShip].getDeclaredField("idCode")

    // Shuts down security allowing you to access private fields
    privateStringName.setAccessible(true)

    // Get the value of a field and store it in a String
    val valueOfName: String = privateStringName.get(enemyshipPrivate).asInstanceOf[String]
    println("EnemyShip Private Name: " + valueOfName)

    // Get access to a private method
    // getDeclaredMethod("methodName", methodParamters or null)
    // Since I provide the method name as a String I can run any method
    // without needing to follow the normal convention methodName()

    val methodName: String = "getPrivate"
    var privateMethod: Method = classOf[UFOEnemyShip].getDeclaredMethod(methodName, null)

    // Shuts down security allowing you to access private methods
    privateMethod.setAccessible(true)

    // get the return value from the method
    var privateReturnVal: String = privateMethod.invoke(enemyshipPrivate, null).asInstanceOf[String]
    println("EnemyShip Private Method: " + privateReturnVal)

  }
  catch {
    case e: IllegalArgumentException => e.printStackTrace()
    case e: IllegalAccessException => e.printStackTrace()
    case e: NoSuchMethodException => e.printStackTrace()
    case e: InvocationTargetException => e.printStackTrace()
  }
}
