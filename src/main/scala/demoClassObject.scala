

class Car {
  var topClassExtraCost =0
  private var roadTax = 100
  protected var xyz= 10

  def cost(basicCost:Int) = basicCost + topClassExtraCost + roadTax

  def checkTax(): Int = {
    roadTax
  }

}
class smallCar extends Car {
  xyz=30
//  println(roadTax) // cannot access as roadTax is private

}


object demoClassObject {

  def main(args: Array[String]):Unit={
    println("Hello abc")
    var bmw = new Car
    println("cost of Car is :"+bmw.cost(500))
//    print(bmw.xyz) // cannot access as xyz is protected
    println("Road Tax is :"+bmw.checkTax()) // side effects of private

  }

}
