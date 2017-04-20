foreach
map
flatMap 
foldLeft
foldRight

We have     We provide          We want     We use
Seq[A]      A => Unit           Unit        foreach
Seq[A]      A => B              Seq[B]      map
Seq[A]      A => Seq[B]         Seq[B]      flatMap
Seq[A]      B and (B,A) => B    B           foldLeft
Seq[A]      B and (A,B) => B    B           foldRight

a.flatMap(x => b.flatMap( y => c.map(z => e)))

for {
    x <- a
    y <- b
    z <- c
} yield e

Option item None


sealed trait Option[+A] {
    // ...
}

final case class Some[A](x: A) extends Option[A]{
    // ...
}

final case object None extends Option[Nothing] {
    // ...
}