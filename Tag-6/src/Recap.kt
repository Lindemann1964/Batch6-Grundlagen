@file:Suppress("DuplicatedCode")

fun main(){

    // price: euro per kilogram (€/kg)
    // weight: kilograms per article (kg/1)

    // article one
    val articleOneName: String = "Banane(n)"
    var articleOneQuantity: Int = 2
    var articleOneAvailable: Boolean = true
    var articleOnePrice: Double = 0.69
    var articleOneWeight: Double = 0.350

    // article two
    var articleTwoName: String = "Apfel"
    var articleTwoQuantity: Int = 6
    var articleTwoAvailable: Boolean = true
    var articleTwoPrice: Double = 0.49
    var articleTwoWeight: Double = 0.2

    // article three
    var articleThreeName: String = "Kiwi"
    var articleThreeQuantity: Int = 10
    var articleThreeAvailable: Boolean = true
    var articleThreePrice: Double = 1.99
    var articleThreeWeight: Double = 0.3

    var basket: Int?
    var priceForBasket: Double?
    var weightOfArticlesInBasket: Double?

    // Buy 2 Bananas
    basket = 2
    articleOneQuantity -= basket
    articleOneAvailable = false
    weightOfArticlesInBasket = basket * articleOneWeight
    priceForBasket = weightOfArticlesInBasket * articleOnePrice

    println("Du hast $basket $articleOneName in den Warenkorb gepackt.")
    println("Das Gesamtgewicht beträgt: $weightOfArticlesInBasket kg.")
    println("Du musst folgenden Preis bezahlen: $priceForBasket €.")
    println()

    // Reset shopping basket
    basket = null
    priceForBasket = null
    weightOfArticlesInBasket = null


    // Buy 4 Apples
    println("Wie viele Äpfel möchten Sie kaufen?")
    var input: String = readln()
    basket = input.toInt()
    articleTwoQuantity -= basket
    weightOfArticlesInBasket = basket * articleTwoWeight
    priceForBasket = weightOfArticlesInBasket * articleTwoPrice

    println("Du hast $basket $articleTwoName in den Warenkorb gepackt.")
    println("Das Gesamtgewicht beträgt: $weightOfArticlesInBasket kg.")
    println("Du musst folgenden Preis bezahlen: $priceForBasket €.")

    // Reset shopping basket
    basket = null
    priceForBasket = null
    weightOfArticlesInBasket = null

}