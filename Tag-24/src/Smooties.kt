
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

var bestellungen: MutableList<List<String>> = mutableListOf(
    listOf("Tropical", "Detox"),
    listOf("Banane Kirsch"),
    listOf("Erdbeere Mango", "Erdbeere Mango"),
    listOf("Banane Kirsch", "Wild Berries", "Detox")
)

var kasse = 20.0

fun main(){

    // TODO: a) Lagerbestand prüfen
    lagerPruefen()

    // TODO: b) Bestellungen abarbeiten
    bestellungenAbarbeiten()
}

fun lagerPruefen(){
    for (eintrag in bestand.entries){
        if (eintrag.value){
            continue
        }
        else {
            println("${eintrag.key} muss nachbestellt werden")
            bestand[eintrag.key] = true
        }
    }
}

fun bestellungenAbarbeiten(){

    /*  Schleife über Bestellungen:
            für jede Bestellung:
                Preisliste nachschauen

     */
    var i = 0

    while (i < bestellungen.size){  // for (i in bestellungen.indices)
        var bestellung = bestellungen[i]

        var gesamtPreis = 0.0

        for (saftName in bestellung){
            if (saftName in preisliste.keys) {
                val preis = preisliste[saftName]
                gesamtPreis += preis!!
            }
            else{
                println("Der Saft '$saftName' existiert nicht")
                continue
            }
        }

        println("Bestellung #$i kostet $gesamtPreis")
        kasse += gesamtPreis
        i++
    }

    bestellungen.clear()
    println("Wir haben nun $kasse € in der Kasse")

}