package s4prework

class Artist : Person() {

    private var stageName: String = ""
    fun setStageName(name: String) {
        this.stageName = name
    }

    fun getStageName(): String {
        return this.stageName
    }

    fun sing() {
        println("Hello I'm singing")
    }

    //Sobrescribiendo la funcion declarada en la clase abstract
    override fun sayHello() {
        println("Hello I'm an artist")
    }

}

