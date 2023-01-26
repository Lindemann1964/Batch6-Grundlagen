package Bank

class Bank{

    var register: MutableList<Konto> = mutableListOf(
        Konto("Gordon"),
        Konto("Niclas")
    )

    fun geldAbheben(name: String, betrag: Double){
        println("Hallo, $name. Bitte geben Sie ihre PIN ein:")
        var pin = readln()

        for (konto in register){
            if (konto.kontoinhaber == name){
                konto.geldAbheben(betrag, pin)
                break
            }
        }
    }
}
