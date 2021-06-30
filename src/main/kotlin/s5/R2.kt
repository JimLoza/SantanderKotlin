package s5

fun main() {
    val calificaciones = listOf(10,8, 9 ,5,3,2,5,1,7,6,9,4,10,3,6,2,6,5)

    val promedio = calificaciones.sum()/calificaciones.size

    println("Promedio es $promedio")
}