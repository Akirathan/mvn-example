# JPMS demo
This is a simple demo of the Java Platform Module System (JPMS) introduced in Java 9.

You will need a JDK 9+ and Maven to run this demo.

## Build a fat jar
```shell
mvn compile jar:jar install
mvn -f runner package shade:shade
```


