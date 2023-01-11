fun main(){

    // Beispiel 1: Telefonnummer
    val telefonNummer: String = "+4912312312"  // -> "+4923232"
    val testZiffer = "1"
    if (testZiffer in telefonNummer){  // == telefonNummer.contains(testZiffer)
        var count = telefonNummer.length - telefonNummer.replace("1", "").length
        println("In meiner Telefonnummer kommt die '$testZiffer' $count mal vor.")
    }

    // Beispiel 1.b: Zählen wie oft ein Wort im Text vorkommt
    val text = "Manchmal geschieht es in tiefer Nacht, " +
            "Daß der Wind wie ein Kind erwacht, " +
            "Und er kommt die Allee allein " +
            "Leise, leise ins Dorf herein. " +
            "Und er tastet bis an den Teich, " +
            "Und dann horcht er herum: " +
            "Und die Häuser sind alle bleich, " +
            "Und die Eichen sind stumm … " +
            "\n"
    val wortListe = text.split(' ').toMutableList()
    if ("Und" in wortListe){
        wortListe.retainAll(listOf("Und"))
        println("Das Wort ist ${wortListe.size} mal im text")
    }

    // Beispiel 2: NamensListe:
    val namensListe: List<String> = listOf("Fabian", "Felix", "Anna", "Jakob", "Phillip", "Lars", "Justus")
    val notenListe: List<Int> = listOf(1, 2, 3, 4, 1, 2, 3)

    val gesuchterName = "Jackob"
    if (gesuchterName in namensListe) {
        val index = namensListe.indexOf(gesuchterName)
        val note = notenListe[index]
        println("$gesuchterName hat eine $note")
    }


    // Beispiel 3: Sortiment (map)

    val sortiment = mutableMapOf(
        "Apfel" to 0.49,
        "Banane" to 0.39,
        "Kiwi" to 0.19,
        "Breze" to 0.75
    )
    val einkaufswagen = mutableListOf("Breze", "Breze", "Banane")


    // Wir wollen ein neues Produkt hinzufügen
    val neuerProduktName = readln()
    val neuerPreis = 0.99

    if (neuerProduktName in sortiment){
        println("Das Produkt existiert bereits")
        if (sortiment[neuerProduktName] != neuerPreis){
            sortiment[neuerProduktName] = neuerPreis
        }
    }
    else {
        sortiment[neuerProduktName] = neuerPreis
    }

    // Ist ein bestimmter value im Sortiment?
    if (0.99 in sortiment.values){
        println("Es gibt ein Produkt, das 99cent kostet.")
    }

    // Ist ein bestimmtes Produkt im Einkaufswagen?
    if ("Apfel" in einkaufswagen || "Banane" in einkaufswagen){
        println("Weil du gesund einkaufst sparst du dir die Steuer")
    }

}