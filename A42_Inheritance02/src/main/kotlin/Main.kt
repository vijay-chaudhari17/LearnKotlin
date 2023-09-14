fun main(args: Array<String>) {
    val view = View()
    val button = Button("Button", "Center")
    val roundButton = RoundButton("RoundButton", "Left", 180)

    view.draw()
    button.draw()
    roundButton.draw()
}

open class View(){
    open fun draw(){
        println("Drawing the view")
    }
}
open class Button(val text: String, val orientation: String): View(){
    override fun draw(){
        //here is the code for creating a button
        println("Drawing the button")
        super.draw()
    }
}
class RoundButton(text: String, orientation: String, val corners: Int): Button(text, orientation){
    override fun draw(){
        println("Drawing the round button")
        super.draw()
    }
}

