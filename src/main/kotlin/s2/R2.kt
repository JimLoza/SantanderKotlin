package s2

fun main() {

    println("El tipo de triangulo es: ${tipoTriangulo(10,12,11)}");

    tipoDato(false)
}

fun tipoTriangulo(lad1: Int, lad2: Int, lad3: Int){
    if (lad1 == lad2 && lad2 == lad3 && lad1 == lad3){
        println("Es un triangulo Equilatero");
    } else if (lad1 == lad2 || lad2 == lad3 || lad1 == lad3){
        println("Es un triangulo Isóceles");
    } else{
        println("Es un triangulo Escaleno");
    }
}

fun tipoDato(dato: Any){
    when(dato){
        is String -> println("Es un String")
        is Float -> println("Es un float")
        is Double -> println("Es un Double")
        is Boolean -> println("Es un boleano")
    }
}