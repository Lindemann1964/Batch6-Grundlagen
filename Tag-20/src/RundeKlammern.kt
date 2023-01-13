import java.time.*

fun main(){
    // Ausführungsreihenfolge
        // Beispiel 1
        val result1 = (2 + 3) * 5
        println("(2 + 3) * 5 = $result1")

        val result2 = 2 + (3 * 5)
        println("2 + (3 * 5) = $result2\n")

        // Beispiel 2
        val result3 = "Gordon" + " Lucas".uppercase()
        val result4 = ("Gordon" + " Lucas").uppercase()

        println("Result3: $result3")
        println("Result4: $result4\n")

        // Beispiel 3
        val playerAlive = true
        val enemyAlive = false

        val result5 = !(playerAlive && enemyAlive)
        val result6 = !playerAlive &&  enemyAlive

        println("Result 5: $result5")
        println("Result 6: $result6\n")

    // Funktionsaufruf:
    val testListe = mutableListOf('b', 'b', 'c', 'a')           // Funktion: listOf()
    testListe.add(1, 'd')                         // Funktion: add(index, element)
    val sortierteListe = testListe.sorted()                     // Funktion: sorted()
    println(sortierteListe + "\n")                              // Funktion: println()
    val rueckwaertsListe = listeRueckwaertsSortieren(testListe) // Funktion: listeRueckwaertsSortieren(list)
    aktuelleUhrzeitAnzeigen()                                   // Funktion: aktuelleUhrzeitAnzeigen()


    // Bedingungen
    bedingungen()

}

// FunktionsDefinitionen -> Parameter
fun aktuelleUhrzeitAnzeigen(){                                  // Parameter: Keine
    println(LocalDateTime.now())
}

fun listeRueckwaertsSortieren(list: List<Char>): List<Char>     // Parameter: list: List<Char>
{
    return if (list.isEmpty())
        list
    else{
        var sortierteListe = list.sorted()
        var ergebnisListe = mutableListOf<Char>()

        for (i in list.size - 1 downTo 0 ){
            ergebnisListe.add(list[i])
        }
        ergebnisListe
    }
}


// Bedingungen
fun bedingungen(){
    val isRainy = listOf(true, false).random()
    val temperature = (-10.. 30).random()

    // If
    if (isRainy) {
        if (temperature < 4)
            println("Es schneit heute.")
        else
            println("Es regnet heute.")
    }

    // When
    when (temperature){
        30 -> println("Heute absolute höchst Temperatur von 30°C!!")
        in 20..29 -> println("Heute ist es angenehm warm :)")
        in 10..19 -> println("Heute ist es weder kalt, noch warm. ")
        in 0 .. 9 -> println("Heute ist es leicht kalt.")
        in -10 .. 0 -> println("Heute ist es eiskalt :(")
        else -> println("Störung an unserem Thermometer")
    }



}