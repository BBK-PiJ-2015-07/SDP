package singleton

object SingletonLazyDoubleCheck {
  private var sc: SingletonLazyDoubleCheck = null

  def getInstance: SingletonLazyDoubleCheck = {
    if (sc == null) {
      classOf[SingletonLazyDoubleCheck] synchronized {
        if (sc == null) {
          sc = new SingletonLazyDoubleCheck
        }
      }
    }
    return sc
  }
}

class SingletonLazyDoubleCheck private() {
}