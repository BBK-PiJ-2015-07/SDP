Transformations of Sequences

Four major transformation functions: map, flatMap, fold, foreach.

FP -> zip, fold, filter, map, ...

We have         We provide              We want             Method
-------         ----------              -------             ------
Seq[A]          A => Unit               Unit                foreach
Seq[A]          A => B                  Seq[B]              map
Seq[A]          A => Seq[B]             Seq[B]              flatMap
Seq[A]          B and (B,A) => B        B                   foldLeft
Seq[A]          B and (A,B) => B        B                   foldRight