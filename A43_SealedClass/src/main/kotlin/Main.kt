fun main(args: Array<String>) {
   var success = Result.Success("SUCCESS")
    var progress = Result.Progress("PROGRESS")
    getData(progress)
}

fun getData(result: Result){
    when(result){
        is Result.Error.RecoverableError -> result.showMessage()
        is Result.Success -> result.showMessage()
        is Result.Progress -> result.showMessage()
        is Result.Error.NonRecoverableError -> result.showMessage()
    }
}
/*
* We cannot define properties to the enum classes
* So, in that case we have to use sealed classes
*/

/*
* When only singularity is in the show
*/
enum class Result00{
    SUCCESS,
    ERROR;
}
sealed class Result(val message: String){
    fun showMessage(){
        println("Result: $message")
    }
    class Success(message: String): Result(message)
   sealed class Error(message: String): Result(message){
       class RecoverableError(exception: Exception, message: String): Error(message)
       class NonRecoverableError(exception: Exception, message: String): Error(message)
   }
    class Progress(message: String): Result(message)
}

