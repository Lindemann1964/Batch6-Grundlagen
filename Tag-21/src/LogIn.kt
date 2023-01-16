fun main(){
    var versuche = 0
    var userLoggedIn = false

    while(versuche < 3 && !userLoggedIn){
        println("geben sie ihr Passwort ein:")
        var pw = readln()
        if (pw == "guest123"){
            userLoggedIn = true
        }
        else {
            println("Falsches Passwort. Versuch sie es noch einmal")
            versuche++ // versuche = versuche + 1
        }
    } // Ende der Schleife

    if (versuche == 3 ){
        println("Kein Zugriff, Programm wird geschlossen")
    }
    if (userLoggedIn){
        appStarten()
    }

}

fun appStarten(){

}
