


fun main(){

    printGreeting()

    val myName = enterName()


    println("30°C sind ${celciusToFahrenheit(30.4)}°F")
    println("-2°C sind ${celciusToFahrenheit(-2)}°F")

    greetPerson()
    greetPerson("Gordon Lucas")


    happyBirthday("Martin", 28)

    happyBirthday(age = 28, person = "Martin")

}


fun printGreeting(){
    println("Hello there!")
    println("Nice to meet you")
}

fun enterName(): String{
    println("Please enter your name")
    val enteredName = readln()
    return enteredName
}

fun getInt(): Int{
    if ((1..2).toList().random() == 1){
        return 1
    }
    else {
        return 2
    }
}



fun celciusToFahrenheit(degreesCelcius: Int): Int{
    return (degreesCelcius * 9/5) + 32
}

fun celciusToFahrenheit(degreesCelcius: Double): Double{
    return (degreesCelcius * 9/5) + 32
}


fun greetPerson(person: String = "General Kenobi"){
    println("Hello, $person")
}

fun happyBirthday(person: String, age: Int){
    println("Alles Gute zu deinem $age.ten Geburtstag, $person!")
}




