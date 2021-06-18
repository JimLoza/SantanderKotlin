const val number3 = 24;
const val  PI = 3.1416;

fun main() {
//    println("Hola Jim")

    var number1 = 3;
    number1 = 3;

    println(number1);

    val number2 = 7;
    println(number2);
    println(number3);

    //Decimal tipo de dato por defecto
    var decimal = 1.325;
    println(decimal.javaClass.kotlin); //Double

    //Volver flotante a variable decimal
    val flotante = 12.575F;
    println(flotante.javaClass.kotlin);

    //Declarar una variable const val con el valor de PI y multiplicarla por 2 veces nuestra variable decimal para sacar el perímetro de un círculo
    //Para multiplica
    val perimetro = 2 * PI * decimal;
    println("El perimetro es $perimetro");



    //Reto 3
    val y2 = -2;
    val y1 = 3;
    val x2 = -3;
    val x1 = 4;
    val m = (y2.toFloat()-y1)/(x2.toFloat()-x1);

    println("Resultado $m");


    //Reto final

    //Pre-work sesion 2
    fun saludar(){
        println("Hola BEDU!")
    }

    fun saludarArgs(nombre: String): String {
        return ""
    }

}