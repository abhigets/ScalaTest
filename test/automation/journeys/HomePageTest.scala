package automation.journeys

import java.util.concurrent.TimeUnit

import automation.base.AutomationTest


class HomePageTest extends AutomationTest{

  behavior of "Home page tests"
  goToHomePage


  it should "Navigate to homepage" in {
    info("Navigate to homepage")
      goToHomePage
      getAllQuots()
  }
}
