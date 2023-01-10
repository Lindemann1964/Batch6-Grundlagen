fun main() {

    val wochenTage = listOf("Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag")

    // Aktueller Tag einlesen
    println("Geben sie den Wochentag als Zahl ein (1-7)")
    val index: Int = readln().toInt() - 1
    val aktuellerTag: String = wochenTage[index]

    // TODO: If Else Anweisung
    // Ist heute Wochenende? dann muss ich nicht arbeiten
    if (heuteWochenende(aktuellerTag)){
        println("Heute ist Wochenende, ich muss nicht arbeiten.")
    }
    // Andernfalls: Bin ich krank? dann sollte ich auch nicht arbeiten
    else if(zufallsKrankheit()) {
        println("Heute bin ich krank, und gehe deswegen nicht arbeiten")
    }
    else {
        println("Heute gehe ich zur Arbeit")
    }
}

fun heuteWochenende(day: String): Boolean{
    return when(day){
        "Samstag" -> true
        "Sonntag" -> true
        else -> false
    }
}

fun zufallsKrankheit(): Boolean{
    // Zufällige Zahl zw. 0 und 10
    when ((0..10).random()){
        // Falls die Zahl eine 0 oder 1 ist, bin ich krank, sonst geht es mir gut
        0 -> {
            println("Mir ist heute richtig, richtig übel :(")
            return true
        }
        1 -> {
            println("Mir ist heute richtig übel :(")
            return true
        }
        in 2..3 -> {
            println("Mir geht's nicht gut, aber ich packe das")
            return false
        }
        else -> {
            println("Heute geht es mir gut :)")
            return false
        }
    }
}
