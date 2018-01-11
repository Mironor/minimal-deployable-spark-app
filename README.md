# minimal-deployable-spark-app
Minimal spark application (using sbt-assembly) to test different paas services

# How to run
### AWS
Make sure you installed and configured [aws-cli](https://aws.amazon.com/cli/)

```
cd aws
./update_jar.sh # don't forget to change the path to where to store the jar on S3
./run_job.sh # returns the id of the job visible in your AWS EMR console 

```