package s5prework

fun main() {
    //esto no es programación funcional, porque la variable está mutando, es //decir, su valor inicial cambia.
//    var name = "daniel"
//    name = "Daniel Bedu"

//    Una aproximación funcional del código anterior sería el siguiente:
    fun getName(name:String):String{
        return "$name Bedu"
    }
    val name = getName("Daniel");
}