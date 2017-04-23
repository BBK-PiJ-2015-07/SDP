package composite

object TestCompositePattern extends App {

    val parentTag: HtmlTag = HtmlParentElement("<html>")
    parentTag.setStartTag("<html>")
    parentTag.setEndTag("</html>")

    var p1: HtmlTag = HtmlParentElement("<body>")
    p1.setStartTag("<body>")
    p1.setEndTag("</body>")
    parentTag.addChildTag(p1)

    var child1: HtmlTag = HtmlElement("<P>")
    child1.setStartTag("<P>")
    child1.setEndTag("</P>")
    child1.setTagBody("Testing html tag library")
    p1.addChildTag(child1)



    child1 = HtmlElement("<P>")
    child1.setStartTag("<P>")
    child1.setEndTag("</P>")
    child1.setTagBody("Paragraph 2")


    p1.addChildTag(child1)
    parentTag.generateHtml

    println
    p1.removeChildTag(child1)
    println("\n----\nAfter removing child1\n")
    parentTag.generateHtml


    parentTag.removeChildTag(p1)
    println("\n----\nAfter removing p1\n")
    parentTag.generateHtml


    println("\n----\nRe-adding p1 and child1")
    p1 = HtmlParentElement("<body>")
    p1.setStartTag("<body>")
    p1.setEndTag("</body>")
    parentTag.addChildTag(p1)

    child1 = HtmlElement("<P>")
    child1.setStartTag("<P>")
    child1.setEndTag("</P>")
    child1.setTagBody("Testing html tag library again")
    p1.addChildTag(child1)

    parentTag.generateHtml


    println("\n-----\nAdding more")

    var p2: HtmlTag = HtmlParentElement("<body>")
    p2.setStartTag("<body>")
    p2.setEndTag("</body>")
    parentTag.addChildTag(p2)

    child1 = HtmlElement("<P>")
    child1.setStartTag("<P>")
    child1.setEndTag("</P>")
    child1.setTagBody("Testing html tag library yet again")
    p2.addChildTag(child1)

    parentTag.generateHtml

    println("\n----\nRemoving p2")
    parentTag.removeChildTag(p2)
    parentTag.generateHtml

}
