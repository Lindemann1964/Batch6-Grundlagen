package Pizzaria

fun main(){

    // Pizzas initialisieren

    val pizza_1: PizzaMargherita = PizzaMargherita()
    val pizza_2: PizzaSalami = PizzaSalami()
    val pizza_3: PizzaParma = PizzaParma()


    // Methoden aufrufen mit Punkt notation
    println("Wir haben folgende Pizzen im Angebot:")

    pizza_1.printName()
    pizza_2.printName()
    pizza_3.printName()

    println("Wenn du Fragen zu einer der Pizzen hast, gib ihren Namen ein um mehr zu erfahren:")
    var input: String = readln()
    if (input == "Margherita") {
        pizza_1.printDescription()
    } else if (input == "Salami") {
        pizza_2.printDescription()
    } else if (input == "Parma") {
        pizza_3.printDescription()
    } else {
        println("Die von dir eingegebene Pizza führen wir nicht...")
    }

    // Eigenschaft als Liste
    for (zutat in pizza_3.zutaten){
        println(zutat)
    }
}