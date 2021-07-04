package repaso.interfaces
class Result
class Student

interface StudentRepository {

//incluir la palabra clave abstract es redundante en un método de interfaz porque ya están implícitamente abstractos.
    fun getById(id: Long): Student

    fun getResultsById(id: Long): List<Result>
}