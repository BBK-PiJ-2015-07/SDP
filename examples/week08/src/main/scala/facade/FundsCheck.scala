package facade

class FundsCheck {
  private var cashInAccount: Double = 1000.00

  def getCashInAccount: Double = {
    return cashInAccount
  }

  def decreaseCashInAccount(cashWithdrawn: Double) {
    cashInAccount -= cashWithdrawn
  }

  def increaseCashInAccount(cashDeposited: Double) {
    cashInAccount += cashDeposited
  }

  def haveEnoughMoney(cashToWithdrawal: Double): Boolean = {
    if (cashToWithdrawal > getCashInAccount) {
      System.out.println("Error: You don't have enough money")
      System.out.println("Current Balance: " + getCashInAccount)
      return false
    }
    else {
      decreaseCashInAccount(cashToWithdrawal)
      System.out.println("Withdrawal Complete: Current Balance is " + getCashInAccount)
      return true
    }
  }

  def makeDeposit(cashToDeposit: Double) {
    increaseCashInAccount(cashToDeposit)
    System.out.println("Deposit Complete: Current Balance is " + getCashInAccount)
  }
}
