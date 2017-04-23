package composite

// TODO
case class HtmlElement(s: String) extends HtmlTag(s) {

  var startTag: String = ""
  var endTag: String = ""
  var body: String = ""


  def getStart: String = startTag
  def getEnd: String = endTag

  override def toString():String = {"start: " + getStart + " - end: " + getEnd + " - body: " + body}


  override def setStartTag(tag: String): Unit = startTag = tag

  override def setEndTag(tag: String): Unit = endTag = tag

  override def setTagBody(tagBody: String): Unit = body = tagBody

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
