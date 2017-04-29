package visitor

case class StyleVisitor() extends Visitor {
  override def visit(element: HtmlElement): Unit = {
    val start: String = element.getStartTag()
    element.setStartTag(start.dropRight(1) + " style='width:46px;'>")
  }

  override def visit(parentElement: HtmlParentElement): Unit = {
    val start: String = parentElement.getStartTag()
    parentElement.setStartTag(start.dropRight(1) + " style='width:58px;'>")
  }
}