package s6p1

fun main() {

    val movie1 = Movie("Toy Sotry", "Animacion", 16.0)
    println(movie1)
    println(movie1.name)
    movie1.createdAt = "1998"
    println(movie1)
    println(movie1.createdAt)


//    Destructurando
    val(name , gender, duration) = movie1
    println("$name $gender $duration")

//    Companion object

    val vehicle = Vehicle.create()
}

data class Movie(
    val name: String,
    val gender: String,
    val duration: Double
){
    var createdAt = "" //Se declara de esta forma cuando el valor no va a cambiar
}

class Vehicle {
    init {
        println("Creado!")
    }

    companion object Factory{
        fun create(): Vehicle = Vehicle()
    }
}