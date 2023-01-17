fun main() {
    // Unsere Pizza Auswahl
    var pizzaSorten: MutableList<String> = mutableListOf("Hawaii", "Salami", "Tonno")

    // Die Liste der Bestellungen
    var orderList: MutableList<String> = mutableListOf()

    // TODO: implement while loop
    var i: Int = 0

    do{
        var pizza = pizzaSorten.random()
        orderList.add(pizza)
        i++
    } while(i < 5)

    println(orderList)
    println(orderList.size)

}







// Implement addRandomPizzas function
fun addRandomPizzas(list: MutableList<String>, amount: Int) {
    var pizzaSorten: MutableList<String> = mutableListOf("Hawaii", "Salami", "Tonno")

    var pizzaCount: Int = list.size
    while (pizzaCount < amount) {
        var randomPizza: String = pizzaSorten.random()
        list.add(randomPizza)
        pizzaCount = list.size
        println("Pizza $pizzaCount: $randomPizza")
    }
}