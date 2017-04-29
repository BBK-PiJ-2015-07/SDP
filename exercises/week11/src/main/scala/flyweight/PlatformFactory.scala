package flyweight

import scala.collection.mutable.HashMap
//import java.util.Map

object PlatformFactory {

  private var map = new HashMap[String, Platform]()

  def getPlatformInstance(platformType: String): Platform = synchronized {

    var platformOption: Option[Platform] = map.get(platformType)
    var platformResult: Platform = null.asInstanceOf[Platform]

    platformOption match {
      case Some(p) => platformResult = p.asInstanceOf[Platform]
      case None => {
        platformType match {
          case "C" => platformResult = new CPlatform()
          case "JAVA" => platformResult = new JavaPlatform()
          case "RUBY" => platformResult = new RubyPlatform()
          case "SCALA" => platformResult = new ScalaPlatform()
          case _ => throw new ClassNotFoundException("Platform not implemented"); null
        }
        map.put(platformType, platformResult)
      }
    }
    platformResult
  }


}
