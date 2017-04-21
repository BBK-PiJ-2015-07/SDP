package options

object Divide extends App {
    def divide(numerator: Int, denominator: Int): Option[Double] = 
        if(denominator == 0) None else Some(numerator.toDouble / denominator.toDouble)

    def divide(numerator: Option[Int], denominator: Option[Int]): Option[Double] = 
        for {
            a <- numerator
            b <- denominator
            c <- divide(a,b)
        } yield c

    println(divide(Some(1),Some(0)))
    println(divide(Some(1),Some(2)))
    println(divide(Some(0),Some(3)))
}
// When the denominator is 0 it doesn't throw an exception but uses Option instead
