object helloWorld2 {

  def main(args: Array[String]): Unit = {
    println("World is good")
    var result = add(5,7)
    println(result)
    var resultB=addB(44,33)
    println(resultB)
  }

  def add(x:Int,y:Int):Int={
    var z= x+y
    return z
  }

  def addB(x:Int,y:Int)=x+y

}


