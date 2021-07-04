package repaso.classes

class Book (var titulo: String, var edicion: Int) {
    var copias: Int = 0

    constructor(titulo: String, edicion: Int, copias: Int ) : this(titulo, edicion){
        this.copias = copias
    }

}