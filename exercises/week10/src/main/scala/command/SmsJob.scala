package command

class SmsJob extends Job {

  var sms: Option[Sms] = None
  def setSms(sms: Sms): Unit = this.sms = Some(sms)

  override def run(): Unit = sms match {
    case Some(sms) => sms.sendSms
    case None => println("No Sms instance set in SmsJob"); throw new RuntimeException("No Sms instance set in SmsJob.")
  }
}