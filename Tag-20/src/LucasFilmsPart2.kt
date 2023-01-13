val sortiment = mutableMapOf<String, Double>(
    "Rogue One: A Star Wars Story" to 15.00,
    "Indiana Jones and the Last Crusade" to 10.00,
    "American Graffiti" to 5.00,
    "The Batman" to 20.00
)

fun main(){
    /* TODO:
        - Funktionen einbauen für:
            - Kaufbestätigung
            - Film Suche
        - Verzweigungen einbauen
            - if/else: ausreichend Budget?
     */
    // Kunden Begrüßen
    willkommen("Kunde")

    // Günstigsten Film vorstellen
    sonderAngebot()

    // Kunde kann einen Film wählen
    var auswahl: String = filmAuswahl()
}

fun willkommen(name: String){
    println("Willkommen bei Lucas' Films, $name.\n")
    aktuellesSortimentAnzeigen()
}

// TODO: neue Funktion:
fun aktuellesSortimentAnzeigen(){
    println("Unser heutiges Angebot ist:\n" +
            "${sortiment.keys}\n" +
            "${sortiment.values} \n")
}

fun sonderAngebot(){
    var preisListe = sortiment.values.toList()
    // Günstigster Film ausgeben:
    var minPreis = preisListe.min()

    var namensListe = sortiment.keys.toList()
    var minFilm = namensListe[preisListe.indexOf(minPreis)]

    println("Unser aktuelles super Sparangebot: \n" +
            "$minFilm für nur $minPreis €!\n")
}

fun filmAuswahl(): String{
    var filmListe = sortiment.keys.toList()

    println("Wählen sie einen Film: \n")
    when(filmListe.size){
        1 -> {
            println("1 für ${filmListe[0]}\n")
        }
        2 -> {
            println("1 für ${filmListe[0]}\n" +
                    "2 für ${filmListe[1]}\n")
        }
        3 -> {
            println("1 für ${filmListe[0]}\n" +
                    "2 für ${filmListe[1]}\n" +
                    "3 für ${filmListe[2]}")
        }
        4 -> {
            println("1 für ${filmListe[0]}\n" +
                    "2 für ${filmListe[1]}\n" +
                    "3 für ${filmListe[2]}\n" +
                    "4 für ${filmListe[3]}")
        }
        else -> {
            println("Irgendwas stimmt nicht. Entweder gibt es keine Filme, oder mehr als 4 Filme.")
        }
    } // Ende: When

    try {
        var eingabe = readln().toInt() - 1

        var auswahl = filmListe[eingabe]
        var auswahlPreis = sortiment[auswahl]
        println("Sie haben \"$auswahl\" gewählt!")
        return auswahl
    } catch (ex: Exception){
        println("Falsche Eingabe. Bitte nur Zahlen eingeben.")
        return filmAuswahl()
    }
}


// TODO: kauf Abwickeln
fun kaufAbwickeln(){
    // Kauf abwickeln
    //    var budget3: Double = 40.00
    //    budget3 -= auswahlPreis
    //
    //    // Sortiment aktualisieren
    //    sortimentMap.remove(auswahl, auswahlPreis)
    //
    //    // Bestätigung
    //    Thread.sleep(1000) // 1 Sekunde Warten
    //    println("Vielen Dank für ihren Einkauf. \n" +
    //            "Ihr verbleibendes Budget ist: $budget3 €\n")
}

// TODO: Film Suche
fun filmSuche(){

}
