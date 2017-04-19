package xpay

import org.scalatest.FunSuite


/**
  * Created by Case on 19/04/2017.
  */
class XpayTest extends FunSuite {

  var pd: PayD = new XpayToPayDAdapter(new XpayImpl)

  test("customer name"){
    val name = "OwnerName"
    pd.setCardOwnerName(name)
    assert(pd.getCardOwnerName == name)
  }

  test("card number"){
    val nr = "1111 1111 1111 1111"
    pd.setCustCardNo(nr)
    assert(pd.getCustCardNo == nr)
  }

  test("exp month"){
    val exp = "Jul"
    pd.setCardExpMonthDate(exp)
    assert(pd.getCardExpMonthDate == exp)
  }

  test("CVVNo"){
    val cvv: Int = 999
    pd.setCVVNo(cvv)
    assert(pd.getCVVNo == cvv)
  }

  test("total amount"){
    val total: Double = 200.0
    pd.setTotalAmount(total)
    assert(pd.getTotalAmount == total)
  }
}