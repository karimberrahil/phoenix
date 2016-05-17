import com.jamesward.play.BrowserNotifierKeys

name := "projectphoenix"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  "mysql" % "mysql-connector-java" % "5.1.18",
  "ws.securesocial" %% "securesocial" % "2.1.4",
  cache
)     

play.Project.playJavaSettings

BrowserNotifierKeys.shouldOpenBrowser := true