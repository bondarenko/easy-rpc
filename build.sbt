name := "easy-rpc"

organization := "me.archdev"

version := "1.2.0-SNAPSHOT"

scalaVersion := "2.13.7"

ThisBuild / scalacOptions ++= Seq("-deprecation")

libraryDependencies ++= {
  val akkaV = "2.6.18"
  Seq(
    "com.typesafe.akka" %% "akka-stream" % akkaV,

    "com.lihaoyi" %% "autowire" % "0.3.3",
    "io.suzaku" %% "boopickle" % "1.4.0",

    "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % "test",
    "com.typesafe.akka" %% "akka-testkit" % akkaV  % "test",
    "com.typesafe.akka" %% "akka-stream-testkit" % akkaV % "test"
  )
}

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishMavenStyle := true

Test / publishArtifact := false

pomIncludeRepository := { _ => false }

pomExtra in Global :=
  <url>https://github.com/bondarenko/easy-rpc</url>
  <licenses>
    <license>
      <name>MIT</name>
      <url>https://opensource.org/licenses/MIT</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:bondarenko/easy-rpc.git</url>
    <connection>scm:git:git@github.com:bondarenko/easy-rpc.git</connection>
  </scm>
  <developers>
    <developer>
      <name>Oleksandr Bondarenko</name>
      <email>oleksandr.s.bondarenko@gmail.com</email>
    </developer>
  </developers>
