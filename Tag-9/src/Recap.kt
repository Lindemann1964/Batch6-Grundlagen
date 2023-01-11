fun main() {
    var articles: MutableList<String> = mutableListOf("Banane", "Apfel", "Birne")
    var quantities: MutableList<Int> = mutableListOf(2, 6, 10)
    var prices: MutableList<Double> = mutableListOf(3.79, 2.49, 1.99)

    // TODO: save all fruits in variables (with first and last)
    var firstArticle = articles.first()
    var secondArticle = articles[1]
    var thirdArticle = articles.last()

    // TODO: remove first, and then clear articles
    articles.remove(firstArticle)
    articles.clear()

    // TODO: Check if articles are empty or not
    var articlesIsEmpty = articles.isEmpty()

    // TODO: override articles with list of vegetables
    articles = mutableListOf("Gurke", "Tomate", "Kartoffel")
    quantities = mutableListOf(3, 5, 7)
    prices = mutableListOf(0.99, 1.49, 2.99)

    // TODO: display the cheapest article (min and index)
    var cheapestPrice = prices.min()
    var indexOfCheapestArticle = prices.indexOf(cheapestPrice)
    var quantityOfCheapestArticle = quantities[indexOfCheapestArticle]
    var nameOfCheapestArticle = articles[indexOfCheapestArticle]

    println("Unser günstigstes Produkt ist: $nameOfCheapestArticle")
    println("Es kostet: $cheapestPrice")
    println("Wir haben es noch so oft im Bestand: $quantityOfCheapestArticle")

    // TODO: display the most expensive article (max and index)
    var highestPrice = prices.max()
    var indexOfHighestArticle = prices.indexOf(highestPrice)

    // TODO: Sort the products by alphabet
    //articles.sort()

    // TODO: Show the smarter way
    var articlesSorted = articles.sorted()
    var quantitiesSorted = mutableListOf<Int>()
    var pricesSorted = mutableListOf<Double>()

    //
    var sortiertesProdukt = articlesSorted[0]
    var idx0 = articles.indexOf(sortiertesProdukt)

    var anzahl0 = quantities[idx0]
    quantitiesSorted.add(anzahl0)

    var preis0 = prices[idx0]
    pricesSorted.add(preis0)

    var idx1 = articles.indexOf(articlesSorted[1])
    quantitiesSorted.add(quantities[idx1])
    pricesSorted.add(prices[idx1])

    var idx2 = articles.indexOf(articlesSorted[2])
    quantitiesSorted.add(quantities[idx2])
    pricesSorted.add(prices[idx2])


    println("Das Sortiment sortiert nach alphabet: $articlesSorted")
    println("Die Preise: $pricesSorted")

}