fun main() {
    var articles: MutableList<String> = mutableListOf("Banane", "Apfel", "Birne", "Zitrone")
    var quantities: MutableList<Int> = mutableListOf(2, 6, 10, 8)
    var prices: MutableList<Double> = mutableListOf(3.79, 2.49, 1.99, 2.99)
    var weights: MutableList<Double> = mutableListOf(0.1, 0.2, 0.15, 0.05)

    println(articles.min())
    println(prices.max())

    // TODO: add Orange as a produkt
    // Neues Produkt Orange hinzufügen
    articles.add("Orange")
    quantities.add(8)
    prices.add(1.23)
    weights.add(0.33)


    // TODO: remove and clear list
    // Produkt Birne löschen
    //articles.remove("Birne")


    // TODO: einen Apfel kaufen
    var index: Int = articles.indexOf("Apfel")
    println("Der Preis für einen Apfel beträgt ${prices[index]}")
    quantities[index]--


    // TODO: Save first and last element in variables

    // TODO: remove first and last element from list (show remove and removeLast way)

    // TODO: Save is empty and isNotEmpty and any in variables

    // TODO: save min and max in variables and get index of them

    // TODO: find cheapest element and display its data

    // TODO: find heaviest element and display its data

    // TODO: remove object with highest availability from store

    // TODO: You make holidays, so empty your store show that with an boolean to the customer

}