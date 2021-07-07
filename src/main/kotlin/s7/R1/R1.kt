package s7.R1

fun main() {
    val names: List<String?> = listOf("Name one", null, "Name Three")

//    safe call
    names.forEach { it?.let { println(it) } }

    names.forEach {
        val resultado = it ?: "Casilla vacia"
        println("Reto con Elvis $resultado")
    }

    println("----------------")
    val persona = Person("Jim")
    println(persona.getapellido())
//    println("Imprimiendo nombre completo apellido nulo ${persona.getNombreCompleto()}")

    println("-------------------")
    val persona2 = Person("Juan", "Loza")
    println("Imprimiendo nombre completo apellido no nulo ${persona2.getNombreCompleto()}")
}