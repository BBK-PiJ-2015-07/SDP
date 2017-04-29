package visitor

case class HtmlElement(var tagName: String) extends HtmlTag {

  var startTag: String = ""
  var endTag: String = ""
  var body: String = ""

  override def getTagName(): String = tagName

  override def getStartTag(): String = startTag

  override def getEndTag(): String = endTag

  override def setStartTag(tag: String): Unit = startTag = tag

  override def setEndTag(tag: String): Unit = endTag = tag

  override def setTagBody(tagBody: String): Unit = body = tagBody

  override def toString(): String = {
    "start: " + getStartTag + " - end: " + getEndTag + " - body: " + body
  }

  override def accept(visitor: Visitor): Unit = visitor.visit(this)

  override def generateHtml: Unit = println(startTag + body + endTag)

  override def canEqual(a: Any) = a.isInstanceOf[HtmlElement]

  override def equals(that: Any): Boolean = that match {
    case that: HtmlElement => that.canEqual(this) && this.hashCode == that.hashCode
    case _ => false
  }

  override def hashCode: Int = {

    val prime = 31
    var result = 1

    result = prime * result + (if (startTag == null) 0 else startTag.hashCode)
    result = prime * result + (if (endTag == null) 0 else endTag.hashCode)
    result = prime * result + (if (body == null) 0 else body.hashCode)
    result
  }
}
