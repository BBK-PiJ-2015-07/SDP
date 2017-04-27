package iterator

//import java.util.Iterator

class ShapeIterator(private var shapes: Array[Shape]) extends Iterator[Shape] {

  override def hasNext: Boolean = Iterator(shapes) hasNext
    /*val it = Iterator(shapes)
    it.hasNext
  }*/

  override def next: Shape = Iterator(shapes) next

  override def remove: Unit = Iterator(shapes)remove()
}