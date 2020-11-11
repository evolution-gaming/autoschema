lazy val commonSettings = Seq(
  organization := "com.evolutiongaming",
  homepage := Some(new URL("https://github.com/evolution-gaming/autoschema")),
  startYear := Some(2020),
  organizationName := "Evolution Gaming",
  organizationHomepage := Some(url("http://evolutiongaming.com")),
  bintrayOrganization := Some("evolutiongaming"),
  scalaVersion := crossScalaVersions.value.head,
  crossScalaVersions := Seq("2.13.3", "2.12.12"),
  scalacOptions in (Compile, doc) += "-no-link-warnings",
  scalacOptsFailOnWarn := Some(false),
  resolvers += Resolver.bintrayRepo("evolutiongaming", "maven"),
  licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT"))),
  releaseCrossBuild := true
)

lazy val sequentially = (project
  in file(".")
  settings (name := "autoschema", scalacOptsFailOnWarn := Some(false))
  settings (testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v"))
  settings commonSettings
  settings (libraryDependencies ++= Dependencies.all))
