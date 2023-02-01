package W7.RPG

import W7.RPG.Items.Armor
import W7.RPG.Items.Item
import W7.RPG.Items.Potion
import W7.RPG.Items.Weapon

class Player(val name: String){

    var level: Int = 1
    var hitpointsMax: Int = (18..22).random()
    var hitpointsCurrent = hitpointsMax
    var gold = 100

    var equippedWeapon: Weapon? = null
    var equippedArmors: MutableMap<String, Armor?> = mutableMapOf(
        "Chest" to null,
        "Legs" to null,
        "Hands" to null
    )

    var inventory: MutableList<Item> = mutableListOf()

    constructor(name: String, level: Int) : this(name){
        for (i in 2..level)
            levelUp()
    }


    fun levelUp(){
        level++
        hitpointsMax += level
        hitpointsCurrent = hitpointsMax
    }

    fun gainItem(newItem: Item){
        newItem.ownedBy = this
        inventory.add(newItem)
    }

    fun deleteItem(item: Item): Boolean {
        return if (item in inventory){
            inventory.remove(item)
            true
        } else
            false
    }

    fun createPotion(){
        if (this.gold >= 15){
            val newPotion = Potion("Kleiner Heiltrank", this, 5)
        }
        else
            println("Not enough Gold to create a Potion")
    }

    fun equip(item: Item){
        if (item in inventory) {
            item.equip()
        }
    }

    fun attack(enemy: Player){
        var damage: Int

        if (equippedWeapon != null)
            damage = equippedWeapon!!.damage.random()
        else
           damage = 1

        if (enemy.hitpointsCurrent > 0)
            enemy.takeDamage(damage)
    }

    fun takeDamage(damageAmount: Int){
        hitpointsCurrent -= damageAmount

        println("${this.name} has suffered $damageAmount damage.")
        println("Remaining HP: $hitpointsCurrent/$hitpointsMax")

        if (hitpointsCurrent <= 0){
            println("${this.name} has suffered a killing blow :(")
        }

    }
}