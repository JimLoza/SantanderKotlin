package s3

fun main() {

//    val myPhone = Phone()
//
//    myPhone.getTurn()
//    myPhone.turnOn()
//    myPhone.getTurn()
//
//    val myPhone1 = Phone()
//    myPhone1.turnOn()
//    myPhone1.getTurn()

    val myCar = Automovil("Rojo","Ford", 2020, "JKP-36" )

    myCar.setColor("Amarillo")
    myCar.setMarca("Ford")
    myCar.setModelo(2021)
    myCar.setPlacas("JKP-2132")
    myCar.getColor()
    myCar.getMarca()
    myCar.getModelo()
    myCar.getPlacas()

    println("-----------------------------")
//    myCar.getStatus()
//    myCar.getGas()
//    myCar.cargarGas(30.0)
//    myCar.getGas()
//    myCar.encenderAuto()
//    myCar.getStatus()
//    myCar.apagarAuto()
//    myCar.getStatus()

    val persona = Person("Juan", "Loza", 'H', 1.87 )

    println("-----------------------------")

    val mario = Mario()
//    mario.collision("Estrella")
    for (i in 1..5){
//        mario.collision("Goomba")
//        println("Tienes: ${mario.getLives()}")
        if (mario.vivo){
            mario.collision("Goomba")
            println("Tienes: ${mario.getLives()}")
        }
    }
}