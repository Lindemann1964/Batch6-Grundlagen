package W2.D5

fun main(){

    val preisListe = mutableMapOf<String, Double>(
        "Erdbeeren" to 2.49,
        "Bananen" to 1.24,
        "Kiwi" to 0.40,
        "Äpfel" to 0.99
    )

    var ladenBestand = mutableMapOf<String, Int>(
        "Erdbeeren" to 5,
        "Bananen" to 8,
        "Kiwi" to 23,
        "Äpfel" to 9
    )

    // Wiederholung:
    val preisErdbeeren: Double? = preisListe["Erdbeeren"]
    println("Eine Packung Erdbeeren kostet: $preisErdbeeren")
    val bestandErdbeeren: Int? = ladenBestand["Erdbeeren"]
    println("Wir haben noch $bestandErdbeeren vorrätig.\n")


    // Wert ändern
    preisListe["Äpfel"] = 0.89
    ladenBestand["Erdbeeren"] = ladenBestand["Erdbeeren"]!! - 2

    // Paare hinzufügen
    preisListe["Birnen"] = 2.24
    ladenBestand["Birnen"] = 3

    // Paare Löschen
    val preisBirnen: Double? = preisListe.remove("Birnen")
    val wurdenBirnenGeloescht: Boolean = ladenBestand.remove("Birnen", 4)


    // Alle Keys / Values
    // Alle Article Namen
    val articleNamen: MutableSet<String> = preisListe.keys
    println("Wir haben diese Artikel auf Lager: $articleNamen")

    // Wieviele Produkte haben wir insgesamt?
    val lagerWerte = ladenBestand.values.toMutableList()
    val gesamtBestand = lagerWerte.sum()    // Die Listen/Set funktion "Sum" addiert alle Elemente
    println("Insgesamt haben wir $gesamtBestand Artikel im Laden\n")

    // Alle Einträge
    println(preisListe.entries)

    // Alle Lagerwerte erhoehen

    println(lagerWerte)

    println(lagerWerte)
    println(ladenBestand)



}