class Spieler(val name: String) {

    private val hand: MutableList<Karte> = mutableListOf()
    private var guthaben: Int = 0

    fun guthabenAufladen(wert: Int){
        guthaben += wert
    }

    fun geldBieten(): Int{
        var eingabe: Int? = null
        while(eingabe == null){
            println("Wieviel Geld möchten sie bieten?")

            try {
                eingabe = readln().toInt()

                if (eingabe < 0){
                    eingabe = null
                    println("Der gebotene Betrag muss positiv sein")
                    continue
                }

                if (eingabe > guthaben){
                    println("Nicht genug Guthaben um $eingabe zu bieten")
                    eingabe = null
                    continue
                }

            } catch (ex: Exception){
                println("Der gebotene Betrag muss eine Zahl sein")
                continue
            }
        }

        return eingabe
    }

    fun kartenNehmen(karten: List<Karte>){
        this.hand.addAll(karten)
    }

    fun wertHand(): Int{
        var wert  = 0

        for (karte in hand){
            wert += karte.wert()
        }
        return wert

    }

    fun aktuelleHand(){
        println("Der Spieler hat auf der Hand:")
        for (karte in this.hand){
            println(karte)
        }
        var wert = wertHand()
        println("Der Wert der Hand ist $wert")

    }

}