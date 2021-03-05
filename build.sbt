// About
name := "sangria-zio-json"
version := "0.1"
description := "Sangria zio-json marshalling"
organization := ""
homepage := Some(url("https://github.com/sh0hei/sangria-zio-json"))
licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))
developers := List(Developer("sh0hei", "Shohei Shimomura", "", url("https://github.com/sh0hei")))
scmInfo := Some(
  ScmInfo(
    browseUrl = url("https://github.com/sh0hei/sangria-zio-json.git"),
    connection = "scm:git:git@github.com:sh0hei/sangria-zio-json.git"
  ))

// Build
ThisBuild / crossScalaVersions := Seq("2.12.13", "2.13.5")
ThisBuild / scalaVersion := crossScalaVersions.value.last

// Compile options
scalacOptions ++= Seq("-deprecation", "-feature")
scalacOptions += "-target:jvm-1.8"
javacOptions ++= Seq("-source", "8", "-target", "8")

// Dependencies
libraryDependencies ++= Seq(
)

// MIsc
ThisBuild / shellPrompt := { state =>
  scala.Console.MAGENTA + Project.extract(state).currentRef.project + " > " + scala.Console.RESET
}
