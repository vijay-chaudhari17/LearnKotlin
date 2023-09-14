
class Calculator(){
    companion object{
        var max = 100
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}
class User(var firstName: String, var lastName: String, var age: Int) {
    init{
        println("User: $firstName was created")
    }
}