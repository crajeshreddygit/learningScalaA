import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object DemoATryCatch {
  def main(args: Array[String]): Unit = {
    try {
      val f = new FileReader("/Users/rajeshreddychalla/ScalaProjectIntelliJ/learningScalaA/src/main/scala/input.txt")
      val a= 10/1
      println(a)
      val array = Array(10)
      println(array(11))

    }  catch {
      case e: FileNotFoundException => println("Exception input file is not there")

      case e:IOException => println("Exception , can not read file")
      case e:ArithmeticException=>println(e)
      case e: ArrayIndexOutOfBoundsException =>  println(e)
      }
    finally {
      println("Alwasys executed with/without exception,except on system erro")
    }
    }
    }



