object Strings4 {
  def main(args:Array[String]): Unit = {
    case class Car(name:String,cost:Int)
    val mercedes = Car("Mercedes",50000)
    val bmw=Car("BMW",60000)
    val jagaur=Car("Jaguar",70000)

    for(car <- List(mercedes,bmw,jagaur)){
      println(car)
      car match {
        case Car("Mercedes",50000) =>println("Car is Mercedes")
        case Car("BMW",60000) =>println("Car is BMW")
        case Car(name,cost)=>println(s"Car is $name and cost is $cost")
        case _=>println("Which is your Caar?")
      }
    }
  }

}