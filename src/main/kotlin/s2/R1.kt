package s2

fun main() {
    //Reto1

    //Area de rectangulo con valores por defecto
    println("Area con valores por defecto: ${rectangleArea()}")

    //Area de rectangulo con base seteado y altura por defecto
    println("Area con altura por defecto ${rectangleArea(10.0)}")

    //Area de rectangulo con base seteada y altura seteada con named arguments
    println("Area con altura seteada con named arguments ${rectangleArea(height = 10.0)}");

    println("-------------------Comienza lo del Reto1-----------------")
    //Reto2
    println("El volumen del prisma es ${volPrisma(12.4,6.2,16.4)}")

    //reto 3
    imprimir();

    //reto4
    println("El promedio es ${promedio(cal3 = 5.5f)}");
}



//Crear una función que calcule el área de un rectángulo por medio de su base y altura, implementarla en main
fun rectangleArea(base: Double = 20.0, height: Double = 30.0): Double {
    return base*height;
}

//Crear otra función para calcular el volumen de un prisma rectangular, utilizar la función de área
fun volPrisma(height: Double, base: Double, longitud: Double): Double {
    return longitud * rectangleArea(base, height);
}

//reto 3
//Una función puede tener parámetros con valores por defecto en caso de que no se setee ninguno, a continuación cómo se implementa:
fun imprimir(valor: String = "Este es el primer valor por defecto", valor2: String = "Este es el segundo valor por defecto"){
    println(valor)
    println(valor2)
}

//reto 4
//Con el ejemplo anterior, crear una función que entregue el promedio de tres calificaciones. Esta debe recibir dos parámetros con calificaciones por defecto 8, y el tercer parámetro no debe venir predefinido.
fun promedio(cal1: Float = 8.8f, cal2: Float = 7.7f, cal3: Float ): Float{
    return (cal1 + cal2 + cal3) / 3;
}

//reto 5
//Utilizar la función promedio, Comentar qué pasa si se ingresa sólo una calificación en la función y después con dos. Finalmente, buscar que la función corra enviando únicamente la tercera calificación con 10f: