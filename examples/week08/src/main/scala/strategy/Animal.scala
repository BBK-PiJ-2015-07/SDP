package strategy

class Animal {
  var flyingType: Flys = null
  private var name: String = null
  private var height: Double = .0
  private var weight: Int = 0
  private var favFood: String = null
  private var speed: Double = .0

  // Composition allows you to change the capabilities of
  // objects at run time!
  //
  // Instead of using an interface in a traditional way
  // we use an instance variable that is a subclass
  // of the Flys interface.
  //
  // Animal doesn't care what flyingType does, it just
  // knows the behavior is available to its subclasses
  //
  // This is known as Composition : Instead of inheriting
  // an ability through inheritance the class is composed
  // with Objects with the right ability

  private var sound: String = null

  def getName: String = name

  def setName(newName: String) {
    name = newName
  }

  def getHeight: Double = height

  def setHeight(newHeight: Double) {
    height = newHeight
  }

  def getWeight: Double = weight

  def setWeight(newWeight: Int) {
    if (newWeight > 0) {
      weight = newWeight
    } else {
      println("Weight must be bigger than 0")
    }
  }

  def getFavFood: String = favFood

  def setFavFood(newFavFood: String) {
    favFood = newFavFood
  }

  def getSpeed: Double = speed

  def setSpeed(newSpeed: Double) {
    speed = newSpeed
  }

  def getSound: String = sound

  def setSound(newSound: String) {
    sound = newSound
  }

  // Animal pushes off the responsibility for flying to flyingType
  def tryToFly: String = flyingType.fly

  // If you want to be able to change the flyingType dynamically
  // add the following method
  def setFlyingAbility(newFlyType: Flys) {
    flyingType = newFlyType
  }
}
