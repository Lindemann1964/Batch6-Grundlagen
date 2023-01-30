class Spieler(val name: String, startGuthaben: Int = 50) {

    private val hand: MutableList<Karte> = mutableListOf()
    private var wertHand: Int = 0
    private var guthaben: Int = startGuthaben

    private var stand: Boolean = false
    private var bust: Boolean = false
    private var gebot: Int = 0

    fun isStanding(): Boolean{
        return this.stand
    }

    fun isBust(): Boolean{
        return wertHand(this.hand) > 21
    }

    fun guthabenAktualisieren(win: Boolean){
        if (win)
            this.guthaben += this.gebot // Unterschied + und +=
        else
            this.guthaben -= this.gebot

        println("$name's Guthaben ist nun: $guthaben")
    }

    fun geldBieten(min: Int, max: Int){
        var eingabe: Int? = null
        while(eingabe == null){
            println("\nWieviel Geld möchte ${this.name} bieten? (Aktueller Kontostand: $guthaben)")

            try {
                eingabe = readln().toInt()

                if (eingabe < min){
                    eingabe = null
                    println("Der gebotene Betrag muss mindestens $min sein!")
                    continue
                }

                if (eingabe > guthaben){
                    println("Nicht genug Guthaben, um $eingabe zu bieten!\n Aktuelles Guthaben: $guthaben")
                    eingabe = null
                    continue
                }

                if (eingabe > max){
                    println("Der gebotene Betrag darf maximal $max sein!")
                    eingabe = null
                    continue
                }

            } catch (ex: Exception){
                println("Der gebotene Betrag muss eine gültige, ganze Zahl sein!")
                continue
            }
        }
        this.gebot = eingabe
    }

    fun resetRound(){
        stand = false
        bust = false
        gebot = 0
        wertHand = 0
        hand.clear()
    }

    fun kartenNehmen(karten: List<Karte>){
        this.hand.addAll(karten)
        this.wertHand() // Wert der Hand neuberechnen
    }

    fun wertHand(): Int{
        this.wertHand = wertHand(this.hand)

        if (this.wertHand > 21)
            this.assInHand() // Mache ein Ass zu einer 1

        return this.wertHand
    }

    fun aktuelleHand(){
        println("Der Spieler hat auf der Hand:")
        for (karte in this.hand){
            println(karte)
        }
        println("Der Wert der Hand ist ${this.wertHand()}")
    }

    fun assInHand(){
        for (karte in this.hand){
            if (karte.zahl == "A"){
                karte.assZuEins()
                this.wertHand()
                break
            }
        }
    }

    fun hitOrStand(deck: Deck){
        var eingabe: Int? = null
        if (this.wertHand < 21) {
            while (eingabe == null) {
                println("\n ${this.name} wählt aus: ")
                println("(1) für Hit = eine Karte ziehen")
                println("(2) für Stand = keine Karte ziehen")
                //this.aktuelleHand()
                try {
                    eingabe = readln().toInt()
                    when (eingabe) {
                        1 -> {
                            // Hit = eine Karte ziehen
                            this.kartenNehmen(deck.kartenZiehen(1))
                            println("Die gezogene Karte war: ${this.hand.last()}\n")
                        }

                        2 -> {
                            // Stand = keine Karten ziehen
                            this.stand = true
                        }

                        else -> {
                            println("Bitte geben sie 1 oder 2 ein!")
                            eingabe = null
                        }
                    }
                } catch (ex: Exception) {
                    println("Bitte geben sie 1 oder 2 ein!")
                }
            }
        }
        else
            this.stand = true // Bei 21 bleibt man natürlich stehen
    }
}