
class demoClass1(val a:Int,val b:Double,val c:String) {
  val x =a;
  var y =b;
  val z=c

  def addNumber()={
    x+y
  }
  println(s"x value is ${x}, y value is ${y}, value of z is ${z}")
}

object constructorDemo1 {
def main(args:Array[String]):Unit={
  val demoObject1 = new demoClass1(5,7.2,"Hello World")
  val demoObject2= new demoClass1(6,8.4,"Hello Again")
  val result = demoObject1.addNumber()
  println(s"x+y is ${result}")
  val result2=demoObject2.addNumber()
  println(s"x+y is ${result2}")
  demoObject1.y=99
  print(s"demoObject1 y value modified is ${demoObject1.y}")


}
}
