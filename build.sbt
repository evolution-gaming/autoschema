lazy val commonSettings = Seq(
  organization := "com.evolutiongaming",
  homepage := Some(url("https://github.com/evolution-gaming/autoschema")),
  startYear := Some(2020),
  organizationName := "Evolution",
  organizationHomepage := Some(url("https://evolution.com")),
  scalaVersion := crossScalaVersions.value.head,
  crossScalaVersions := Seq("2.13.16"),
  Compile / doc / scalacOptions += "-no-link-warnings",
  scalacOptions ++= Seq("-release", "17"),
  javacOptions ++= Seq("--release", "17"),
  scalacOptsFailOnWarn := Some(false),
  publishMavenStyle := true,
  publishTo := Some(Resolver.evolutionReleases),
  versionScheme := Some("early-semver"),
  licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT"))),
  scmInfo := Some(
    ScmInfo(
      url("https://github.com/evolution-gaming/autoschema"),
      "git@github.com:evolution-gaming/autoschema.git")),
  developers := List(
    Developer(
      "aterekhin",
      "Aleksei Terekhin",
      "aterekhin@evolution.com",
      url("https://github.com/evolution-gaming")))
)

lazy val sequentially = (project
  in file(".")
  settings (name := "autoschema", scalacOptsFailOnWarn := Some(false))
  settings (testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v"))
  settings commonSettings
  settings (libraryDependencies ++= Dependencies.all))
