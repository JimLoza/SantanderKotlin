package s4

class Koopa : Enemy("Koopa", 2) {
    init {
        println("Iniciando subclase de $name")
    }

    private var state = "Walking"
    set(value) {
        field = value
        println("El estado es $field")
    }

    override fun collision(collider: String) {
        when(collider){
            "Weapon" -> {
                when(state){
                    "Walking" -> state = "Shell"
                    "Shell" -> die()
                }
            }
            "Enemy" -> changeDirection()
        }
    }
}