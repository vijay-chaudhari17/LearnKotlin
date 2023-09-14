/*
   What is a Singleton?
   - A singleton is a design pattern in Kotlin in which one can have
   only one instance of a particular object & we can use this instance globally.
   So, one don't need to create an instance every time need to use that
    */


fun main() {
   val shreyaAccount = bankAccount("Shreyas")
    shreyaAccount.deposit(1000)
    shreyaAccount.withdraw(500)
    shreyaAccount.deposit(-20)
    shreyaAccount.withdraw(-100)
    shreyaAccount.deposit(50000)
    shreyaAccount.withdraw(50500)
    val finalBalance = shreyaAccount.calculateBalance()
        println(finalBalance)

//    shreyaAccount.balance = 50000
//    println(shreyaAccount.balance)

    /*for(transaction in shreyaAccount.transactions){
        var element = 0
        element += transaction
        println("$element")
    }*/

}
class bankAccount(var accountName: String = "userName"){
    private var balance =  0
    private var transactions = mutableListOf<Int>()


    fun deposit(amount: Int){
        if(amount > 0){
            transactions.add(amount)
            this.balance += amount
            println("$amount deposited. Currently the balance is ${this.balance}")
        } else {
            println("Cannot deposit negative sums")
        }
    }

    fun withdraw(withdrawal: Int){
        if(-withdrawal < 0 && withdrawal <= this.balance) {
            transactions.add(-withdrawal)
            this.balance += -withdrawal
            println("$withdrawal withdrawn. Currently the balance is ${this.balance}")
        } else {
            println("Cannot withdrawn negative sums")
        }
    }

    fun calculateBalance(): Int{
        this.balance = 0
        for(transaction in transactions){
            this.balance += transaction
        }
        return this.balance
    }
}
