package xpay

/**
  * Created by Case on 20/04/2017.
  */
class XpayToPayDAdapter(xpay: Xpay) extends PayD {

  def getCustCardNo: String = xpay.getCreditCardNo

  def setCustCardNo(custCardNo: String) = xpay.setCreditCardNo(custCardNo)

  def getCardOwnerName: String = xpay.getCustomerName

  def setCardOwnerName(cardOwnerName: String) = xpay.setCustomerName(cardOwnerName)

  def getCardExpMonthDate: String = xpay.getCardExpMonth

  def setCardExpMonthDate(cardExpMonthDate: String) = xpay.setCardExpMonth(cardExpMonthDate)

  def getCVVNo: Integer = xpay.getCardCVVNo.toInt

  def setCVVNo(cVVNo: Integer) = xpay.setCardCVVNo(cVVNo.toShort)

  def getTotalAmount: Double = xpay.getAmount

  def setTotalAmount(totalAmount: Double) = xpay.setAmount(totalAmount)
}