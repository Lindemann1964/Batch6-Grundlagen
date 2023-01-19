var options = listOf("Schere", "Stein", "Papier")
var scorePlayer = 0
var scoreComputer = 0

fun main(){
    // Spiele so lange bis einer der Spieler gewonnen hat
    do {
        playGame()
    } while (scoreComputer < 3 && scorePlayer < 3)

    // TODO: Anzeigen wer gewonnen hat
    println("ENDSTAND! Spieler: $scorePlayer \t Computer: $scoreComputer")

}

fun playGame(){
    /* Diese Funktion spielt 1 Hand
             - wähle zufällig für den Computer
             - lass den Spieler eine Hand auswählen
             - vergleiche wer gewonnen hat,
             - bei Unentschieden, spiele nochmal
             - wenn jemand gewinnt, bekommen sie einen Punkt
     */
    var hand1 = handAuswahl()
    var hand2 = options.random()

    vergleich(hand1, hand2)
}

fun handAuswahl(): String{
    /* Lässt die SpielerIn eine Hand auswählen
             - Optionen Anzeigen
             - Auswahl treffen
             - falls falsche Auswahl, wiederhole die Funktion
             - gebe die Auswahl zurück
     */
    println("Wähle etwas aus")
    for (i in options){
        println(i)
    }
    var spielzug: String

    var richtigeEingabe: Boolean

    do {
        spielzug = readln().capitalize()
        when(spielzug){
            "Schere" -> richtigeEingabe = true
            "Stein" -> richtigeEingabe = true
            "Papier"-> richtigeEingabe = true
            else -> {
                println("Ungültige Auswahl. Neue Eingabe:")
                richtigeEingabe = false
            }
        }
    } while (!richtigeEingabe)

    return spielzug
}

// Wir nehmen an: Hand1 gehoert zum Spieler, Hand2 gehoert dem Computer
fun vergleich(hand1: String, hand2: String){
    if (hand1 == "Schere"){
        when (hand2){
            "Papier" -> {
                scorePlayer += 1
                println("Schere schlägt Papier")
            }
            "Schere" -> println("unentschieden")
            "Stein" -> {
                scoreComputer += 1
                println("Stein schlägt Schere")
            }
        }
    }
    else if (hand1 == "Stein"){
        when (hand2){
            "Papier" -> {
                scoreComputer += 1
                println("Papier schlägt Stein")
            }
            "Schere" -> {
                println("Stein schlägt Schere")
                scorePlayer += 1
            }
            "Stein" -> println("unentschieden")
        }
    }
    else if (hand1 == "Papier"){
        when (hand2){
            "Papier" -> println("unentschieden")
            "Schere" -> {
                println("Schere schlägt Papier")
                scoreComputer += 1
            }
            "Stein" -> {
                scorePlayer += 1
                println("Papier schlägt Stein")
            }
        }
    }
}
