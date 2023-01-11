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
        println(ex.message)
        println("Zahl 2 wurde falsch eingegeben, versuchen sie es nochmal")
        zahl2 = readln().toInt() // Vorsicht: hier könnten noch Fehler passieren
    }


    // TODO: save result
    var result = zahl1 + zahl2

    // TODO: print result
    println("$zahl1 + $zahl2 = $result")


    // Beispiel mit Text
    val text = "Der Nikolaus wohnt im Schokohaus"

    val indexWort = 6
    try {
        println(text.split(' ')[6])
    } catch (ex: Exception){
        println(ex.message)
        println(ex)
    }
}


// TODO: Einlese Funktion für Zahlen
fun readNumberAsInt(): Int?{
    println("Geben Sie eine Zahl ein:")
    val input = readln()
    val result: Int
    try {
        result = input.toInt()
        return result
    } catch (ex: Exception) {
        print("ERROR: keine Valide Zahl eingegeben.")
        return null
    }
}