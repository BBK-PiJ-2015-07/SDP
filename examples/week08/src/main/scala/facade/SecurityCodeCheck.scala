package facade

class SecurityCodeCheck {
  private val securityCode: Int = 1234

  def getSecurityCode: Int = {
    return securityCode
  }

  def isCodeCorrect(secCodeToCheck: Int): Boolean = {
    return secCodeToCheck == getSecurityCode
  }
}
