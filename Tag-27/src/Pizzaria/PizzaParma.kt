package Pizzaria
class PizzaParma {
    // Eigenschaften
    var preis: Double = 11.99
    var zutaten = listOf("Teig", "Tomatensauce", "Mozzarella", "Parmaschinken", "Rucola", "Kirschtomaten")


    // Methoden
    fun printName() {
        println("Parma")
    }

    fun printDescription() {
        println("Das ist eine Parma-Pizza.")
        println("Sie besteht aus Teig, Tomatensauce, Mozzarella, Parmaschinken, Rucola und Kirschtomaten.")
        println("Sie kostet ${this.preis}€.")
    }
}