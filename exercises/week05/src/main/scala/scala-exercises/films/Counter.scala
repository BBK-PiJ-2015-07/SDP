package films

/**
  * Created by apinter on 30/03/2017.
  */
class Counter(num: Int) {
  var _num = num

  def inc() = { _num += 1 }
  def dec() = { _num -= 1 }


}
