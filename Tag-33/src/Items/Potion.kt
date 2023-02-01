package W7.RPG.Items

import W7.RPG.Player

class Potion(name: String, val heal: Int) : Item(name) {

    constructor(name: String, player: Player, heal: Int): this(name, heal){
        this.ownedBy = player
    }

    val description = "Kann einmalig eingesetzt werden um $heal Lebenspunkte zu heilen"

    fun trinken(player: Player){
        // Spieler lebenspunkte erhöhen, Trank aus inventar verlieren
        player.hitpointsCurrent = heal
        if (player.hitpointsCurrent > player.hitpointsMax)
            player.hitpointsCurrent = player.hitpointsMax

        player.deleteItem(this)
    }
}