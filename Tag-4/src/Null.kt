package W1.D4

fun main(){
    /*
    // Beispiel Login
    var userName: String?


    print("What is your username? ")
    userName = readln()
    println("Hello $userName!")


    print("Press enter to logout..")
    readln()
    userName = null

    // Beispiel Formular ausfüllen
    var addresse: String = readln()
    var addressZusatz: String? = null


     */

    // Nullable Zahlen

    var zahl1: Int? = null
    var zahl2: Int = 3

    var result1: Int? = zahl1?.plus(zahl2)
    println(result1)


    var zahl3: Double = 2.4
    var zahl4: Double? = null

    var result2: Double? = zahl4?.plus(zahl3)
    println(result2)


    var result3 = 4 / 0
    println(result3)

}