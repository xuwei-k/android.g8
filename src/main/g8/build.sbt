import AndroidKeys._

name := "$name$"

scalaVersion := "$scala_version$"

platformName in Android := "android-$api_level$"

seq(
  {AndroidProject.androidSettings ++ TypedResources.settings ++ AndroidMarketPublish.settings}:_*
)

keyalias in Android := "$key_alias$"

libraryDependencies ++= Seq()

initialCommands in console := {
  "import $package$._"
}
