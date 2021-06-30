package s5

fun main() {
    //    Funciones de orden superior
    fun calculadora(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
        return operacion(a, b)
    }

    fun suma(a: Int, b: Int) = a + b

    val suma = calculadora(10, 5, ::suma)

    println(suma)

}