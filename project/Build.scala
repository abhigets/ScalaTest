import sbt.Keys._
import sbt._

object Build extends Build {
  val appName = "core-automation"
  val appVersion = "1.0"

  val dependencies = Seq(
    "org.seleniumhq.selenium" % "selenium-java" % "2.39.0",
    "org.scalatest" % "scalatest_2.10" % "2.0.RC1",
    "org.scalatest" % "scalatest_2.10" % "2.0" % "test",
    "org.pegdown" % "pegdown" % "1.0.2"
  )

  val localRepoUrl = Some(Resolver.file("Local repository",  new File(Path.userHome.absolutePath + "/.ivy2/local/")))

  val main = play.Project(
    appName, appVersion,
    dependencies,
    settings = Defaults.defaultSettings
  )
  .settings(
    scalaVersion := "2.10.1",
    resolvers += Classpaths.typesafeReleases,
    resolvers += localRepoUrl.get,
    sbt.Keys.fork in Test := false,
    testOptions in Test += Tests.Setup(loader => {
      loader.loadClass("automation.base.TestSetup").newInstance
    }
    ),
    testOptions in Test += Tests.Argument("-h","target/test-reports")
  )
}