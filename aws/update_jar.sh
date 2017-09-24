#!/usr/bin/env bash

cd ..

sbt clean && sbt assembly

aws s3 cp target/scala-2.11/minimal.jar s3://spark-cloud-benchmark-oregon/emr/