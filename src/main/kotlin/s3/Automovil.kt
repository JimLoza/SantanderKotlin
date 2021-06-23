package s3

class Automovil(color:String, marca:String, modelo:Int, placas:String, encendido:Boolean = false, gasolina:Double = 20.0) {
    private var color:String = color
    private var marca:String = color
    private var modelo:Int = modelo
    private var placas:String = placas
    private var encendido:Boolean = encendido
    private var gasolina:Double = gasolina


    fun setColor(color: String){
        this.color = color
    }

    fun getColor():String{
        return color
    }

    fun setMarca(marca: String){
        this.marca = marca
    }

    fun getMarca(){
        println(marca)
    }

    fun setModelo(modelo: Int){
        this.modelo = modelo
    }

    fun getModelo(){
        println(modelo)
    }

    fun setPlacas(placas: String){
        this.placas
    }

    fun getPlacas(){
        println(placas)
    }

    fun getStatus(){
        if (encendido) println("El auto esta encendido") else println("El auto esta apagado")
    }

    fun apagarAuto(){
        encendido = false
    }

    fun encenderAuto(){
        encendido = true
    }

    fun cargarGas(gasolina: Double){
        this.gasolina += gasolina
    }

    fun getGas(){
        println("tienes ${gasolina} de gasolina")
    }



}