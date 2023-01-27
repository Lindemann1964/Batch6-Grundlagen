class Deck {

    private val kartenStappel: MutableList<Karte> = mutableListOf()

    init{
        for(color in listOf("Pik", "Herz", "Kreuz", "Karo")){
            for (wert in listOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "B", "D", "K", "A"))
                kartenStappel.add(Karte(color, wert))
        }

        this.mischen()

    }


    fun mischen(){
        this.kartenStappel.shuffle()
    }

    private fun karteZiehen(): Karte?{
        if (kartenStappel.isEmpty()){
            return null
        }
        else
            return this.kartenStappel.removeFirst()
    }

    fun kartenZiehen(n: Int): List<Karte>{
        var karten = mutableListOf<Karte>()

        for (i in 1..n){
            karten.add(this.karteZiehen()!!)
        }

        return karten
    }

}