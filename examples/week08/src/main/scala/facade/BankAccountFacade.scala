package facade

// The Facade Design Pattern decouples or separates the client
// from all of the sub components
// The Facades aim is to simplify interfaces so you don't have
// to worry about what is going on under the hood
class BankAccountFacade(var accountNumber: Int, var securityCode: Int) {
  bankWelcome = new WelcomeToBank
  acctChecker = new AccountNumberCheck
  codeChecker = new SecurityCodeCheck
  fundChecker = new FundsCheck
  private[facade] var acctChecker: AccountNumberCheck = null
  private[facade] var codeChecker: SecurityCodeCheck = null
  private[facade] var fundChecker: FundsCheck = null
  private[facade] var bankWelcome: WelcomeToBank = null

  def getAccountNumber: Int = {
    return accountNumber
  }

  def getSecurityCode: Int = {
    return securityCode
  }

  def withdrawCash(cashToGet: Double) {
    if (acctChecker.accountActive(getAccountNumber) && codeChecker.isCodeCorrect(getSecurityCode) && fundChecker.haveEnoughMoney(cashToGet)) {
      System.out.println("Transaction Complete\n")
    }
    else {
      System.out.println("Transaction Failed\n")
    }
  }

  def depositCash(cashToDeposit: Double) {
    if (acctChecker.accountActive(getAccountNumber) && codeChecker.isCodeCorrect(getSecurityCode)) {
      fundChecker.makeDeposit(cashToDeposit)
      System.out.println("Transaction Complete\n")
    }
    else {
      System.out.println("Transaction Failed\n")
    }
  }
}
