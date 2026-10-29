object Strings2 {
  def main(ars:Array[String]): Unit = {
    val Str1=
      """One
        |Two
        |Three
        |Four
        |""".stripMargin

    println(Str1)
    val Str2=
      """
        $one
        $Two
        $Three
        $""".stripMargin('$')

    println(Str2)
  }


}
