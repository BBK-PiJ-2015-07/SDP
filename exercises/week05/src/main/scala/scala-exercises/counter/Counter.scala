package counter

/**
  * Created by apinter on 30/03/2017.
  */
case class Counter(ct: Option[Int]) {
  val count = ct getOrElse 0

  /*def inc() = { new Counter(Option(count + 1)) }
  def dec() = { new Counter(Option(count - 1)) }
*/

  def inc() = { this.copy(Option(count + 1)) }
  def dec() = { this.copy(Option(count - 1)) }

  def adjust(adder: Adder) = { this.copy(Option(adder add count)) }
}