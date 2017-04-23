package composite

case class HtmlParentElement(s: String) extends HtmlTag(s) {

  var startTag: String = ""
  var endTag: String = ""
  var children: List[HtmlTag] = List[HtmlTag]()


  def getStart: String = startTag
  def getEnd: String = endTag

  override def toString():String = {"start: " + getStart + " - end: " + getEnd + " - children: " + children}



  override def setStartTag(tag: String): Unit = startTag = tag

  override def setEndTag(tag: String): Unit = endTag = tag

  override def addChildTag(htmlTag: HtmlTag): Unit = children = children :+ htmlTag

  //override def removeChildTag(htmlTag: HtmlTag): Unit = children = children diff List(htmlTag)

  override def removeChildTag(htmlTag: HtmlTag): Unit = children = children.filter(_ equals htmlTag)

  override def getChildren: List[HtmlTag] = children

  override def generateHtml: Unit = {
    println(startTag)
    for(c <- children) {
      c.generateHtml
    }
    println(endTag)
  }

  def canEqual(a: Any) = a.isInstanceOf[HtmlParentElement]

  override def equals(that: Any): Boolean =
    that match {
      case that: HtmlParentElement => ((that.canEqual(this)) && (this.getChildren eq that.getChildren) && (this.hashCode == that.hashCode))
      case _ => false
    }
  override def hashCode: Int = {
    val prime = 31
    var result = 1

    result = prime * result + (if (startTag == null) 0 else startTag.hashCode)
    result = prime * result + (if (endTag == null) 0 else endTag.hashCode)
    result = prime * result + (if (children == null) 0 else children.hashCode())
    result
  }



}
