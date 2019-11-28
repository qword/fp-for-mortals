name := "fp-for-mortals"
organization := "qword"
version := "0.1"

scalaVersion in ThisBuild := "2.13.1"
scalacOptions in ThisBuild ++= Seq(
  "-language:_",
  "-Ypartial-unification",
  "-Xfatal-warnings",
  "-Ymacro-annotations"
)

libraryDependencies ++= Seq(
  "org.typelevel" %% "simulacrum" % "1.0.0",
  "org.scalaz" %% "scalaz-core" % "7.2.29"
)

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full)
