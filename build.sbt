name := "spi2wb"

version := "1.3"

organization := "org.armadeus"

scalaVersion := "2.11.7"

resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases")
)

libraryDependencies += "edu.berkeley.cs" %% "chisel3" % "3.1.8"
libraryDependencies += "edu.berkeley.cs" %% "chisel-iotesters" % "1.2.10"

scalacOptions ++= Seq("-deprecation", "-feature")

scalacOptions ++= Seq("-language:reflectiveCalls")

//publish local https://github.com/Martoni/WbPlumbing.git
libraryDependencies ++= Seq("org.armadeus" %% "wbplumbing" % "0.1")
