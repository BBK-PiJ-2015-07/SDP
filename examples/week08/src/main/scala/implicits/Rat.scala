import scala.math.Ordering

final case class Rational(numerator: Int, denominator: Int)

object TestOrdering extends App {

   implicit val ordering = Ordering.fromLessThan[Rational]{ (x,y) =>
        (x.numerator.toDouble / x.denominator.toDouble) <
        (y.numerator.toDouble / y.denominator.toDouble)}

    val ls = List(Rational(1,2), Rational(3,4), Rational(1,3))

    println(ls.sorted)
}