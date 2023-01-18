
val bestand = mutableMapOf<String, Boolean>(
    "Apfel" to true,
    "Mango" to false,
    "Ananas" to true,
    "Banane" to false,
    "Kirsche" to false,
    "Erdbeere" to true,
    "Zitrone" to true
)

var preisliste = mutableMapOf<String, Double>(
    "Tropical" to 3.49,
    "Erdbeere Mango" to 2.99,
    "Banane Kirsch" to 2.99,
    "Detox" to 3.99,
    "Wild Berries" to 3.49
)

var bestellungen: List<List<String>> = listOf(
    listOf("Tropical", "Detox"),
    listOf("Banane Kirsch"),
    listOf("Erdbeere Mango", "Erdbeere Mango"),
    listOf("Banane Kirsch", "Wild Berries", "Detox")
)

fun main(){

}