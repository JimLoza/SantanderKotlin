package repaso.abstractclass

abstract class Employee(val firstName: String, val lastName: String) {
    val propFoo : String = "bla bla"

    abstract fun earnings(): Double

    //Tenga en cuenta que no todos los miembros tienen que ser abstractos. En otras palabras, podemos tener la implementación predeterminada del método en una clase abstracta.
    fun fullName(): String {
        return "$lastName $firstName"
    }
}