fun main(){
    // Datentyp einer Liste
    var filmListe: List<String> = listOf("Nemo", "Shrek", "Monsters Inc.") // Hier könnte der Datentyp weggelassen werden

    // Bei leerer Listen ist er erforderlich!
    var preisListe: List<Double> = listOf()

    // Datentyp kann auch weggelassen werden, wenn er vom Compiler erschließbar ist
    val artikel = listOf("Brot", "Croissant", "Semmel", "Breze")
    val anzahl = mutableListOf(3, 5, 14, 8)
    var einkaufsWagen = listOf<String>()

    // Datentypen einer Map
    // Immer <Key, Value>
    val altersListe = mutableMapOf( //Datentypen können weggelassen werden, wenn sie erschließbar sind
        "Felix" to 49,
        "Manuel" to 51,
        "Jana" to 31,
        "Hannah" to 22
    )

    var pokedex: Map<Int, String> = mapOf()
    var engToGer = mutableMapOf<String, String>()


}