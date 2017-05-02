name := "bankaccount"

scalaVersion := "2.10.2"

fork in run := true

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.2.1",
  "com.typesafe.akka" %% "akka-testkit" % "2.2.1")

javaOptions ++= Seq("-Dakka.actor.debug.receive=on", "-Dakka.loglevel=DEBUG")