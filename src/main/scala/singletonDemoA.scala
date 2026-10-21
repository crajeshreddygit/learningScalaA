object singletonDemoA {
def main(args: Array[String]): Unit = {
  // val demoObjectB1=new demoClassB it is not a class, so cant create object
  println(demoClassB.x)
  println(demoClassB.y)
  val result = demoClassB.addValue()
  println(result)
  
}

}

object demoClassB {
  val x=2
  val y=5.5
  def addValue() = x + y
  
  println(s"x value is ${x} and y value is ${y}")
}
