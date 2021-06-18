package s2

fun main() {
    //Toma el ultimo valor seria de 1 - 5
    for (i in 1..5){
        println(i)
    }

    //Until no toma el ultimo valor seria de 1 - 4
    for (i in 1 until 5){
        println(i)
    }

    //El step hace que el conteo vaya de 2 en 2 en este caso
    for (i in 0..10 step 2){
        println(i)
    }

    //Declarar una lista
    val nombres = listOf(
        "Jim",
        "Juan",
        "Cristina"
    )

    //Lista de numeros
    //val numbers = listOf(1,2,3,4,5)

    for (nombre in nombres){
        println(nombre);
    }

    //Imprimir una lista con forEach con Kotlin
    println("Lista con forEach")
    nombres.forEach { println(it) }

    for (nombre in nombres){
        println(nombre)
        if (nombre=="Juan"){
            println("Persona encontrada")
            break
        }
    }

    var x = 20

    while (x == 20){
        println()
        x--
    }
}