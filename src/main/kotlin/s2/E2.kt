package s2

fun main() {
    /*if (true){
        println("si")
    }

    if (false){
        println("no")
    }
     */

    verifyAge()
}

fun verifyAge(){
    println("Ingresa la edad y da enter: ")
    val age = readLine()?.toInt(); //El signo de "?" evita que sea null el dato que se ingresa

    //Codigo escrito
    /*
    if (age!! > 18){
        println("Ya eres mayor de edad")
    }else if(age == 18) {
        println("Acabas de cumplir 18")
    }else {
        println("Eres menor de edad")
    }
     */

    //codigo recomendado por el compilador
    when {
        age!! > 18 -> {
            println("Ya eres mayor de edad")
        }
        age == 18 -> {
            println("Acabas de cumplir 18")
        }
        else -> {
            println("Eres menor de edad")
        }
    }
}

fun gradoEscolar(){
    println("Ingresa edad y presiona enter (Escribe solo el numero)");

    val age = readLine()?.toInt();

    when(age){
        0 -> println("A penas eres recien nacido!")
        1 -> println("Solo tienes un año de edad!")
        in 2..5 -> println("Estas en prescolar")
        in 6..11 -> println("Estas en la primaria ")
        in 12..14 ->  println("Estas en la secundari")
        in 15..17 -> println("Estas en bachillerato")
        in 18..25 -> println("Estas en la universidad")
        else -> {
            println("El SAT te esta buscando")
        }
    }
}