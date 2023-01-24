package W6.D2.Pizzaria

class Pizza {
    var name: String
    var size: Int
    var price: Double
    var ingredients: MutableList<String> = mutableListOf("Teig", "Tomatensauce", "Mozzarella")

    constructor(name: String, size: Int, ingredients: List<String>, price: Double) {
        this.name = name
        this.size = size
        this.price = price
        this.ingredients.addAll(ingredients)
    }

    fun extraZutat(zutat: String){
        this.ingredients.add(zutat)
        this.price += 1.0
    }

    fun printPizza() {
        println("Die Pizza heißt $name.")
        println("Sie ist $size cm groß.")
        println("Sie kostet $price Euro.")
        println("Die Zutaten sind: $ingredients")
    }
}




