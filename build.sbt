import sbt.Keys._
name := "scalalearning"

version := "1.0"

val scalaV = "2.11.5"

lazy val collections = project.in(file("collections"))
  .settings(scalaVersion := scalaV)
  .settings(organization := "com.gitgub.trod")
  .settings(mainClass in run := Some("com.github.trodr.Basics"))



