
class demoClass2(val a:Int=99,val b:Double=88.0,val c:String="Hello Scala") {
  val x =a;
  var y =b;
  val z=c

  def addNumber()={
    x+y
  }
  println(s"x value is ${x}, y value is ${y}, value of z is ${z}")
}

object constructorDemo2 {
def main(args:Array[String]):Unit={
  val demoObject1 = new demoClass2(5,7.2,"Hello World")
  val demoObject2=new demoClass2(b=2.0)

}
}
