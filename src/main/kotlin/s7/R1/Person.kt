package s7.R1

import java.lang.IllegalArgumentException

class Person(nombre: String, apellido:String? = null) {

    var apellido:String? = apellido
    var nombre: String = nombre

    fun getapellido():String{
        val resultado = apellido ?: "Casilla vacia"
        return resultado

    }

    fun getNombreCompleto() : String{
        val resultado = "$nombre ${apellido ?: throw IllegalArgumentException("Necesitas los apellidos")}"
        return resultado
    }
}