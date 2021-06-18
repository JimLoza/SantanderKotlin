package s2

import kotlin.math.pow

const val PI = 3.1416f;
const val PHI = 1.618f;

fun main() {
    val radius = 4f;

    val area = circleArea(radius);
    println(area);

    printName("Jim");
    printAge(16);

    println(getPi());

    val session = login("Andres", "1234");
    println("Usuario logeado? $session");



}

//Funciones

fun circleArea(radius: Float): Float { //El primer float es el tipo de dato que va a recibir y el segundo float es el tipo de dato que va a retornar
    return PI*radius.pow(2)
}

fun printName(nombre: String){
    println(nombre);
}

fun printAge(age: Int){
    println("Tengo $age años")
}

fun getPi():Float{
    return PI;
}

//funciones locales

fun login(user: String, password: String): Boolean {
    fun validate(input: String): Boolean {
        if (input.isEmpty()){
            return false
        }
        return true;
    }
    val userValidated = validate(user);
    val passValidate = validate(password)

    return  userValidated && passValidate
}
