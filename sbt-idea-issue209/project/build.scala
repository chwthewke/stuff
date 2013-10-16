import sbt._
import Keys._
import com.github.retronym.sbtxjc.SbtXjcPlugin
import sbtprotobuf.{ProtobufPlugin => PB}

object build extends Build {
  lazy val root = Project("main", file("."), settings = Defaults.defaultSettings ++ SbtXjcPlugin.xjcSettings ++ PB.protobufSettings ++ Seq(
    version in PB.protobufConfig := "2.5.0",
    SbtXjcPlugin.xjcCommandLine += "-verbose"
  ))
}
