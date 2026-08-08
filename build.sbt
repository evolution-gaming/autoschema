lazy val commonSettings = Seq(
  organization := "com.evolutiongaming",
  homepage := Some(url("https://github.com/evolution-gaming/autoschema")),
  startYear := Some(2020),
  organizationName := "Evolution Gaming",
  organizationHomepage := Some(url("http://evolutiongaming.com")),
  scalaVersion := crossScalaVersions.value.head,
  crossScalaVersions := Seq("2.13.16", "2.12.20"),
  Compile / doc / scalacOptions += "-no-link-warnings",
  scalacOptsFailOnWarn := Some(false),
  resolvers += "Evolution Gaming repository" at "https://rms.evolution.com/public/",
  licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT"))),
  releaseCrossBuild := true
)

lazy val sequentially = (project
  in file(".")
  settings (name := "autoschema", scalacOptsFailOnWarn := Some(false))
  settings (testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v"))
  settings commonSettings
  settings (libraryDependencies ++= Dependencies.all))
