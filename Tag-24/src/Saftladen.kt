
// Speichert ab, wie oft wir jedes Produkt im Laden haben
val zutatenLager = mutableMapOf<String, Int>(
    "Milch" to 15,
    "Kokosmilch" to 6,
    "Banane" to 8,
    "Ananas" to 8,
    "Mango" to 4,
    "Kiwi" to 10,
    "Zitrone" to 8,
    "Erdbeere" to 20,
    "Himbeere" to 30,
    "Blaubeere" to 30,
    "Sellerie" to 5,
    "Spinat" to 2
)

// Speichert zu jedem Namen eine Liste von Zutaten
val menu = mutableMapOf<String, List<String>>(
    "Classic" to listOf("Banane", "Banane", "Erdbeere", "Erdbeere", "Erdbeere", "Erdbeere", "Erdbeere"),
    "Classic Milkshake" to listOf("Banane", "Banane", "Milch", "Erdbeere", "Erdbeere", "Erdbeere"),
    "Wild Berry" to listOf("Milch", "Erdbeere", "Erdbeere", "Himbeere","Himbeere","Himbeere","Blaubeere","Blaubeere","Blaubeere"),
    "Tropical" to listOf("Kokosmilch", "Ananas", "Mango"),
    "Jungle" to listOf("Banane", "Kiwi", "Kiwi", "Ananas"),
    "Beach Party" to listOf("Milch", "Mango", "Erdbeere", "Erdbeere", "Banane"),
    "Detox" to listOf("Zitrone", "Zitrone", "Sellerie", "Sellerie", "Spinat", "Kiwi"),
    "Fitness" to listOf("Milch", "Blaubeere", "Blaubeere", "Himbeere", "Himbeere", "Spinat", "Banane")
)


// TODO
val preisListe = mutableMapOf<String, Double>(

)

fun main(){}