// Zu beginn spielen wir nur mit Worten, die 5 Buchstaben enthalten
val wortListe = listOf("Apfel", "Birne", "Sport", "Kampf", "super", "eitel",
    "Honig", "Engel", "innen", "Angst", "Durst", "Zecke",
    "Biene", "Arena", "Traum", "Vogel", "Bingo", "Akita",
)
var lives: Int = 5

var zielWort: String = ""
var anzeigeWort: String = "_____"

// Tracker, welche Buchstaben bereits geraten sind
var gerateneBuchstaben = mutableSetOf<String>()

fun main(){

}