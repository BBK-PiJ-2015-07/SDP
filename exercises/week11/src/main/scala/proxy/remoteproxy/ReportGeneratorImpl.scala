package proxy.remoteproxy

import java.rmi.Naming
import java.rmi.RemoteException
import java.rmi.server.UnicastRemoteObject
import java.util.Date

object ReportGeneratorImpl extends App {
  try {
    val reportGenerator: ReportGenerator = new ReportGeneratorImpl()
    Naming.rebind("PizzaCoRemoteGenerator", reportGenerator)
  } catch {
    case e: Exception => e.printStackTrace()
  }
}

case class ReportGeneratorImpl protected ()
  extends UnicastRemoteObject
  with ReportGenerator {

  @throws(classOf[RemoteException])
  override def generateDailyReport(): String = {
    val sb: StringBuilder = StringBuilder.newBuilder
    sb.append("********************Location X Daily Report********************")
    sb.append("\\n Location ID: 012")
    sb.append("\\n Today's Date: " + new Date())
    sb.append("\\n Total Pizza's Sell: 112")
    sb.append("\\n Total Price: $2534")
    sb.append("\\n Net Profit: $1985")
    sb.append("\\n ***************************************************************")
    sb.toString()
  }
}
