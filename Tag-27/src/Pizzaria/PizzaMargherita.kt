package Pizzaria

class PizzaMargherita {
    // Eigenschaften
    var preis: Double = 7.99
    var zutaten = listOf("Teig", "Tomatensauce", "Mozzarella")


    // Methoden
    fun printName() {
        println("Margherita")
    }

    fun printDescription() {
        println("Das ist eine Pizza-Margherita.")
        println("Sie besteht aus Teig, Tomatensauce und Mozzarella.")
        println("Sie kostet ${this.preis}€.")
    }
}