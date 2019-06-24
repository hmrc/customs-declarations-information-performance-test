import sbt._

object Dependencies {

  private val gatlingVersion = "2.2.5"

  object Compile {
    val nscalaTime = "com.github.nscala-time" %% "nscala-time" % "1.6.0"
    val typesafeConfig = "com.typesafe" % "config" % "1.2.0"
    val performanceTestRunner = "uk.gov.hmrc" %% "performance-test-runner" % "3.2.0"
    val gatlingTestFramework = "io.gatling" % "gatling-test-framework" % gatlingVersion
    val gatlingHighCharts = "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion
  }
}


