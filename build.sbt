name := "mytemplate-scala"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++=  Seq("org.scalatest" %% "scalatest" % "2.2.4" % "test",
"org.mongodb.scala" %% "mongo-scala-driver" % "2.6.0")
