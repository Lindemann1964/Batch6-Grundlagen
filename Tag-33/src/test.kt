package W7.RPG

import W7.RPG.Items.Item
import W7.RPG.Items.Potion
import W7.RPG.Items.Weapon

fun main(){

    var namensListe = listOf("Player1", "Player2")


    val object1: Weapon = Weapon("Langschwert", 2, damage = 6..10 )
    val object2: Item = Weapon("Dolch", 1, 2..4)
    val object3 = Potion("Hervorragender Zaubertrank", 10)

    println(object1)
    println(object2)
    println(object3)


    println("Geben sie den Namen des Spielers ein:")
    var spielerName = readln()
    val mainPlayer = Player(spielerName, 3)
    mainPlayer.gainItem(object1)
    mainPlayer.gainItem(object2)
    mainPlayer.gainItem(object3)

    mainPlayer.equip(object1)


    println(object1)


    var players: MutableList<Player> = mutableListOf()

    for (i in 1..4){
        //println("Geben sie den Namen des $i. Spielers ein:")
        //var spielerName = readln()
        players.add(Player("Player $i", 3))
    }

    var player1 = players[0]
    var player2 = players[3]

    player1.hitpointsMax > player2.hitpointsMax


    for (player in players) {
         if (player.name == "Player1")
             println()
    }

    val enemyPlayer = Player("Drone", 1)


    mainPlayer.attack(enemyPlayer)
    mainPlayer.attack(enemyPlayer)
    mainPlayer.attack(enemyPlayer)
    mainPlayer.attack(enemyPlayer)

    var target = players.random()

    if (target.hitpointsCurrent <= 0) {
        players.remove(target)
        target = players.random()
    }
}
