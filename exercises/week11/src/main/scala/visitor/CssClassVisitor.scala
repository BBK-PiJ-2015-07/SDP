package visitor

case class CssClassVisitor() extends Visitor {
  override def visit(element: HtmlElement): Unit = {
    val start: String = element.getStartTag()
    element.setStartTag(start.dropRight(1) + " class='visitor'>")
  }

  override def visit(parentElement: HtmlParentElement): Unit = {
    val start: String = parentElement.getStartTag()
    parentElement.setStartTag(start.dropRight(1) + " class='visitor'>")
  }
}
