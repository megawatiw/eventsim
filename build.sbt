name := "eventsim"

version := "1.0"

libraryDependencies += "org.apache.commons" % "commons-math3" % "3.5"

libraryDependencies += "de.jollyday" % "jollyday" % "0.5.1"

libraryDependencies += "org.rogach" %% "scallop" % "6.0.0"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-core" % "2.6.1"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.6.1"

libraryDependencies += "org.apache.kafka" % "kafka_2.10" % "0.8.2.1"

libraryDependencies += "com.lihaoyi" %% "upickle" % "3.1.0"

libraryDependencies += "com.sun.xml.bind" % "jaxb-impl" % "2.3.3"

/* libraryDependencies ++= Seq(
  "javax.xml.bind" % "jaxb-api" % "2.3.1",
  "com.sun.xml.bind" % "jaxb-impl" % "2.3.4", // JAXB implementation
  "com.sun.xml.bind" % "jaxb-core" % "2.3.0.1",
  "javax.activation" % "activation" % "1.1.1" // Required for JAXB on newer JDKs
) */

mergeStrategy in assembly ~= ( (old) => {
    case PathList("module-info.class" ) => MergeStrategy.discard
    case PathList("javax", "xml", "bind", ps @ _*) => MergeStrategy.first
    case x => old(x)
  }
)