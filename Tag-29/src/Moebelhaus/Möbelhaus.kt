package Moebelhaus

class Möbelhaus {

    var ausstellung = mutableListOf<MoebelStueck>()
    var produktKatalog = mutableMapOf<Int, MoebelStueck>()

    init {
        val couch1 = Couch("Förul", 199.99, 1.5, 5.0, 1.0, true)
        val couch2 = Couch("Förul", 199.99, 1.5, 5.0, 1.0, true)

        println(couch1.toString())

        println("Sind die 2 Couches gleich?")
        println(couch1 == couch2)

        // Couch zum Produkt Katalog (map) hinzufügen
        produktKatalog[0] = couch1

        // Wir verändern das Objekt. Daher wird der Name auch im Produktkatalog geändert
        couch1.name = "Fahrad"

        println("Sind die 2 Couches gleich?")
        println(couch1 == couch2)


        // Möbel zur Ausstellung (list) hinzufügen
        ausstellung.add(couch1)
        ausstellung.add(Bett("Ema", 399.99, 1.0, 4.20, 1.40, true))
    }
}