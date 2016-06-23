package automation.base

import com.gargoylesoftware.htmlunit.BrowserVersion
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver

package object Global {
  val webDriver = new FirefoxDriver()
  //webDriver.setJavascriptEnabled(true)

  java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(java.util.logging.Level.OFF);
  java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
}
