package W6.D2

fun main(){

    var auto = Auto(100, 5, "BMW", "Blau")
    var suv = Auto(150, 6, "BMW", "Blau", "SUV")

    var konto1 = Konto("Gordon", 100.0)
    var konto2 = Konto("Gordina")


    var karte1 = Karte()
    println("${karte1.farbe} ${karte1.wert}")

    var herzAss = Karte("Herz", "A")
    println("${herzAss.farbe} ${herzAss.wert}")



}

class Wuerfel(var seiten: Int){

    fun wuerfeln(): Int
    {
        return (1..seiten).random()
    }
}

class Auto(var PS: Int,
           val maxGaengen: Int,
           var marke: String,
           var farbe: String) {
    var aktuellerGang: Int = 1
    var aktuelleGeschwindigkeit: Int = 0
    var fahrzeugTyp: String = "Auto"

    constructor(PS: Int, maxGaengen: Int, marke: String, farbe: String, fahrzeugTyp: String): this(PS, maxGaengen, marke, farbe){
        this.fahrzeugTyp = fahrzeugTyp
    }

    fun beschleunigen(){
        when(aktuellerGang){
            1 -> aktuelleGeschwindigkeit += 10
            2 -> aktuelleGeschwindigkeit += 20
            else -> aktuelleGeschwindigkeit += 15
        }
    }

    fun bremsen(){
        this.aktuelleGeschwindigkeit -= 10
    }

    fun hochSchalten(){
        if (aktuellerGang != maxGaengen)
            aktuellerGang += 1
    }

    fun runterSchalten(){
        if (aktuellerGang != 1){
            aktuellerGang --
        }

    }

}

class Produkt(var name: String, var preis: Double){

    var tags = mutableListOf<String>()

    constructor(name: String, preis: Double, tags: List<String>): this(name, preis){
        this.tags.addAll(tags)
    }
}

class Einkaufswagen(){
    var produktListe = mutableListOf<Produkt>()

    fun produktAdden(produkt: Produkt){
        produktListe.add(produkt)
    }

    fun gesamtPreis(): Double{
        var gesamtPreis: Double = 0.0
        for (produkt in produktListe)
            gesamtPreis += produkt.preis

        if (gesamtPreis > 50){
            gesamtPreis = gesamtPreis * 0.8

        }
        return gesamtPreis
    }

}

class Person(var alter: Int = 0, var haarfarbe: String = "blond"){

    fun haareFaerben(haarfarbe: String){
        this.haarfarbe = haarfarbe
    }
    fun geburtstag(){
        this.alter ++
    }

    fun laufen(){}
}

class Saft(){

    var name: String = ""
    var zutaten: List<String> = listOf("Banane", "Erdbeere")
    var preis: Double = 5.99

    fun zubereiten(){}

}

class Konto(val kontoInhaber: String, var kontoStand: Double = 0.0){

    fun geldEinzahlen(betrag: Double){
        this.kontoStand += betrag
    }
}

class Bank(){
    val register = mutableMapOf<String, Konto>(
        "0001" to Konto("Gordon"),
        "0002" to Konto("Anna"),
        "0003" to Konto("Fabian")
    )

    fun geldEinzahlen(kontoInhaber: String, betrag: Double){
        for (konto in this.register.values){
            if (konto.kontoInhaber == kontoInhaber){
                konto.geldEinzahlen(betrag)
                break
            }
        }
    }

}

class Karte{
    var farbe: String
    var wert: String

    // Bestimmte Karte
    constructor(farbe: String, wert: String){
        this.farbe = farbe
        this.wert = wert
    }

    // Zufällige Karte
    constructor(){
        var farbListe = listOf("Karo", "Herz", "Pik", "Kreuz")
        var wertListe = listOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "B", "D", "K", "A")
        this.farbe = farbListe.random()
        this.wert = wertListe.random()
    }


    fun wertInBlackJack(): Int{
        when (this.wert){

            "Bube" -> return 10
            else -> return 0
        }
    }
}

class Deck(){

    var kartenStappel: MutableList<Karte> = mutableListOf()

    fun mischen(){
        this.kartenStappel.shuffle()
    }

    fun eineKarteZiehen(): Karte{
        return this.kartenStappel.removeFirst()
    }

}

class Spieler(){
    var hand = mutableListOf<Karte>()
}





