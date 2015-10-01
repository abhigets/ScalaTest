package automation.base

import org.scalatest._
import org.scalatest.MustMatchers
import automation.pages._
import org.fluentlenium.core.FluentPage

trait AutomationTest
  extends MobileCorePages
  with FlatSpecLike
  with BeforeAndAfter
  with MustMatchers

trait MobileCorePages
  extends HomePage
  with HeaderPage {}

class Page extends FluentPage(Global.webDriver) with MustMatchers{
}


