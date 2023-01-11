import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt
// import kotlin.math.*  <-- Importiert alle Inhalte zB des math-Packages
// import kotlin.math.round as roundX

fun main() {

    //TODO: Beispiel: Kreisfläche berechnen
    var radius: Double = 3.5
    var kreisflaeche = PI * radius * radius
    //println("Die Fläche eines Kreises mit dem Radius $radius ist: $kreisflaeche")

    //TODO: Beispiele: Quadrat und Wurzel berechnen
    var seitenlaenge: Double = 2.5
    var quadratflaeche = seitenlaenge.pow(2)
    var seitenLaengeNeu = sqrt(quadratflaeche)

    //println("Ein Quadrat mit der Seitenlänge $seitenlaenge hat eine Fläche von: $quadratflaeche")
    //println("Die Wurzel aus $quadratflaeche ist $seitenLaengeNeu")

    //TODO: Text
    var unicodeTxt = 'a'
    var escapedString: String = "Hello World!\t\t \"Ciao World!\""
    var rawString = """
        Dies ist ein etwas längerer Text.
        Hier geht es in Zeile 2 weiter.
        Und hier in Z.3!
    """.trimIndent()

    println(unicodeTxt)
    println(escapedString)
    println(rawString)

    println(escapedString.length)

    var replacedString = escapedString.replace("o", "2")
    println(replacedString)
}