fun main(args: Array<String>) {

    // Object Expression or Anonymous Class
    //val clickListener = ClickListner()

    val loginButton = Button("Login", 12321, object: OnClickListner{
        override fun onClick(){

        }
    })
    val signUpButto = Button("SignUp", 12322, object: OnClickListner{
        override fun onClick(){

        }
    })
}


class Button(val text: String, val id: Int, onClickListener: OnClickListner)

class ClickListner() : OnClickListner{
    override fun onClick(){

    }
}

interface OnClickListner{
    fun onClick()
}

