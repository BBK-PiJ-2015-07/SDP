package counter

/**
  * Created by apinter on 30/03/2017.
  */
class Counter(count: Int = null) {
  var count = Option(count).getOrElse(1)

  def inc() = { new Counter(count + 1) }
  def dec() = { new Counter(count - 1) }

}