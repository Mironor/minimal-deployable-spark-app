package ski.bedryt

import org.rogach.scallop.ScallopConf

/**
  * Handles application's parameters
  * https://github.com/scallop/scallop
  */
object Arguments {
  def apply(arguments: Array[String]) = new ScallopConf(arguments) {
    banner(
      """
       TBD
      """
    )

    private val piArgument = opt[Boolean](
      "pi",
      noshort = true,
      descr = "runs pi (approximate) calculation and outputs the result to the driver stdout"
    )

    verify()

    val pi: Boolean = piArgument.getOrElse(false)

  }
}
