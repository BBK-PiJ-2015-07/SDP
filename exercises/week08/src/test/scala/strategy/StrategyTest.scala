package strategy

import org.scalatest.FunSuite
/**
  * Created by Case on 20/04/2017.
  */
class StrategyTest extends  FunSuite{

  test("updateFormatter returns new TextEditor") {
    var formatter: TextFormatter = CapTextFormatter()
    var editor: TextEditor = TextEditor(formatter)
    editor.publishText("Testing text in caps formatter")
    formatter = LowerTextFormatter()
    var editor2 = TextEditor(formatter)
    editor2.publishText("Testing text in lower formatter")
    assert(editor != editor2)
  }
  }