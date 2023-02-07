
fun main(){

    val playerCharacter = Hero("John McClaine", 50, 5..10)
    val enemyFighter = Hero("Goon 1", 20, 3..5)

    playerCharacter.attack(enemyFighter)

    enemyFighter.attack(playerCharacter)

    println(".............")

    var test = "Gordon Lucas .".split(" ")
    println(test)
    listOf(1,2,3).random()
}



class Hero(val name: String, HP: Int, var damage: IntRange){
    var maxHP = HP
    var currentHP = HP


    fun attack(target: Hero){
        val atkDamage = this.damage.random()
        target.currentHP -= atkDamage
        println("${this.name} greift ${target.name} an.")

        Thread.sleep(1000)

        println("${target.name} hat noch ${target.currentHP}/${target.maxHP} verbleibend.")


        Thread.sleep(5000)
    }


}