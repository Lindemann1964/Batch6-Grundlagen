fun main(){
    var game = Blackjack()

    game.spielRundeStarten()
}


class Blackjack {

    var player: Spieler
    var deck: Deck = Deck()

    var dealer = mutableListOf<Karte>()

    init{
        println("Geben sie den Namen des Spielers ein:")
        val name = readln()
        player = Spieler(name)
        player.guthabenAufladen(50)
    }



    fun spielRundeStarten(){

        // Spieler muss ein Gebot machen
        var gebot = player.geldBieten()

        // Dealer zieht 2 Karten, 1 aufgedeckt
        dealer.addAll(deck.kartenZiehen(2))
        println("Der Dealer zeigt eine: ${dealer.first()}")

        // Spieler zieht 2 Karten
        player.kartenNehmen(deck.kartenZiehen(2))
        player.aktuelleHand()

        // Spieler: Option weitere Karten ziehen


        // wer hat gewonnen?

        // Gewinn/verlust auszahlen

    }


}