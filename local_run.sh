#!/usr/bin/env bash

#!/usr/bin/env bash

sbt clean && sbt assembly

# run conversion tests
docker run --rm -it -p 4040:4040 \
 -v $(pwd)/target/scala-2.11/minimal.jar:/minimal.jar \
 gettyimages/spark \
 bin/spark-submit \
 --class ski.bedryt.Main \
 /minimal.jar --pi