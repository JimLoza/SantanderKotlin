package s2

fun main() {
    var n = 0;
    do {
        println(n)
        n++
    }while (n <= 20)

    println("Nombre repetido: ${nomRep("Juan")}")

    println(filterUsage("Juan"));
}

fun nomRep(buscar: String):Int{
    val nombres = listOf(
        "Pedro Luis",
        "Juan Manuel",
        "Juan Luis",
        "María Inés",
        "Romeo",
        "Ernesto",
        "Juan Pedro",
        "Ariadna",
        "Mireya María",
        "Ana Sofía",
        "José Juan",
        "Juan",
        "Juan",
        "Juan"
    )
    var x = 0;
    for (nombre in nombres){

        if (buscar in nombre){ //utilizar el "==" nos compara el nombre exactamente y si utilizamos "in" nos lo compara aunque no sean iguales
            x++
        }
    }

    return x;
}

fun filterUsage(name: String): Int {
    val nombres = listOf(
        "Pedro Luis",
        "Juan Manuel",
        "Juan Luis",
        "María Inés",
        "Romeo",
        "Ernesto",
        "Juan Pedro",
        "Ariadna",
        "Mireya María",
        "Ana Sofía",
        "José Juan",
        "Juan",
        "Juan",
        "Juan"
    )

    return nombres.filter { name in it }.count();
}

