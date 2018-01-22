
val Versions = new {
  val crossSbtVersions = Vector("0.13.16", "1.1.0")
  val nativePackager   = "1.3.2"
  val scala            = "2.12.4"
  val scalaTest        = "3.0.1"
}

sbtPlugin := true

name := "sbt-native-packager-bintray"
organization := "au.fsat"
organizationName := "Felix Satyaputra"
startYear := Some(2018)
licenses += ("Apache-2.0", new URL("https://www.apache.org/licenses/LICENSE-2.0.txt"))

scalaVersion in Global := Versions.scala
crossSbtVersions := Versions.crossSbtVersions
scalacOptions ++= Vector("-deprecation")

libraryDependencies ++= Vector(
  "org.scalatest"     %% "scalatest" % Versions.scalaTest % "test"
)

enablePlugins(AutomateHeaderPlugin)

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % Versions.nativePackager)
