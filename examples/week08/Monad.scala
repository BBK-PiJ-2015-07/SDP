for {
    a <- getFirstNumber // getFirstNumber returns Option[Int]
    b <- getSecondNumber // getSecondNumber returns Option[Int]
} yield a + b

// Option[Int]