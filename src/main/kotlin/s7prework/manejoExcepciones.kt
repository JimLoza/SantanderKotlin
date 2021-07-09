package s7prework

import java.lang.Exception

fun main() {
    //Arrojar una excepcion
//    throw Exception("Esta es una excepcion")

    //Intento con el try catch

    try {
        val numbers = arrayOf(1,2,3)

        val numberFour = numbers[4]
        println("El cuarto numero del arreglo es: $numberFour")
    }catch (e: Exception){
        println("El error fue: $e")
    }finally {
        println("Prueba de codigo terminada")
    }
}