package W1.D2

fun main(){
    var moneyInMyPocket: Double = 25.0
    var moneyInMyBank = 1000.00

    var priceOfCola: Double = 1.9

    var priceOfFanta: Int = 2

    // Kaufe eine Cola
    moneyInMyPocket -= priceOfCola

    // Kaufe eine Fanta
    moneyInMyPocket -= priceOfFanta

    // Druck uns aus wie viel Geld wir übrig haben
    println("Ich habe noch $moneyInMyPocket € übrig.")


    // Test mit Kommazahlen
    println(2.0 - 0.5)
    println(2.0 - 1)
    println(2 - 0.5)



}