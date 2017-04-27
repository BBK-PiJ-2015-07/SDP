package interpreter

object ExpressionUtils {

  def isOperator(s: String): Boolean = s match {
    case "+" | "-" | "*" | "/" => true
    case _ => false
  }

  def getOperation(s: String, left: Expression, right: Expression): Expression = s match {
    case "+" => new Add(left, right)
    case "-" => new Sub(left, right)
    case "*" => new Product(left, right)
    case "/" => new Div(left, right)
    case _ => throw new NotImplementedError("Operation not implemented.")
  }
}