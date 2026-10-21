object singletonDemo {
def main(args: Array[String]): Unit = {
  val demoObjectA=new demoClassA
  println(demoObjectA.x)
  println(demoObjectA.y)
  val result = demoObjectA.addValue()
  println(result)
  
}

}

class demoClassA {
  val x=2
  val y=5.5
  def addValue() = x + y
  
  println(s"x value is ${x} and y value is ${y}")
}
