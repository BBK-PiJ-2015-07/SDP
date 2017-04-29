package proxy.protectedproxy

import java.rmi.Naming
import java.util.Date

//import proxy.remoteproxy.ReportGenerator

class ReportGeneratorProtectionProxy(var staff: Staff)
  extends ReportGeneratorProxy {

  var reportGenerator: ReportGenerator = _

  override def generateDailyReport(): String =
    if (staff.isOwner) {
      try {
      // Would access remote generator here but hat no time mucking about with rmi which doesn't work with the code below...
          /*reportGenerator = Naming
            .lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator")
            .asInstanceOf[ReportGenerator]*/
        reportGenerator = new ReportGeneratorImpl()
      } catch {
        case e: Exception => e.printStackTrace()
    }
      reportGenerator.generateDailyReport()

    } else {
      "Not Authorized to view report."
    }
}
