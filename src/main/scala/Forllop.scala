object Forllop {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 10)
      println(i)

    for (j <- 20 until 25)
      println(j)

    for(x <- 1 to 5) {
      for(y <- 6 to 10) {
        print(x,y)
      }
    }
    
  }

}
