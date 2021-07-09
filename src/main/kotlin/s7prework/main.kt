package s7prework

fun main() {
    //volviendo un dato nullable para que no haya NPE
    //la variable numero puede recibir un valor nullo porque agregamos " ? "
    var numero: Int? = 20
    numero = null


    //println("Valor: ${numero.toFloat()}") da error porque necesitar safe call

    //Safe Calls
    println(numero?.toFloat()) //Nos permite hacer esta operacion gracias al safe call agregando " ? " aunque el valor sera null


    //Operador !!
    //Operador !!
    //Este operador (llamado not-null assertion operator) permite tener tipos no nullables, lo que genera un comportamiento similar a las variables en Java. No se recomienda el uso de este operador (no por nada este se representa por símbolos de admiración, porque trata de advertirnos de su uso ), incluso en el sitio web oficial, llaman de forma sarcástica NPE-lovers a los que lo usan.
    //var numero1: Int? = null
    //println("valor:  ${numero1!!.toFloat()}") //aqui forzamos a decir que nuestro valor no es nulo

    //Operador Elvis
    var numeroElvis: Int? = null
    //Como la variable numero tiene un valor nulo, se le asigna a la variable l el valor por defecto que está a la derecha (color rojo), o sea 0. Ahora, modifiquemos el caso y asignemos un entero a número.
    val elvis = numeroElvis?: 10

    var numeroElvis2: Int? = null
    //Volveremos flotante nuestro numero
    val elvis2 = numeroElvis2?: 0f
    println("El valor de elvis2 $elvis2")

}