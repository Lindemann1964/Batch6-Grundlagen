
open class Pizza(var size: Int, var price: Double, additionalIngredients: List<String> = listOf()) {

    open var ingredients: MutableList<String> = mutableListOf("Teig", "Tomatensauce", "Mozzarella")

    init {
        this.ingredients.addAll(additionalIngredients)
    }

    fun printMenu(number: Int){
        println("$number. ($size cm) $price Zutaten: $ingredients")
    }

    fun addIngredient(ingredient: String, price: Double) {
        this.ingredients.add(ingredient)
        this.price += price
    }

    fun checkIngredients(ingredient: String): Boolean{
        return ingredients.contains(ingredient)
    }

}




