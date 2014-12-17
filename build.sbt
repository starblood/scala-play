name := """hello-play"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

javacOptions := Seq("-source", "1.7", "-target", "1.7")

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)
