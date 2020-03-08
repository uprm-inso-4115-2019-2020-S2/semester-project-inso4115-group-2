name := "WebApp"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % "2.6.3",
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.3" % Test,
  "com.typesafe.akka" %% "akka-stream" % "2.6.3",
  "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.3" % Test,
  "com.typesafe.akka" %% "akka-http" % "10.1.11",
  "com.typesafe.akka" %% "akka-http-testkit" % "10.1.11",
  "org.scalatest" %% "scalatest" % "3.1.0" % Test,
)