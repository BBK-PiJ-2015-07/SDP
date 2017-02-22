package dixmlcons

import org.springframework.context.support.ClassPathXmlApplicationContext

object HelloWorldSpringWithDIXMLFileConstructorArgument extends App {
  @throws(classOf[Exception])
  val factory = new ClassPathXmlApplicationContext("springdi-scala/src/dixmlcons.xml")
  val mr = factory.getBean("renderer").asInstanceOf[MessageRenderer]
  mr.render
}
