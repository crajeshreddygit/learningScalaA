
class companionDemo {
  var x=5

  def getValue(): Unit = {
    println(s"value os x ix :${x} and value of y is ${companionDemo.y}")
  }
}

object companionDemo {
  var y = 2.2

  def main(args: Array[String]): Unit = {
    val objectcompanionDemo = new companionDemo()
    println(s"Value of x from object is ${objectcompanionDemo.x} and value of of y is ${y}")
    objectcompanionDemo.getValue()

  }
}
