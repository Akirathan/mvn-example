# JPMS demo
This is a simple demo of the Java Platform Module System (JPMS) introduced in Java 9.

You will need a JDK 9+ and Maven to run this demo.

The architecture of the application:

![Architecture](./simple-fat-jar-app.svg)

## Modular JARs
Compile all the modules and move them in the `runner/target/modules` directory.
```shell
mvn install
```

Run the main module with all the modules on module-path:
```shell
java --module-path runner/target/modules --module runner/org.enso.runner.Runner
```

See the module description:
```shell
jar --describe-module --file runner/target/modules/runner-1.0-SNAPSHOT.jar
```

List all the modules on module-path:
```shell
java --module-path runner/target/modules --list-modules
```

