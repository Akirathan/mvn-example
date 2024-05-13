# JPMS demo
This is a simple demo of the Java Platform Module System (JPMS) introduced in Java 9.

You will need a JDK 9+ and Maven to run this demo.

## Build a fat jar
```shell
mvn compile jar:jar install
mvn -f runner package assembly:single
```
Note that we need the `install` goal so that the `assembly:single` in `runner` works.


