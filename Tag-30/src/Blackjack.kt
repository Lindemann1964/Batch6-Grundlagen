fun main(){

    var game = Blackjack()

    do {
        game.spielRundeStarten()

        // Schleife, für eine Spielrunde
        while (!game.gameOver()) {
            println("--------------------------------------------")
            game.aktuelleSituationAusdrucken()
            game.player.hitOrStand(game.deck)
        }
        // Dealer muss ggf noch Karten ziehen
        game.dealerCards()
        // Gewinn/Verlust ein-/auszahlen
        game.winOrLose()


    } while (true) // Hauptspiel Schleife: Läuft bis der Spieler abbricht, oder kein Geld mehr hat



}

fun wertHand(hand: List<Karte>): Int{
    var wert  = 0

    for (karte in hand){
        wert += karte.wert()
    }
    return wert
}


class Blackjack(var minGebot: Int = 5, var maxGebot: Int = 50, val anzahlDecks: Int = 6) {

    var deck: Deck = Deck(anzahlDecks)

    private var dealer = mutableListOf<Karte>()
    var player: Spieler

    init{
        println("Geben sie den Namen des Spielers ein:")
        val name = readln()
        player = Spieler(name, 100)
    }

    fun spielRundeStarten(){
        println("--------------------------------------------\nNeue Runde:")
        // Deck, dealer und Spieler zurücksetzen
        deck.deckReset()
        dealer.clear()

        player.resetRound()

        // Spieler muss vor dem Austeilen ein Gebot machen
        player.geldBieten(this.minGebot, this.maxGebot)

        // Dealer zieht 2 Karten
        dealer.addAll(deck.kartenZiehen(2))

        // Spieler zieht 2 Karten
        player.kartenNehmen(deck.kartenZiehen(2))

    }

    fun aktuelleSituationAusdrucken(){
        // Dealer zeigt eine seiner Karten
        val offeneKarte = dealer.first()
        println("Der Dealer zeigt seine erste Karte: ${offeneKarte} (Wert: ${offeneKarte.wert()})\n")

        // Spieler zeigt seine aktuelle Hand (und Wert)
        player.aktuelleHand()
    }

    fun dealerCards(){
        // Kontrolliert, ob der Dealer noch Karten ziehen muss, und zieht ggf nach.
        println("Die Hand des Dealers:")
        for (card in dealer)
            println(card)
        while (wertHand(dealer) < 17){
            println("Der Dealer muss ziehen...")
            dealer.addAll(deck.kartenZiehen(1))
            println("... und zieht ${dealer.last()}")
        }
    }

    fun gameOver(): Boolean{
        // Wenn Dealer ein BlackJack hat ist das Spiel vorbei
        if (wertHand(dealer) == 21 && dealer.size == 2)
            return true

        // Wenn der Dealer über 21 hat, ist das Spiel vorbei
        if (wertHand(dealer) > 21)
            return true

        // Wenn der Spieler über 21 hat, oder steht, ist das Spiel vorbei
        if (player.isStanding() || player.isBust())
            return true

        // Ansonsten geht das Spiel weiter
        return false
    }

    fun winOrLose(){
        var spielerWert = player.wertHand()
        var dealerWert = wertHand(dealer)

        println("Wert des Spieler: $spielerWert")
        println("Wert des Dealers: $dealerWert")

        // Wenn Spieler über 21 ist, verliert er seinen Einsatz
        if (player.isBust()){
            println("${player.name} hat verloren :(")
            player.guthabenAktualisieren(false)
        }
        else if(dealerWert > 21){
            // Wenn der Dealer über 21 ist, gewinnt der Spieler
            println("${player.name} hat gewonnen :)")
            player.guthabenAktualisieren(true)
        }
        // Wenn Spieler mehr Punkte als der Dealer hat, gewinnt er seinen Einsatz
        else if (spielerWert > dealerWert){
            println("${player.name} hat gewonnen :)")
            player.guthabenAktualisieren(true)
        }
        // Wenn der Dealer mehr Punkte als der Spieler hat, verliert der Spieler seinen Einsatz
        else if (spielerWert < dealerWert){
            println("${player.name} hat verloren :(")
            player.guthabenAktualisieren(false)
        }
        // Bei Unentschieden behaelt der Spieler seinen Einsatz
    }
}