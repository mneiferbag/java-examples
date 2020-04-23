Java Hello World Example
========================

License see file LICENSE in parent directory.

This was created using the following command in the parent directory.

    mvn archetype:generate -DgroupId=de.mneifercons.hello -DartifactId=hello -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

Build the application with the following command in the current directory.

    mvn package

Run the application with the following command in the current directory.

    java -cp target/hello-1.0-SNAPSHOT.jar de.mneifercons.hello.App

See [Maven in 5 Minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html) documentation.
