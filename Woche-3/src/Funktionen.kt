import kotlin.random.Random
import kotlin.random.nextInt


fun main() {

    /*
    var exampleInt = 5
    add(10, 5)
    add(11, 99)
    add(12, 17)
    add(exampleInt, 17)

    booleanExample(true)
    booleanExample(false)

    var shoppingCart: MutableList<String> = mutableListOf()
    var wishList: MutableList<String> = mutableListOf()
    var testList: MutableList<Int> = mutableListOf()

    addArticleWithName("Orangen", shoppingCart)
    addArticleWithName("Schuhe", wishList)
    var testString: String = "Hallo"
    addArticleWithName(testString, wishList)

    shoppingCart.add("Schuhe")
    println("Diese Liste enthält:")
    println(shoppingCart)
    shoppingCart.add("Salz")
    println("Diese Liste enthält:")
    println(shoppingCart)
    shoppingCart.add("Pfeffer")
    println("Diese Liste enthält:")
    println(shoppingCart)
    shoppingCart.add("Nudeln")
    println("Diese Liste enthält:")
    println(shoppingCart)
    shoppingCart.add("Mais")
    println("Diese Liste enthält:")
    println(shoppingCart)
    shoppingCart.add("Reis")
    println("Diese Liste enthält:")
    println(shoppingCart)

    addArticleWithName("Schuhe", shoppingCart)
    shoppingCart.remove("Schuhe")
    addArticleWithName("Schuhe", wishList)
    addArticleWithName("Salz", shoppingCart)
    addArticleWithName("Pfeffer", shoppingCart)
    addArticleWithName("Nudeln", shoppingCart)
    addArticleWithName("Mais", shoppingCart)
    addArticleWithName("Reis", shoppingCart)
     */



}

// TODO: Funktionen mit Parametern
fun add(number1: Int, number2: Int) {
    var sum = number1 + number2
    println("Die Summe aus $number1 und $number2 ist: $sum")
}

fun booleanExample(boolean1: Boolean) {
    if (boolean1 == true) {
        println("Hallo Welt")
    } else {
        println("Tschüß Welt")
    }
}


fun addArticleWithName(name: String, list: MutableList<String>){
    list.add(name)
    println("Diese Liste enthält:")
    println(list)
}


//TODO: Einstieg in Funktionen
fun greeting() {
    println("Hello")
}

fun printGreeting() {
    println("Hello")
    println("World!")
}


//TODO: "Computerspiel"
fun attack() {
    var randomNumber: Int = (1..10).random()
    println(randomNumber)
}

fun attack2() {
    val damage = Random.nextInt(1, 11)
    println(damage)
}


//TODO Rückgabewerte
// String-Rückgabewert
fun randomGreeting(): String {

    val listOfGreetings: List<String> = listOf("Hallo", "Bonjour", "Hello", "Hola")
    var randomGreeting: String = listOfGreetings.random()

    return randomGreeting
}