package Bank

class Konto (var kontoinhaber: String) {
    private var kontostand: Double = 0.0
    private var userPIN: String = "1234"

    // getter
    fun getKontostand(): Double{
        println("Geben sie ihre PIN ein:")
        var input = readln()

        if (input == userPIN)
            return kontostand
        else
            return 0.0
    }

    // setter
    fun setKontostand(neuerKontostand: Double){
        if (neuerKontostand > 0 )
            kontostand = neuerKontostand
    }


    fun kontoStandAusgeben(): Double{
        return kontostand
    }

    fun geldAbheben(betrag: Double, pin: String){
        // Wenn PIN richtig, und ausreichender Kontostand, kann Geld abgehoben werden
        if (pin == this.userPIN && betrag <= this.kontostand){
            this.kontostand -= betrag
        }
        // Fehlermeldungen
        else {
            if (pin != this.userPIN){
                println("Operation fehlgeschlagen: Falsche PIN eingegeben.")
            }
            if (betrag > this.kontostand){
                println("Operation fehlgeschlagen: Nicht-ausreichender Kontostand.")
            }
        }

    }
}