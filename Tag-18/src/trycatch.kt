fun main() {
    /* TODO: Unser Ziel
          - zwei Zahlen von der Konsole einlesen
          - diese Addieren
          - Ergebnis anzeigen
     */

    // TODO: numberOne input
    println("ZAHL 1:")
    val zahl1Str: String = readln()
    var zahl1: Int

    // try-catch numberOne to Int
    try {
        zahl1 = zahl1Str.toInt()
    }
    catch (ex: Exception){
        println(ex)
        zahl1 = (-100..100).random()
        println("Zahl 1 wurde falsch eingegeben, deswegen benutzten wir eine Zufallszahl")
    }

    // TODO: numberTwo input
    println("ZAHL 2:")
    val zahl2Str: String = readln()
    var zahl2: Int



    // TODO: try-catch numberTwo toInt
    try {
        zahl2 = zahl2Str.toInt()
    }
    catch (ex: Exception){
        println(ex)
        zahl2 = 0
        println("Zahl 2 wurde falsch eingegeben, deswegen benutzten wir den Wert 0")
    }

    // TODO: save result
    var result = zahl1 + zahl2

    // TODO: print result
    println("$zahl1 + $zahl2 = $result")



}


// TODO: Einlese Funktion für Zahlen
fun readNumberAsInt(input: String): Int?{
    val result: Int
    try {
        result = input.toInt()
        return result
    } catch (ex: Exception) {
        print("ERROR: keine Valide Zahl übergeben.")
        return null
    }
}