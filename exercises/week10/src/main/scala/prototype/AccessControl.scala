package prototype

class AccessControl(val controlLevel: String,
                    var access: String)
    extends Prototype {

  override def clone(): Option[AccessControl] = {
    try {
      Some(super.clone().asInstanceOf[AccessControl])
    }
    catch {
      case cne: CloneNotSupportedException => cne.printStackTrace(); None
    }
  }
}