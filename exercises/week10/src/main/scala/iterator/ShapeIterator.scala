package iterator

class ShapeIterator(private var shapes: Array[Shape]) extends Iterator[Shape] {

  var iterator: Iterator[Shape] = shapes.iterator

  override def hasNext: Boolean = iterator.hasNext

  override def next: Shape = iterator.next

  def remove(): Unit = iterator.drop(0)
}