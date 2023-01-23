// Zu Beginn spielen wir nur mit Worten, die 5 Buchstaben enthalten
val wortListe = listOf("Apfel", "Birne", "Sport", "Kampf", "super", "eitel",
    "Honig", "Engel", "innen", "Angst", "Durst", "Zecke", "Liebe",
    "Biene", "Arena", "Traum", "Vogel", "Bingo", "Akita", "Vögel"
)
var lives: Int = 5

var zielWort: String = ""
var anzeigeWort: StringBuilder = StringBuilder("_____")

// Tracker, welche Buchstaben bereits geraten sind
var gerateneBuchstaben = mutableSetOf<Char>()

fun main(){
    /* PSEUDO CODE:
    zielWort = wortAuswahl() // per Zufall
    anzeigeWort = “_____”
    leben = 5


    while (leben > 0 && anzeigeWort != zielWort){
        buchstabe = readln()
        buchstabeSuchen()
        if (gefunden)
            index = zielWort.index()
            anzeige.replace(“_”, buchstabe) // An der Stelle
        else
         leben –-
    }
    */
    zielWort = wortListe.random().uppercase()
    anzeigeWort = StringBuilder("_____")
    lives = 5

    while (lives > 0 && anzeigeWort.toString() != zielWort) {
        println("Diese Buchstaben hast du bereits geraten: $gerateneBuchstaben")
        println("Aktuelles Wort: $anzeigeWort")
        println("Wähle einen Buchstaben:")
        var buchstabe = readln().uppercase().first()

        if (zielWort.contains(buchstabe)) {
            println("Richtig geraten!")
            // richtig geraten -> buchstaben finden und austauschen
            for (i in zielWort.indices) {
                if (buchstabe == zielWort[i]) {
                    anzeigeWort[i] = buchstabe
                }
            }
        }
        else {
            lives--
            println("Du hast falsch geraten. Dir bleiben noch $lives Leben.\n")
        }
        gerateneBuchstaben.add(buchstabe)
    }

    if (anzeigeWort.toString() == zielWort){
        println("Herzlichen Glückwunsch sie haben gewonnnen!")
        println("Die richtige Antwort ist: $zielWort")
    }
    else {
        println("Du hast leider verloren :(")
        println("Das richtige Wort wäre $zielWort")
    }
}