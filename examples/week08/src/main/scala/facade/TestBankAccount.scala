package facade

object TestBankAccount {
  def main(args: Array[String]) {
    val accessingBank: BankAccountFacade = new BankAccountFacade(12345678, 1234)
    accessingBank.withdrawCash(50.00)
    accessingBank.withdrawCash(990.00)
  }
}
