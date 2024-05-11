#!/usr/bin/sh

LIB=lib/target/lib-1.0-SNAPSHOT.jar
PROVIDER=provider/target/provider-1.0-SNAPSHOT.jar
ALTERNATIVE_PROVIDER=alternative-provider/target/alternative-provider-1.0-SNAPSHOT.jar
RUNNER=runner/target/runner-1.0-SNAPSHOT.jar

set -x
java --module-path $LIB:$PROVIDER:$ALTERNATIVE_PROVIDER:$RUNNER --module org.enso.runner/org.enso.runner.Runner
