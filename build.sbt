name := "UT-IT-Group1"

version := "1.0"

scalaVersion := "2.12.12"

lazy val Module_1 = project.in(file("Module_1"))
  .settings(libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test)

lazy val Module_2 = project.in(file("Module_2"))
  .settings(libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test, "org.mockito" %% "mockito-scala" % "1.16.15" % Test))



