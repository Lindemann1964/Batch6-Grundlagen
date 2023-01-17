

fun main(){
    // Beispiel 1: Essen
    var hunger = 100
    do {
        essen()
        hunger -= 5
    }while(hunger > 0)


    // Beispiel 2: Haende Waschen
    do{
        var haendeDreckig = haendeWaschen()
    } while (haendeDreckig)

    // Beispiel 3: PIN Eingabe
    val PIN = "1234"
    do {
        var pinEingabe = readln()
    }while(pinEingabe != PIN)

}

fun essen(){}

fun haendeWaschen(): Boolean {
    return listOf(true, false).random()
}