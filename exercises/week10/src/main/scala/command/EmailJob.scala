package command

class EmailJob extends Job {
  var email: Option[Email] = None
  def setEmail(email: Email): Unit = this.email = Some(email)

  override def run(): Unit = email match {
    case Some(email) => email.sendEmail
    case None => println("No Email instance set in EmailJob"); throw new RuntimeException("No Email instance set in EmailJob.")
  }
}