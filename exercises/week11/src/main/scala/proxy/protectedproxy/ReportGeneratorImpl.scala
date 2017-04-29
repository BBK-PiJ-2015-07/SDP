package proxy.protectedproxy

import java.util.Date

/**
  * Created by Case on 29/04/2017.
  */
case  class ReportGeneratorImpl() extends ReportGenerator {
  override def generateDailyReport(): String = {
    val sb: StringBuilder = StringBuilder.newBuilder
    sb.append("********************Location X Daily Report********************")
    sb.append("\n Location ID: 012")
    sb.append("\n Today's Date: " + new Date())
    sb.append("\n Total Pizza's Sell: 112")
    sb.append("\n Total Price: $2534")
    sb.append("\n Net Profit: $1985")
    sb.append("\n ***************************************************************")
    sb.toString()
  }
}
