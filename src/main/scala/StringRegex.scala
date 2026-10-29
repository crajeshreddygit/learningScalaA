import scala.util.matching.Regex

object StringRegex {
  def main(args:Array[String]): Unit = {
    val pattern = new Regex("Hello")
    val stringToFind="Hello how are you? hello again"
    val patt = "(H/h)ello".r
    val ne=patt.findAllIn(stringToFind).toArray
    for(j <- ne)println(j)
    println(pattern.findFirstIn(stringToFind))
    println(pattern.findAllIn(stringToFind).mkString(","))
    val nw=pattern.findAllIn(stringToFind).toArray
    for(i <- nw)println(i)

    val pattern1=new Regex("[0-9]+")
    val strinToFind1="I am Raaj Today is Oct 23 2026 and time is 9 pm"
    println(pattern1.findAllIn(strinToFind1).mkString(","))
    val patt2="Raaj".r  //
    patt2.findAllIn(strinToFind1).foreach(i=>println(i))
  }

}
