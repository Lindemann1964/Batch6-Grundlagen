package Pizzaria

class PizzaSalami {
    // Eigenschaften
    var preis = 8.99
    var zutaten = listOf("Teig", "Tomatensauce", "Mozzarella", "Salami")


    // Methoden
    fun printName() {
        println("Salami")
    }

    fun printDescription() {
        println("Das ist eine Salami-Pizza.")
        println("Sie besteht aus Teig, Tomatensauce, Mozzarella und Salami.")
        println("Sie kostet ${this.preis}€.")
    }
}