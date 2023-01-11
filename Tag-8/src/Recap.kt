package W2.D3

fun main() {

    // TODO: list without values
    var emptyList: List<Double> = listOf()
    // TODO: list with initial values
    var liste = listOf(2.0, 3.0)
    // TODO: mutable list without values
    var emptyMutableList = mutableListOf<Boolean>()
    // TODO: mutable list with initial values
    var einkaufsWagen = mutableListOf("Apfel", "Milch", "Ananas", "Zitrone")
    // TODO: get size of list
    println(einkaufsWagen.size)
    // TODO: get value at index and change value at index
    var ergebnis = liste[1] + 1
    einkaufsWagen[1] = "Mandelmilch"

    // TODO: Show IndexOutOfBounds Exception
    //emptyList[0]

    // TODO: demonstrate .add
    einkaufsWagen.add("Banane")

    // TODO: demonstrate .remove
    einkaufsWagen.remove("Apfel")
    // TODO: demonstrate first & last
    var erstesProdukt = einkaufsWagen.first()
    println("Das letzte Produkt was ich eingegekauft habe ist: ${einkaufsWagen.last()}")

    // TODO: demonstrate min & max
    println(einkaufsWagen.min())
    println(einkaufsWagen.max())

    // TODO: demonstrate indexOf
    var idx = einkaufsWagen.indexOf("Banane")
    einkaufsWagen[idx] = "Avocado"

    // TODO: demonstrate .clear
    println(einkaufsWagen)
    einkaufsWagen.clear()
    println(einkaufsWagen)
}
