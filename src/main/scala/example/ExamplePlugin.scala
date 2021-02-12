package example

import sbt._, Keys._

object ExamplePlugin extends AutoPlugin {
  object autoImport {
    val foo = settingKey[File]("")
  }
}