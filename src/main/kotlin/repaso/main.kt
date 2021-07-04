package repaso

import repaso.abstractclass.Programmer
import repaso.classes.Book

fun main() {
    val book = Book("Harry Potter", 2)

    println(book.titulo)
    book.titulo = "Harry Potter 2"
    println(book.titulo)

    println("----------------")
    println("Utilizando contructor secundario")
    val book2 = Book("El señor de los anillos", 3, 1000)
    println(book2.titulo)
    book2.titulo = "El señor de los anillos 2"
    println(book2.titulo)

    println("-----------------")
    println("Clases abstractas")
    val programmer = Programmer("Jim", "Loza")
    println(programmer.fullName())
    println(programmer.earnings())
}