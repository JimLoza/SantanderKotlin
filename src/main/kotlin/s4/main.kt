package s4

fun main() {
    val enemy = Goomba()

    enemy.collision("Enemy")
    enemy.collision("Weapon")

    val enemy2 = Koopa()
    enemy2.collision("Enemy")
    enemy2.collision("Weapon")
    enemy2.collision("Weapon")

    val  enemy3 = KoopaParatroopa()
    for (i in 1..3){
        enemy3.collision("Weapon")
    }

}