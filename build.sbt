name := "swole-server"

version := "0.1"

scalaVersion := "2.13.6"

lazy val Http4sVersion = "1.0.0-M21"
lazy val CirceVersion = "0.14.0-M5"
lazy val H2DatabaseVersion = "1.4.200"
lazy val ScalikeJDBCVersion = "3.5.0"
lazy val LogBackVersion = "1.2.3"
lazy val ScalaMockVersion = "5.1.0"
lazy val ScalaTestVersion = "3.2.9"
lazy val TsecVersion = "0.4.0-M11"
lazy val ScalaBcryptVersion = "4.1"
lazy val JWTScalaVersion = "8.0.3"

enablePlugins(JavaAppPackaging)

libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-blaze-server" % Http4sVersion,
  "org.http4s" %% "http4s-circe" % Http4sVersion,
  "org.http4s" %% "http4s-dsl" % Http4sVersion,
  "io.circe" %% "circe-generic" % CirceVersion,
  "com.h2database" % "h2" % H2DatabaseVersion,
  "org.scalikejdbc" %% "scalikejdbc" % ScalikeJDBCVersion,
  "org.scalikejdbc" %% "scalikejdbc-config" % ScalikeJDBCVersion,
  "ch.qos.logback" % "logback-classic" % LogBackVersion,
  "org.scalamock" %% "scalamock" % ScalaMockVersion % Test,
  "org.scalatest" %% "scalatest" % ScalaTestVersion % Test,
  "org.scalatest" %% "scalatest-funspec" % ScalaTestVersion % Test,
  "com.github.t3hnar" %% "scala-bcrypt" % ScalaBcryptVersion,
  "com.github.jwt-scala" %% "jwt-circe" % JWTScalaVersion
)
