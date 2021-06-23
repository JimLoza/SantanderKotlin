package s3prework

//class Persona {
//    var name: String = ""
//
//    fun sayHeloo(){
//        println("Hello")
//    }
//}

//Si el constructor no tienen ninguna anotación o algún modificador de acceso (public, private etc.), puede omitirse la palabra constructor.
//class Persona constructor(name:String){}

//Getters y Setters provistos por el programador
class Persona(name: String, age: Int) {

    private var name: String = name

    fun getName() : String {
        return name
    }

    fun setName(name: String){
        this.name = name
    }


}