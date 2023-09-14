/*
    * Inheritance
    * Base Class/ Parent Class/ Super Class -> The class from which you are inheriting
    *
    * */
fun main(args: Array<String>) {
    val car = Car("Ford", "Black", 4)
    val plane = Plane("Boeing", "White & Blue", 4, 8)
    car.stop()
    car.move()
    println()
    plane.move()
    plane.stop()

}

open class Vehicle(val name: String, val color: String){
    open fun move(){
        println("$name is moving")
    }
    open fun stop(){
        println("$name has stopped")
    }
}

class Car(name: String, color: String, val doors: Int): Vehicle(name, color){
    override fun move(){
        speeding()
        super.move()
    }
    fun speeding(){
        println("I am speed")
    }
}

class Plane(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color){
    override fun move(){
        flying()
    }
    fun flying(){
        println("The plane is flying")
    }

}