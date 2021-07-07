package s7.E2

import java.lang.Exception

fun main() {

    try {
        val v = "bedu.org"
        v.toInt()
    }catch (e:Exception){
        e.printStackTrace()
        println("no se puedo convertir, hubo errores")
    }finally {
        println("Proceso terminado")
    }

    println("asd")
}