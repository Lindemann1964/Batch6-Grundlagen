package W7.RPG.Items

class Armor(name: String, val slot: String): Item(name) {

    private val possibleSlots = listOf("Chest", "Legs", "Hands")

    init {
        if (slot !in possibleSlots){
            throw Exception("Ungültiger Armor Slot")
        }
    }


}