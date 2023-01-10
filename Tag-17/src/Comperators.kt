fun main() {

    // Beispiel 1: Nutzer Password
    println("Geben sie jetzt ihr Passwort ein:")
    var userPasswordEingabe = readln()
    val USERPASSWORD = "guest123"

    if (userPasswordEingabe == USERPASSWORD){
        println("Passwort richtig eingegeben")
    }

    if (userPasswordEingabe != USERPASSWORD){
        println("Password wurde falsch eingegeben, sie haben noch 2 Versuche...")
    }

    // Beispiel 2: Player Score

    var scorePlayerOne: Int = (0..100).random()
    var scorePlayerTwo: Int = (0..100).random()

    // TODO: Equals
    if (scorePlayerOne == scorePlayerTwo) {
        println("Es ist ein Unentschieden.")
    }

    // TODO: Not Equals
    if (scorePlayerOne != scorePlayerTwo) {
        println("Es gibt einen Gewinner.")
    }

    // TODO: Bigger
    if (scorePlayerOne > scorePlayerTwo) {
        println("Spieler 1 hat gewonnen!")
    }

    // TODO: Bigger Equal
    if (scorePlayerOne >= scorePlayerTwo) {
        println("Spieler 1 hat gewonnen oder es gab ein unentschieden.")
    } else {
        println("Spieler 1 hat verloren.")
    }

    // TODO: Smaller Equal
    if (scorePlayerOne <= scorePlayerTwo) {
        println("Spieler 2 hat gewonnen oder es gab ein Unentschieden.")
    } else {
        println("Spieler 1 hat gewonnen!")
    }

    // TODO: Smaller
    if (scorePlayerOne < scorePlayerTwo) {
        println("Spieler 2 hat gewonnen")
    } else if (scorePlayerOne == scorePlayerTwo){
        println("Es gab ein Unentschieden")
    } else
    {
        println("Spieler 1 hat gewonnen!")
    }


    // Beispiel 3: Altersabfrage
    var alter = 16
    //if (alter < 18)

    var alter2 = 24

    //if (alter != alter2)

    // Beispiel 4: Stadt Einwohner

    var einwohnerZahl = 40000

    if (einwohnerZahl < 0){
        println("Du hast eine falsch Einwohnerzahl eingegeben")
    }
    else if (einwohnerZahl < 5000){
        println("Der Ort ist ein Dorf")
    }
    else if (einwohnerZahl < 50000){
        println("Der Ort ist eine Kleinstadt")
    }
    else if(einwohnerZahl < 1000000){
        println("Der Ort ist eine Stadt")
    }
    else
        println("Der Ort ist eine Metropole")
}