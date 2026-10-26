import scala.util.control.Exception.catching


object DemoCatching {
  def main(args: Array[String]): Unit = {
   val catchEx = catching(classOf[ArithmeticException], classOf[ArrayIndexOutOfBoundsException]).withApply(e => println(e))

    val a = catchEx(10 / 10)
    if (a != ()) {

      println (a)
  }
  }

}
