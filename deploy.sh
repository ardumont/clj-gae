#!/bin/bash -xe

# cleanup
lein clean

# workaround to deploy all lib in classpath
lein uberjar
mkdir -p war/WEB-INF/lib
mv target/clj-gae-1.0.0-SNAPSHOT-standalone.jar war/WEB-INF/lib/

# aot compile clj in war/WEB-INF/classes
lein compile

# upload war in appengine
appcfg.sh update war
