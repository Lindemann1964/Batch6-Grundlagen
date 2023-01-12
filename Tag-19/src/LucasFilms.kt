
val sortiment = mutableMapOf<String, Double>(
    "Rogue One: A Star Wars Story" to 15.00,
    "Indiana Jones and the Last Crusade" to 10.00,
    "American Graffiti" to 5.00,
    "The Batman" to 20.00
)

fun main(){

    /* TODO:
        - Funktionen einbauen für:
            - Begrüßung
            - SonderAngebot
            - Film Auswahl
            - Kaufbestätigung
            - Film Suche
        - Verzweigungen einbauen
            - if/else: ausreichend Budget?
     */

    willkommen("Kunde")
    sonderAngebot()

    var auswahl: String = filmAuswahl()
//
//
//    // Aufgabe 5: Kauf abwickeln
//    var budget: Double = 50.00
//    budget -= auswahlPreis
//
//    // Sortiment aktualisieren
//    sortiment.remove(auswahl)
//    preisListe.remove(auswahlPreis)
//
//    // Bestätigung
//    Thread.sleep(1000) // 1 Sekunde Warten
//    println("Vielen Dank für ihren Einkauf. \n" +
//            "Ihr verbleibendes Budget ist: $budget €\n")
//
//    // Aufgabe 6
//    sortiment.add("The Batman")
//    preisListe.add(20.00)
//
//    // Begrüssung
//    println("Willkommen bei Lucas' Films.\n" +
//            "Unser heutiges Filmangebot für Sie:\n" +
//            "$sortiment\n" +
//            "$preisListe\n")
//
//    // Sparangebot präsentieren
//    minPreis = preisListe.min()
//    minFilm = sortiment[preisListe.indexOf(minPreis)]
//
//    println("Unser aktuelles super Sparangebot: \n" +
//            "$minFilm für nur $minPreis €!\n")
//
//    // Film auswahl
//    println("Wählen sie einen Film: \n" +
//            "1 für ${sortiment[0]}\n" +
//            "2 für ${sortiment[1]}\n" +
//            "3 für ${sortiment[2]}"
//    )
//    eingabe = readln().toInt() - 1
//    auswahl = sortiment[eingabe]
//    auswahlPreis = preisListe[eingabe] // Für Aufgabe 5
//    println("Sie haben \"$auswahl\" gewählt!")
//
//    // Kauf abwickeln
//    var budget2: Double = 30.00
//    budget2 -= auswahlPreis
//
//    // Sortiment aktualisieren
//    sortiment.remove(auswahl)
//    preisListe.remove(auswahlPreis)
//
//    // Bestätigung
//    Thread.sleep(1000) // 1 Sekunde Warten
//    println("Vielen Dank für ihren Einkauf. \n" +
//            "Ihr verbleibendes Budget ist: $budget2 €\n")
//
//
//    // Aufgabe 7: System überarbeiten
//
//
//    // Aufgabe 8: Film im Sortiment?
//    var suchFeld = "The Batman"
//    println("Ist $suchFeld im Sortiment? -> ${sortimentMap.contains(suchFeld)}")
//
//    // Den 3. Kunden Behandeln:
//    var filmListe = sortimentMap.keys.toList()
//
//    println("Willkommen bei Lucas' Films.\n" +
//            "Unser heutiges Filmangebot für Sie:\n" +
//            "$filmListe\n" +
//            "${sortimentMap.values}\n")
//    // Sparangebot präsentieren
//    minPreis = sortimentMap.values.min()
//    var index = sortimentMap.values.indexOf(minPreis)
//    minFilm = filmListe[index]
//
//    println("Unser aktuelles super Sparangebot: \n" +
//            "$minFilm für nur $minPreis €!\n")
//
//    // Film auswahl
//    println("Wählen sie einen Film: \n" +
//            "1 für ${filmListe[0]}\n" +
//            "2 für ${filmListe[1]}\n" +
//            "3 für ${filmListe[2]}\n" +
//            "4 für ${filmListe[3]}"
//    )
//    eingabe = readln().toInt() - 1
//    auswahl = filmListe[eingabe]
//    auswahlPreis = sortimentMap[auswahl]!! // Für Aufgabe 5
//    println("Sie haben \"$auswahl\" gewählt!")
//
//    // Kauf abwickeln
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
//
//
//    // Aufgabe 9:
//    println("Aktuelles Sortiment: ")
//    println(sortimentMap.keys)
//    println(sortimentMap.values)
}


fun willkommen(name: String){
    println("Willkommen bei Lucas' Films, $name.\n" +
            "Unser heutiges Angebot ist:\n" +
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

/* TODO:
    - Funktionen einbauen für:
        - Begrüßung
        - SonderAngebot
        - Film Auswahl
        - Kaufbestätigung
        - Film Suche
    - Verzweigungen einbauen
        - if/else: ausreichend Budget?
 */

