package repaso.abstractclass

class Programmer(firstName: String, lastName: String) : Employee(firstName, lastName) {

    override fun earnings(): Double {
        return 2.0
    }

}