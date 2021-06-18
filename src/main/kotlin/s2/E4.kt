package s2

fun main() {
    val numeros = listOf("one", "two", "three", "four", "five");


    println(numeros);

    println("Numero de elementos: ${numeros.size}")
    println("Numero de elementos: ${numeros.size}")
    println("Numero de elementos: ${numeros.size}")
    println("Numero de elementos: ${numeros.size}")
    println("Numero de elementos: ${numeros.size}")
    println("Numero de elementos: ${numeros.size}")

    //Eror por ser inmutable
    //numeros.add("six")

    val list = mutableListOf(1,2,3,4,)
    //Agregar elementos
    list.add(5)
    //Remover elementos por index
    list.removeAt(1)
    //Modificar elementos
    list[0] = 0

    println(list)

    val numSet: Set<Int> = setOf(0,1,2,3,4,5)
    val reverseNumSet: Set<Int> = setOf(5,4,3,2,1,0)

    println(numSet == reverseNumSet)

    val namesToAges: Map<String, Int> = mapOf("user_one" to 20, "user_two" to 25)

    for ((key, value) in namesToAges ){
        println("$key tiene $value años")
    }


}
