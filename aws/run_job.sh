#!/usr/bin/env bash


aws emr create-cluster \
--applications Name=Hadoop Name=Spark \
--ec2-attributes file://ec2_attributes.json \
--release-label emr-5.8.0 \
--log-uri 's3n://spark-cloud-benchmark-oregon/emr/logs/' \
--steps file://steps.json \
--instance-groups file://instance_groups.json \
--configurations file://configurations.json \
--auto-terminate \
--service-role EMR_DefaultRole \
--enable-debugging \
--name 'Minimal spark app' \
--scale-down-behavior TERMINATE_AT_INSTANCE_HOUR \
--region us-west-2