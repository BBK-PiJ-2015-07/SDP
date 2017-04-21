package facade

class AccountNumberCheck {
  private val accountNumber: Int = 12345678

  def getAccountNumber: Int = {
    return accountNumber
  }

  def accountActive(acctNumToCheck: Int): Boolean = {
    return acctNumToCheck == getAccountNumber
  }
}
