fun main(){
var human=Humanbeing("Katama",24,45f)
human.eat(30)
human.speak("I love food")
    human.birthday()
    var user=details("Yvonne","katama","katamayvonne@gmail.com","0771461724","23!ever!")
    println(user.email)
    println(user.password)
}

class Humanbeing(var name:String,var age:Int,var weight:Float) {
    fun eat(foodweight: Int){
        println("I am eating $foodweight kgs of food")
        var weightnew=foodweight+weight
        println(weightnew)
        }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        var newage=age+1
        println(newage)
    }
}
data class details(var firstname:String,var lastname:String,var email:String,var phonenumber:String,var password:String)