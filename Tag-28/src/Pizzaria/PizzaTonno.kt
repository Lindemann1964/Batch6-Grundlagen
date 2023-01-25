
class PizzaTonno(size: Int,price: Double,additionalIngredients: List<String> = listOf()):
    Pizza(size, price, additionalIngredients)  {

    // Überschreiben der Standardzutaten
    override var ingredients: MutableList<String> = mutableListOf("Teig", "Tomatensauce", "Mozzarella", "Thunfisch", "Zwiebeln")

    init {
        this.ingredients.addAll(additionalIngredients)
    }



}