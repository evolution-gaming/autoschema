import sbt._

object Dependencies {

  object Play {
    val json = "com.typesafe.play" %% "play-json" % "2.7.4"
  }

  object Test {
    val sclatest           = "org.scalatest"     %% "scalatest"       % "3.2.2"   % "test"
    val scalatestplusJUnit = "org.scalatestplus" %% "junit-4-13"      % "3.2.2.0" % "test"
    val junitINterface     = "com.novocode"       % "junit-interface" % "0.11"    % "test"
  }

  val all = Seq(Play.json, Test.junitINterface, Test.scalatestplusJUnit, Test.sclatest)
}
