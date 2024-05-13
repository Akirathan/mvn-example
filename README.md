# JPMS demo
This is a simple demo of the Java Platform Module System (JPMS) introduced in Java 9.

You will need a JDK 9+ and Maven to run this demo.

The architecture of the application:

![Architecture](./simple-fat-jar-app.svg)

## Fat JAR
Compile everything and assemble the fat jar:
```shell
mvn install
```

Run the fat jar:
```shell
java -jar runner/target/runner-1.0-SNAPSHOT.jar
```

## Modular JARs
Compile all the modules:
```shell
mvn compile jar:jar
```

Run the main module with all the modules on module-path:
```shell
java --module-path lib/target/lib-1.0-SNAPSHOT.jar:runner/target/runner-1.0-SNAPSHOT.jar:add-provider/target/add-provider-1.0-SNAPSHOT.jar:sub-provider/target/sub-provider-1.0-SNAPSHOT.jar --module runner/org.enso.runner.Runner
```

See the module description:
```shell
jar --describe-module --file runner/target/runner-1.0-SNAPSHOT.jar
```

List all the modules on module-path:
```shell
java --module-path lib/target/lib-1.0-SNAPSHOT.jar:runner/target/runner-1.0-SNAPSHOT.jar:add-provider/target/add-provider-1.0-SNAPSHOT.jar:sub-provider/target/sub-provider-1.0-SNAPSHOT.jar --list-modules
```

