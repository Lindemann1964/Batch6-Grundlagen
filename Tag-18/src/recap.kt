package W4.D3

fun main() {
    val USER1 = "Gordon"
    val PW1 = "guest"

    val USER2 = "Felix"
    val PW2 = "felix123"


    println("Geben sie ihren Usernamen ein")
    val username = readln()
    println("Geben sie ihr Passwort ein")
    val passwort = readln()

    // TODO: Equals
    if (username == USER1){
        if (PW1 == passwort){
            println("Willkommen $USER1")
        }
    }
    // TODO: Not Equals

    if (username != USER1){
        if (username == USER2)
            println("Passwort Abfrage User2")
    }

    // TODO: Bigger
    val alter = 27
    if (alter > 17){
        println("Zeige alle 18+ Serien an")
    }

    // TODO: Bigger Equal
    if (alter >= 18){
        println("Zeige alle 18+ Serien an")
    }

    // TODO: and
    var user1LoggedIn = false
    var user2LoggedIn = false

    if (username == USER1 && passwort == PW1){
        user1LoggedIn = true
    }
    else if (username == USER2 && passwort == PW2){
        user2LoggedIn = true
    }

    // TODO: or
    if (user1LoggedIn || user2LoggedIn){
        println("Einer der User ist angemeldet")
    }

    // TODO: not
    if (!(user1LoggedIn || user2LoggedIn)){
        println("Neuer LoginScreen")
    }
    // Identisch:
    if (!user1LoggedIn && !user2LoggedIn){
        println("Neuer LoginScreen")
    }

}