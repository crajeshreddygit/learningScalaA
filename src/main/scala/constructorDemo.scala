
class demoClass {
  val x =3;
  val y =2;

  def addNumber()={
    x+y
  }
  println(s"x value is ${x}, y value is ${y}")
  val z = addNumber()
  println(s"value of z is ${z}")
}

object constructorDemo {
def main(args:Array[String]):Unit={
  val demoObject1 = new demoClass

}
}
