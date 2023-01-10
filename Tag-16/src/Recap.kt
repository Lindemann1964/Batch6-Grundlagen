fun main() {
    // Greet the User
    greeting()

    // Ask for user Age and Name
    var name: String = getName()
    var age: Int = getAge()

    // Use the Name and Age to get a personal greeting
    greetUser(name, age)

    // Same but with Return value
    val fullGreeting = getGreeting(name, age)
    println(fullGreeting)

    logOff()
}

// TODO: void function greeting
fun greeting() {
    println("Hallo Nutzer!")
    println("Ich hoffe du hattest ein schönes Wochenende!")
}

// TODO: getName: String
fun getName(): String {
    println("Bitte geben Sie ihren Namen ein:")
    return readln()
}

// TODO: getAge: Int
fun getAge(): Int {
    println("Geben Sie nun bitte ihr Alter ein:")
    return readln().toInt()
}

// TODO: greetUser name, age
fun greetUser(name: String, age: Int) {
    println("Hallo $name, du bist also $age Jahre alt.")
}

// TODO: getGreeting: String with name, age
fun getGreeting(name: String, age: Int): String {
    return "Hallo $name, du bist also $age Jahre alt."
}

// TODO: logOff: Verabschiedung mit default Wert
fun logOff(name: String = "User"){
    println("Tschüss, $name! Bis zum nächsten Mal!")
}