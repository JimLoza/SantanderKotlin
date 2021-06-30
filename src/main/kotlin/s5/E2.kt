package s5

fun main() {
    fun noInLine(runLambda: () -> Unit){
        println("Antes")
        runLambda()
        println("Despues")
    }

}