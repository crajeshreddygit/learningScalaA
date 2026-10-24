object Strings3 {
  def main(args:Array[String]): Unit = {
    val name="Raaj"
    println(s"Hello, I am $name")
    println(f"Hello this is $name%s")
    println(raw"who is this\nRaj")

    def matchPattern(x:Int)= x match {
      case 1=> "ONE"
      case 2=>"TWO"
      case _=>"NOt SURE"
    }
    println(matchPattern(1))
    println(matchPattern(3))

  }


}
