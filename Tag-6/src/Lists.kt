fun main(){
    // String list
    var articles: List<String> = listOf<String>("Banane", "Apfel", "Kiwi", "Zitrone")

    // Integer list
    var quantities: List<Int> = listOf(5, 6, 10, 4)

    // Double lists
    var prices: List<Double> = listOf(3.79, 2.49, 0.49, 0.79)
    var weights: List<Double> = listOf(0.1, 0.2, 0.3, 0.05)

    var weightOfApples: List<Double> = listOf(0.2, 0.21, 0.198)

    // Boolean list
    var availabilites: List<Boolean> = listOf(true, true, true, true)

    // Size of lists
    var sizeOfArticles: Int = articles.size
    var sizeOfQuantities = quantities.size
    var sizeOfPrices = prices.size
    var sizeOfWeights = weights.size
    var sizeOfAvailabilites = availabilites.size

    // Indexe
    var cheapestPriceIndex: Int = 2
    var heaviestIndex: Int = 2

    // Print the cheapest product name and price per kilo
    println("Willkommen in unserem Onlineshop! Wir haben $sizeOfArticles Produkte im Angebot.")
    println("Unser momentan Günstigstes Produkt ist die ${articles[4]} ${articles[cheapestPriceIndex]}.")
    println("Es kostet ${prices[cheapestPriceIndex]}€ pro Kilogramm und wiegt einzeln ${weights[cheapestPriceIndex]} Kilogramm.")
    println("Es ist noch ${quantities[cheapestPriceIndex]} mal verfügbar.")
    println()
    // TODO: buy all bananas
    val bananaIndex = 0
    var quantity = quantities[bananaIndex]
    var weight = weights[bananaIndex] * quantity
    var price = prices[bananaIndex] * weight

    println("Gewähltes Produkt: ${articles[bananaIndex]}")
    println("Preis pro Kilogram: ${prices[bananaIndex]}")
    println("Gewählte Anzahl: $quantity")
    println("Gesamt Preis: $price")


}