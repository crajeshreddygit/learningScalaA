object Strings1 {
  def main(args:Array[String]): Unit = {
    var greetings = "Hello World"
    val lenOfStr = greetings.length
    println(lenOfStr)
    var Var1="Hello"
    var Var2="World"
    var Var3= Var1+Var2
    println(Var3)
    var Var4=Var1.concat(Var2).concat("!!!")
    println(Var4)
    var Var11="Hello"
    var Var22="Worlds"
    println(Var1.equals(Var11))
    println(Var2.equals(Var22))
    println(Var11==Var1)

  }

}
