package s4prework


abstract class Person {
    private var name: String = ""
    private var age: Int = 0
    fun setName(name: String) {
        this.name = name
    }

    fun getName(): String {
        return this.name
    }

    fun setAge(age: Int) {
        this.age = age
    }

    fun getAge(): Int {
        return this.age
    }

    abstract fun sayHello()
}


