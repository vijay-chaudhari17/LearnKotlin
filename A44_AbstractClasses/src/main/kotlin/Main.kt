    /*
    * We cannot create an instance of an abstract class
    * They are only meant to be inherited by another class
    * Similar to interface but in abstract class, we can only have properties
    * Abstract function cannot have a body
    * When there are abstract functions in the inherited class then we must have to override it
    *
    * Have some API & those API just want to define the function & API will generate all the code
    * */
fun main(args: Array<String>) {
}
abstract class Vehicle{
    var text = "someText"
    abstract fun move()
    abstract fun stop()
}
class Car(var name: String, var color: String, val doors: Int): Vehicle(){
    override fun move() {
    }
    override fun stop() {
    }
}
