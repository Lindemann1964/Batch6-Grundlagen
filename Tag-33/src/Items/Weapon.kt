package W7.RPG.Items

class Weapon(name: String, var hands: Int, val damage: IntRange): Item(name){


    fun attack(){
        var finalDamage = damage.random()
        if (hands == 2)
            finalDamage = damage.random()
    }

    override fun equip() {
        super.equip()
        ownedBy?.equippedWeapon = this
    }
}