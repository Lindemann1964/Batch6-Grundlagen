fun main(){

    // Same lists as on Day1, but mutable
    var articles: MutableList<String> = mutableListOf("Banane", "Apfel", "Kiwi", "Zitrone")
    var quantities: MutableList<Int> = mutableListOf(5, 6, 10, 0)
    var prices: MutableList<Double> = mutableListOf(3.79, 2.49, 0.49, 0.79)
    var weights: MutableList<Double> = mutableListOf(0.1, 0.2, 0.3, 0.05)
    var availabilities: MutableList<Boolean> = mutableListOf(true, true, true, false)

    var basket: Int?
    var weight: Double?
    var price: Double?
    var indexOfArticle: Int?

    // TODO: override Zitronen with Limetten
    articles[3] = "Limette"
    quantities[3] = 4
    availabilities[3] = true


    // Neues Produkt Orange hinzufügen
    articles.add("Orange")
    quantities.add(8)
    prices.add(1.23)
    weights.add(0.33)
    availabilities.add(true)


    // TODO: Günstigstes Element ausgeben
    var cheapestPrice = prices.min()
    var cheapestIndx = prices.indexOf(cheapestPrice)

    println("Das günstigste Produkt ist ${articles[cheapestIndx]} und kostet $cheapestPrice €/Kg")

    // TODO: Element mit der meisten Anzahl ausgeben
    var mostProducts = quantities.max()
    var mostProductsIdx = quantities.indexOf(mostProducts)

    println("Wir haben am meisten ${articles[mostProductsIdx]} auf Lager, nämlich $mostProducts Stück")

    // TODO: Add Melons to end of the list, remove Apfel
    articles.add("Melonen")
    quantities.add(3)
    availabilities.add(true)
    prices.add(0.45)
    weights.add(2.3)

    var userInput = readln()
    var idx = articles.indexOf(userInput)
    articles.remove(userInput)
    quantities.remove(quantities[idx])
    prices.remove(prices[idx])
    weights.remove(weights[idx])


    cheapestPrice = prices.min()
    cheapestIndx = prices.indexOf(cheapestPrice)
    println("Das günstigste Produkt ist ${articles[cheapestIndx]} und kostet $cheapestPrice €/Kg")
}