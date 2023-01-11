fun main(){

    // Beispiel 1: Telefonnummer
    val telefonNummer: String = "+4912312312"
    val testZiffer = "1"
    if (testZiffer in telefonNummer){
        val count = telefonNummer.length - telefonNummer.replace("1", "").length
        println("In meiner Telefonnummer kommt die '$testZiffer' $count mal vor.")
    }


    // Beispiel 2: NamensListe:
    val namensListe: List<String> = listOf("Fabian", "Felix", "Anna", "Jakob", "Phillip", "Lars", "Justus")
    val notenListe: List<Int> = listOf(1, 2, 3, 4, 1, 2, 3)

    val gesuchterName = "Jakob"

    if (gesuchterName in namensListe){
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