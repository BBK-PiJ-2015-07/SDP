name := """exercises week10"""

version := "1.0"

scalaVersion := "2.12.2"

// Need to pull this in for reflective capabilities.
libraryDependencies ++= Seq(
"org.scala-lang" % "scala-compiler" % scalaVersion.value,
  "org.scalactic" %% "scalactic" % "3.0.1",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
"com.typesafe.akka" %% "akka-actor" % "2.5.0",
"com.typesafe.akka" %% "akka-agent" % "2.5.0",
"com.typesafe.akka" %% "akka-camel" % "2.5.0",
"com.typesafe.akka" %% "akka-cluster" % "2.5.0",
"com.typesafe.akka" %% "akka-cluster-metrics" % "2.5.0",
"com.typesafe.akka" %% "akka-cluster-sharding" % "2.5.0",
"com.typesafe.akka" %% "akka-cluster-tools" % "2.5.0",
"com.typesafe.akka" %% "akka-distributed-data" % "2.5.0",
"com.typesafe.akka" %% "akka-multi-node-testkit" % "2.5.0",
"com.typesafe.akka" %% "akka-osgi" % "2.5.0",
"com.typesafe.akka" %% "akka-persistence" % "2.5.0",
"com.typesafe.akka" %% "akka-persistence-query" % "2.5.0",
"com.typesafe.akka" %% "akka-persistence-tck" % "2.5.0",
"com.typesafe.akka" %% "akka-remote" % "2.5.0",
"com.typesafe.akka" %% "akka-slf4j" % "2.5.0",
"com.typesafe.akka" %% "akka-stream" % "2.5.0",
"com.typesafe.akka" %% "akka-stream-testkit" % "2.5.0",
"com.typesafe.akka" %% "akka-testkit" % "2.5.0",
"com.typesafe.akka" %% "akka-typed" % "2.5.0",
"com.typesafe.akka" %% "akka-contrib" % "2.5.0"
)

// Exclude some folders associated with IntelliJ
ideaExcludeFolders += ".idea"

ideaExcludeFolders += ".idea_modules"


















