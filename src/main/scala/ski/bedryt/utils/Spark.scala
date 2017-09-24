package ski.bedryt.utils

import org.apache.spark.sql.SparkSession

/**
  * Singleton holding reference to the Spark Session and initialising its parameters
  */
object Spark {
  lazy val session: SparkSession = SparkSession.builder
    .appName("Spark Cloud Benchmark").master("local[*]").getOrCreate()
}
