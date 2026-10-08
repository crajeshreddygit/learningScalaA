
class demoClass3(val a:Int,val b:Double,val c:String) {
  val x =a;
  var y =b;
  val z=c
  println(s"x value is ${x}, y value is ${y}, value of z is ${z}")

  def addNumber()={
    x+y
  }

  def this()  = {
    this(a=11,b=22.00,c="Raaj")
    println("Aux  with 0 param passed")
  }
  def this(a:Int) = {
    this(a,b=77,c="RajReddy")
    println("Aux with 1 param")

  }
  def this(a:Int,b:Double) = {
    this(a,b,c="RajReddyChalla")
    println("Aux with 2 param")

  }
}

object constructorDemo3 {
def main(args:Array[String]):Unit={
  val demoObject1 = new demoClass3(5,7.2,"Hello World")
  val demoObject2= new demoClass3()
  val demoObject4= new demoClass3(66)
  val demoObject5= new demoClass3(1,2.0)

}
}
