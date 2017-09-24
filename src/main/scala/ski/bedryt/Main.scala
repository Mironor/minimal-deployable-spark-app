package ski.bedryt

import com.typesafe.config.ConfigFactory
import scala.math.random
import ski.bedryt.utils.Spark

object Main extends App{

  val arguments = Arguments(args)

  lazy val config = ConfigFactory.load()

  if (arguments.pi) runPi()

  Spark.session.stop()

  private def runPi(): Unit ={
    val slices = 2
    val n = math.min(100000L * slices, Int.MaxValue).toInt // avoid overflow
    val count = Spark.session.sparkContext.parallelize(1 until n, slices).map { i =>
      val x = random * 2 - 1
      val y = random * 2 - 1
      if (x*x + y*y < 1) 1 else 0
    }.reduce(_ + _)
    println("Pi is roughly " + 4.0 * count / n)
  }

}
