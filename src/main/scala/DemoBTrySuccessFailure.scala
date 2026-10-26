import scala.util.Try
import scala.util.Success
import scala.util.Failure

object DemoBTrySuccessFailure {
  def main(args: Array[String]): Unit = {
    val a= Try (10/2)
    a match{
      case Success(value)=>println(value)
      case Failure(exception) => println(exception)
    }
  }

}
