fun main(args: Array<String>) {

}

/*As in inheritance we can only inherit from only one class
* Delegation is used when one have to inherit from two or more classes
* */
class App: A by FirstDelegate(), B by SecondDelegate(){
    override fun print() {

    }

    override fun print2() {

    }
}
interface A{
    fun print()
}

interface B{
    fun print2()
}

open class FirstDelegate: A{
    override fun print(){

    }
}

open class SecondDelegate: B{
    override fun print2(){

    }
}