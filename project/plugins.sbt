resolvers += Resolver.url("HMRC Sbt Plugin Releases", url("https://dl.bintray.com/hmrc/sbt-plugin-releases"))(Resolver.ivyStylePatterns)
resolvers += "HMRC Releases" at "https://dl.bintray.com/hmrc/releases"

addSbtPlugin("uk.gov.hmrc" % "hmrc-resolvers" % "1.2.0")

addSbtPlugin("uk.gov.hmrc" % "sbt-auto-build" % "1.13.0")

addSbtPlugin("io.gatling" % "gatling-sbt" % "2.1.7")
