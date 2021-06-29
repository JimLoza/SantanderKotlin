package s5prework

fun main() {
    //Recibimos la función getMoney y la cantidad a imprimir, la divisa serán pesos
//    fun moneyPrint(getMoney: (String, Int) -> String,quantity: Int){
//        println(getMoney("Pesos", quantity))
//    }

    fun moneyPrint(getMoney: (String, Int) -> String, quantity: Int){
        moneyPrint({currency, quantity -> "$quantity $currency"}, 9800)
    }

//    También se puede asignar la lambda a una variable y pasarla como parámetro:
    val getMoney = { currency:String, quantity:Int -> "$quantity $currency"}
    moneyPrint(getMoney,9800)

}