case class Cars(name:String,model:Int) {

  val carName = name
  val carModel = model
  def printDetails(): Unit = {
    println(s"Car name is ${carName} and model is ${carModel}")
  }

}

object caseClass {
 def main(args:Array[String]): Unit = {
   val newCar =  Cars("BMW",500)
   newCar.printDetails()
   val secondCar=newCar.copy("Testla")
   secondCar.printDetails()
   println(newCar)
   println(secondCar)
   newCar match { case Cars(a,b) => print(a,b) }
   println(newCar!=secondCar)


 }
}
