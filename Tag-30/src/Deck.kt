class Deck(val anzahlDecks: Int = 6) { // normal spielt man Blackjack mit 6 Pokerdecks

    private val kartenStapel: MutableList<Karte> = mutableListOf()

    init{
        deckReset()

        // Kontrolle, ob das richtig funktioniert hat
        val anzahlKarten = kartenStapel.size
        val geforderteKarten = 52 * anzahlDecks
        println("Das Deck hat die Richtige anzahl an Karten? ${anzahlKarten == geforderteKarten}")
    }

    fun deckReset(){
        // Initiallisiert unser Karten Deck
        for (i in 1..anzahlDecks)
            for(color in listOf("Pik", "Herz", "Kreuz", "Karo")){
                for (wert in listOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "B", "D", "K", "A"))
                    kartenStapel.add(Karte(color, wert))
            }

        this.mischen()
    }

    fun mischen(){
        this.kartenStapel.shuffle()
    }

    private fun karteZiehen(): Karte?{
        if (kartenStapel.isEmpty()){
            return null
        }
        else
            return this.kartenStapel.removeFirst()
    }

    fun kartenZiehen(n: Int): List<Karte>{
        var karten = mutableListOf<Karte>()

        for (i in 1..n){
            karten.add(this.karteZiehen()!!)
        }

        return karten
    }

}