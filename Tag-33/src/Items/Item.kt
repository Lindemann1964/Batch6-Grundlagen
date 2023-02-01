package W7.RPG.Items

import W7.RPG.Player

open class Item(val name: String){

    var ownedBy: Player? = null
    var equipped: Boolean = false


    constructor(name: String, player: Player) : this(name) {
        ownedBy = player
        equipped = true
    }

    open fun equip(){
        equipped = true
    }

    fun unequip(){
        equipped = false
    }

    override fun toString(): String {
        return "$name \nGehört dem Spieler: $ownedBy"
    }
}