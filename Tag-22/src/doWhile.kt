// Coding Kopf oder Zahl = True oder False
// kommt true, gewinnst du deinen Einsatz, kommt false verlierst du ihn

fun main() {
    // Abbruch Variable
    var continuePlaying: Boolean

    // Startgeld
    var money = 10

    // do while loop continueGamble and amount not 0
    do {
        println("Dein Kontostand beträgt: $money€.")

        // Frage wie viel man bieten möchte
        var einsatz: Int = askForAmount(money)

        // Münzewerfen
        money += playGame(einsatz)

        println("Dein neuer Kontostand beträgt: $money€.")

        // Frage, ob man weiter spielt
        continuePlaying = askForPermission()

    } while (continuePlaying && (money > 0))
}

fun askForAmount(kontoStand: Int): Int{

    var input_int: Int? = null

    do {
        println("Bieten sie jetzt ihren Einsatz: ")
        try {
            input_int = readln().toInt()
            if (input_int > kontoStand){
                println("Zu hoher Einsatz. Sie können Maximal $kontoStand bieten")
                input_int = null
            }
        }
        catch (ex: Exception){
            println("Fehlerhafte eingabe, bitte nochmal versuchen")
        }
    } while (input_int == null)

    return input_int
}

// ask for permission
fun askForPermission(): Boolean {
    // print J/N
    println("Willst du weiterspielen (J/N):")

    // input uppercase
    val input: String = readln().uppercase()

    // implement return logic
    if (input == "J") {
        return true
    } else if (input == "N") {
        return false
    } else {
        println("Fehlerhafter input...bitte neu eingeben!")
        return askForPermission()
    }
}

// Play game: wirft eine Münze, und gibt den Gewinn/Verlust wieder
fun playGame(amount: Int): Int {
    // Werfe eine Münze
    val randomBoolean: Boolean = listOf(true, false).random()

    // Check ob man gewonnen hat
    if (randomBoolean) {
        println("TRUE! Du gewinnst: $amount€.")
        return amount
    } else {
        println("FALSE! Du verlierst $amount€.")
        return -amount
    }
}