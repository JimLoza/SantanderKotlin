package s4

class KoopaParatroopa : Enemy("KoopaParatroopa", 2) {
    private var state = "Flying"
        set(value) {
            field = value
            println("El estado es $field")
        }

    init {
        println("Iniciando subclase de $name")
        println("El estado inicial es $state")
    }


    override fun collision(collider: String) {
        when (collider) {
            "Weapon" -> {
                when (state) {
                    "Flying" -> state = "Walking"
                    "Walking" -> state = "Shell"
                    "Shell" -> die()
                }
            }
        }
    }
}