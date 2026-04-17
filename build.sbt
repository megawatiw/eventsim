name := "eventsim"

version := "1.0"

scalaVersion := "2.12.21"

libraryDependencies += "org.apache.commons" % "commons-math3" % "3.5"

libraryDependencies += "de.focus-shift" % "jollyday-core" % "2.0.0"

libraryDependencies += "de.focus-shift" % "jollyday-jaxb" % "2.0.0"

libraryDependencies += "org.rogach" %% "scallop" % "6.0.0"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-core" % "2.6.1"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.6.1"

libraryDependencies += "org.apache.kafka" % "kafka_2.13" % "4.2.0"

libraryDependencies += "org.apache.kafka" % "kafka-clients" % "4.2.0"

libraryDependencies += "com.lihaoyi" %% "upickle" % "3.1.0"

ThisBuild / assemblyMergeStrategy := {
    case PathList("module-info.class" ) => MergeStrategy.discard
    case PathList("javax", "xml", "bind", ps @ _*) => MergeStrategy.first
    case x => 
	val old = (ThisBuild / assemblyMergeStrategy).value
	old(x)
}
