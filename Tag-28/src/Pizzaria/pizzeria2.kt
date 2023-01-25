
fun main() {

    // Liste mit verschiedenen Pizzen
    var bestellungen: MutableList<Pizza> = mutableListOf()

    bestellungen.add(PizzaSalame(28, 9.99))
    bestellungen.add(Pizza(31, 16.99, listOf("Paprika", "Mais", "Zwiebel")))
    bestellungen.add(PizzaTonno(28, 10.99))



    // Nachschauen ob die 3. Pizza Rucola hat
    var containsRucola: Boolean = bestellungen[2].checkIngredients("Rucola")

    // Wenn kein Rucola drauf ist, noch hinzufügen
    if (!containsRucola) {
        bestellungen[2].addIngredient("Rucola", 0.99)
    }
}