package interpreter

/**
  * Created by apinter on 27/04/2017.
  */
class Div (private val leftExpression: Expression,
                private val rightExpression: Expression)
    extends Expression {

  override def interpret(): Int =
    leftExpression.interpret() / rightExpression.interpret()
}
