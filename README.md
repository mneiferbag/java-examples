# Java Development Examples

Licensed under the MIT License. See file LICENSE.

Collection of Java development examples. Examples include code written in Java and Groovy.

## Java Development Kit (JDK)

The examples assume, that you have a JDK installed. You might want to have a look at Microsoft [Visual Studio Code Remote Development](https://code.visualstudio.com/docs/remote/remote-overview) to create a platform independent development environment.

On Ubuntu, install default JDK with `sudo apt install default-jdk`. Or install specific JDK with, for example `apt-get install openjdk-11-jdk`.

### JDK 14

Language features see [Java SE 14 (JSR 389) Final Release Specification](https://cr.openjdk.java.net/~iris/se/14/latestSpec/#Features).

- 305 Pattern Matching for instanceof (Preview)
- 359 Records (Preview)
- 361 Switch Expressions (Standard)
- 368 Text Blocks (Second Preview)

### JDK 11 (LTS)

Language features see [Java SE 11 (JSR 384) Final Release Specification](https://cr.openjdk.java.net/~iris/se/11/spec/fr/java-se-11-fr-spec/#Feature-details).

- 323 Local-Variable Syntax for Lambda Parameters

## GitHub CodeQL

To configure the JDK used by CodeQL, add the following step before all others.

    - name: Setup Java JDK
      uses: actions/setup-java@<chose tag>
      with:
         java-version: 11

## Links

* General
    * [Cucumber Docs](https://cucumber.io/docs/cucumber/ "Cucumber Docs")
    * [DevStyle - Genuitec](https://www.genuitec.com/products/devstyle/ "DevStyle - Genuitec")
    * [EclEmma - Java Code Coverage for Eclipse](https://www.eclemma.org/ "EclEmma - Java Code Coverage for Eclipse")
    * [Jackson](https://github.com/FasterXML/jackson) the Java JSON library
    * [Java BluePrints: Guidelines, patterns, and code for end-to-end applications](https://www.oracle.com/technetwork/java/index-jsp-136701.html "Java BluePrints: Guidelines, patterns, and code for end-to-end applications")
    * [Java Technology Reference](https://www.oracle.com/technetwork/java/index-jsp-142903.html "Java Technology Reference")
    * [jsonschema2pojo](http://www.jsonschema2pojo.org/ "jsonschema2pojo")
    * [Oracle Help Center](https://docs.oracle.com/en/ "Oracle Help Center")
    * [Project Lombok](https://projectlombok.org/)
    * [RESTful Web Services](https://github.com/mneiferbag/java-jaxrs)
    * [Secure Coding Guidelines for Java SE](https://www.oracle.com/technetwork/java/seccodeguide-139067.html "Secure Coding Guidelines for Java SE")
    * [Spring Boot Example](https://github.com/mneiferbag/java-spring-boot)
    * [The Java Tutorials](https://docs.oracle.com/javase/tutorial/ "The Java Tutorials")
* Static Code Analysis
    * [Checkstyle](https://checkstyle.sourceforge.io/ "Checkstyle")
    * [SonarLint](https://www.sonarlint.org/)
    * [SpotBugs](https://spotbugs.github.io/ "SpotBugs")
* Unit testing
    * [Hamcrest](http://hamcrest.org/ "Hamcrest")
    * [JUnit 5](https://junit.org/junit5/ "JUnit 5")
    * [Mockito framework site](https://site.mockito.org/ "Mockito framework site")
    * [TestNG](https://testng.org/ "TestNG")
* Apache
    * [Apache Groovy](https://www.groovy-lang.org/ "Apache Groovy")
    * [Apache Log4j](https://logging.apache.org/log4j/ "Apache Log4j")
    * [Apache Maven](http://maven.apache.org/ "Apache Maven")
