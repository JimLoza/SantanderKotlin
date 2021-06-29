package s5prework

fun main() {

    val square = { number: Int -> number * number }
    val threeSquare = square(3)

    println("Tres al cuadrado vale $threeSquare")
    println("------------------------------")
//    Los lambdas con un sólo parámetro de entrada, pueden eliminar el nombre del parámetro y la flecha, utilizando el parámetro como it
    val square2: (Int) -> Int = { it * it }
    val threeSquare2 = square2(6)
    println("Valor square 2 $threeSquare2")
    println("------------------------------")
//    Se pueden asignar dos o más parámetros, declarando sus tipos así:
    val money: (String, Int) -> String = { currency, quantity -> "$quantity $currency" }
    money("Jim", 16)
//    Si no se regresa ningún valor, se puede usar el tipo Unit
    println("------------------------------")
    val printMoney: (String, Int) -> Unit = { currency1: String, quantity1: Int -> println("$quantity1 $currency1") }
    printMoney("Jim", 2000)
    println("------------------------------")
    // Función anónima en bloque
    fun(x: Int, y: Int): Int {
        return x + y
    }

    println("------------------------------")
    //    O podemos escribir su cuerpo como una expresión:
    fun(x: Int, y: Int): Int = x + y

//    La podemos asignar como parámetro de otra función o como variable
    println("------------------------------")
    val add = fun(x: Int, y: Int): Int = x + y


    println("------------------------------")
//    Para ejemplificar, crearemos un rango de números y filtraremos los datos mediante funciones anónimas:
    val isHigher = fun(item:Int) = item > 0 //Regresa true cuando sea un numero entero
    (0..10).filter(isHigher)

//    Como la función es usada una sola vez, podemos pasar directamente la función sin declararla:
    println("------------------------------")
    (0..10).filter(fun(item) = item > 0)


}