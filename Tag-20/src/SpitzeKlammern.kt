fun main(){
    // Datentyp einer Liste
    var filmListe: List<String> = listOf("Nemo", "Shrek", "Monsters Inc.") // Hier könnte der Datentyp weggelassen werden

    // Bei leerer Listen ist er erforderlich!
    var preisListe: List<Double>  = listOf()
    var einkaufsWagen = listOf<String>()
    //var wunschZettel = listOf() // Fehlerfaft

    // Datentyp kann auch weggelassen werden, wenn er vom Compiler erschließbar ist
    val artikel = listOf("Brot", "Croissant", "Semmel", "Breze")
    val anzahl = mutableListOf(3, 5, 14, 8)

    // Datentypen einer Map
    // Immer <Key, Value>
    val altersListe = mutableMapOf( //Datentypen können weggelassen werden, wenn sie erschließbar sind
        "Felix" to 49,
        "Manuel" to 51,
        "Jana" to 31,
        "Hannah" to 22
    )

    println(altersListe.entries.toList()[0])    // Erstes Paar einer Map anzeigen

    // leere Maps erfordern den Datentyp
    var pokedex: Map<Int, String> = mapOf()
    var engToGer = mutableMapOf<String, String>()
    //var gerToEng = mutableMapOf() // Fehlerhaft
}