fun main(){

    // Account Daten
    val USERNAME = "Gordon"
    val PASSWORT = "guest123"
    // Nutzer eingabe
    println("Nutzername:")
    var username = readln()
    println("Passwort:")
    var passwort = readln()

    var nutzerEingeloggt: Boolean = (username == USERNAME) && (passwort == PASSWORT)

    // Alter
    println("Geben sie ihr Alter ein: ")
    val userAlter = readln().toInt()
    if (userAlter >= 18 && nutzerEingeloggt){
        println("Zeige alle Produkte an")
    }
    
    // Warenkorb beispiel
    val warenkorbPreis = 8.98
    var budget = 15.00

    if (warenkorbPreis <= budget){
        println("Kann erfolgreich gekauft werden")
        budget -= warenkorbPreis
    }
    else {
        println("Nicht genug Guthaben")
    }

    // TODO: Platz für eure Beispiele



}

fun showLogin(){

}
