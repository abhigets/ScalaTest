package automation.pages

import automation.base.Page
import org.openqa.selenium.Cookie

trait HomePage extends Page {
  override def getUrl = {
        "http://localhost:9000"
      }

  def goToHomePage {
    go()
  }

  def verifyIsAtHomePage {
    title must be("Home")
  }
}