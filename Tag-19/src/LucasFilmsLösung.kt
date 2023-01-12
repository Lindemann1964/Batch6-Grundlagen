fun main(){
    // Aufgabe 2: Unseren Bestand erfassen
    val sortiment = mutableListOf<String>(
        "Rogue One: A Star Wars Story",
        "Indiana Jones and the Last Crusade",
        "American Graffiti",
    )

    val preisListe = mutableListOf<Double>(
        15.00,
        10.00,
        5.00
    )

    // Aufgabe 3: Den Kunden begrüßen & Sortiment ausdrucken

    println("Willkommen bei Lucas' Films.\n" +
            "Unser heutiges Filmangebot für Sie:\n" +
            "$sortiment\n" +
            "$preisListe\n")

    // Aufgabe 4: Den Kunden bedienen
    // Günstigster Film ausgeben:
    var minPreis = preisListe.min()
    var minFilm = sortiment[preisListe.indexOf(minPreis)]

    println("Unser aktuelles super Sparangebot: \n" +
            "$minFilm für nur $minPreis €!\n")

    // Film auswahl
    println("Wählen sie einen Film: \n" +
            "1 für ${sortiment[0]}\n" +
            "2 für ${sortiment[1]}\n" +
            "3 für ${sortiment[2]}"
    )
    var eingabe = readln().toInt() - 1
    var auswahl = sortiment[eingabe]
    var auswahlPreis = preisListe[eingabe] // Für Aufgabe 5
    println("Sie haben \"$auswahl\" gewählt!")


    // Aufgabe 5: Kauf abwickeln
    var budget: Double = 50.00
    budget -= auswahlPreis

    // Sortiment aktualisieren
    sortiment.remove(auswahl)
    preisListe.removeAt(eingabe)

    // Bestätigung
    println("Vielen Dank für ihren Einkauf. \n" +
            "Ihr verbleibendes Budget ist: $budget €\n")
    Thread.sleep(1000) // 2 Sekunde Warten


    // Aufgabe 6
    sortiment.add("The Batman")
    preisListe.add(20.00)

    // Begrüssung
    println("Willkommen bei Lucas' Films.\n" +
            "Unser heutiges Filmangebot für Sie:\n" +
            "$sortiment\n" +
            "$preisListe\n")

    // Sparangebot präsentieren
    minPreis = preisListe.min()
    minFilm = sortiment[preisListe.indexOf(minPreis)]

    println("Unser aktuelles super Sparangebot: \n" +
            "$minFilm für nur $minPreis €!\n")

    // Film auswahl
    println("Wählen sie einen Film: \n" +
            "1 für ${sortiment[0]}\n" +
            "2 für ${sortiment[1]}\n" +
            "3 für ${sortiment[2]}"
    )
    eingabe = readln().toInt() - 1
    auswahl = sortiment[eingabe]
    auswahlPreis = preisListe[eingabe] // Für Aufgabe 5
    println("Sie haben \"$auswahl\" gewählt!")

    // Kauf abwickeln
    var budget2: Double = 50.00
    budget2 -= auswahlPreis

    // Sortiment aktualisieren
    sortiment.remove(auswahl)
    preisListe.removeAt(eingabe)

    // Bestätigung
    println("Vielen Dank für ihren Einkauf. \n" +
            "Ihr verbleibendes Budget ist: $budget2 €\n")

    Thread.sleep(1000) // 1 Sekunde Warten


    // Aufgabe 7: System überarbeiten
    val sortimentMap = mutableMapOf<String, Double>(
        "Rogue One: A Star Wars Story" to 15.00,
        "Indiana Jones and the Last Crusade" to 15.00,
        "American Graffiti" to 5.00,
        "The Batman" to 20.00
    )

    // Aufgabe 8: Film im Sortiment?
    println("Welchen Film suchen Sie?")
    var suchFeld = readln()
    println("Ist $suchFeld im Sortiment? -> ${suchFeld in sortimentMap}")
    println("Der Preis dafür ist: ${sortimentMap[suchFeld]}")
    // var test: Double? = sortimentMap[suchFeld]

    // Den 3. Kunden Behandeln:
    var filmListe = sortimentMap.keys.toList()
    println("Willkommen bei Lucas' Films.\n" +
            "Unser heutiges Filmangebot für Sie:\n" +
            "$filmListe\n" +
            "${sortimentMap.values}\n")

    // Sparangebot präsentieren
    minPreis = sortimentMap.values.min()
    var index = sortimentMap.values.indexOf(minPreis)
    minFilm = filmListe[index]

    println("Unser aktuelles super Sparangebot: \n" +
            "$minFilm für nur $minPreis €!\n")

    // Film auswahl
    println("Wählen sie einen Film: \n" +
            "1 für ${filmListe[0]}\n" +
            "2 für ${filmListe[1]}\n" +
            "3 für ${filmListe[2]}\n" +
            "4 für ${filmListe[3]}"
    )
    eingabe = readln().toInt() - 1
    auswahl = filmListe[eingabe]
    auswahlPreis = sortimentMap[auswahl]!! // Für Aufgabe 5
    println("Sie haben \"$auswahl\" gewählt!")

    // Kauf abwickeln
    var budget3: Double = 40.00
    budget3 -= auswahlPreis

    // Sortiment aktualisieren
    sortimentMap.remove(auswahl, auswahlPreis)
    //sortiment.remove(auswahl) identisch

    // Bestätigung
    println("Vielen Dank für ihren Einkauf. \n" +
            "Ihr verbleibendes Budget ist: $budget3 €\n")

    Thread.sleep(1000) // 1 Sekunde Warten

    // Aufgabe 9:
    println("Aktuelles Sortiment: ")
    println(sortimentMap.keys)
    println(sortimentMap.values)
}