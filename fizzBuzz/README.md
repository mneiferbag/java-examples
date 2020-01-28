Fizz buzz programming exercise
==============================

License see file LICENSE in parent directory.

This was created using the following command in the parent directory. Using Apache Maven 3.6.3 on Java 11.

```
mvn archetype:generate -DgroupId=com.example -DartifactId=step1 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Build the application with the following command in the current directory. 
This runs the unit tests as well.

```
mvn package
```

Run the application with the following command in the current directory.
Two integer command line parameters are expected.

```
java -cp target/step1-1.0-SNAPSHOT.jar com.example.App 2 16
```

Bash script is provided to run the application.

```
./fizzbuzz 2 16
```

