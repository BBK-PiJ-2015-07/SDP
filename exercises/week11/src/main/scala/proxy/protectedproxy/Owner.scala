package proxy.protectedproxy

class Owner extends Staff {
  private var reportGenerator: ReportGeneratorProxy = _

  override def setReportGenerator(reportGenerator: ReportGeneratorProxy): Unit = this.reportGenerator = reportGenerator

  override def isOwner(): Boolean = true

  def generateDailyReport(): String = reportGenerator.generateDailyReport()
}