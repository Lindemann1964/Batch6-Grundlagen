fun main(){

    //var person1 = Person() // Konstruktor Aufruf
    //var person2 = Person()

    var person1 = Person(alter = 42)
    var person2 = Person(alter = 2, haarfarbe = "Rot")
    var person3 = Person(33, "braun")

    person1.haarfarbe = "blau"
    person1.haareFaerben("braun")
    println("${person1.haarfarbe}")
    // Das geht nicht:
    // Person.haarfarbe = "braun"

    println("Die Haarfarbe von Person 1: ${person1.haarfarbe}")
    println("Die Haarfarbe von Person 2: ${person2.haarfarbe}")

    // 100 Person erstellen
    for (i in 1..10){
        Person()
    }

    // Bank Object debuggen
    var bank = Bank()
    bank.geldEinzahlen("Anna", 50.0)

    for (konto in bank.register.values)
        println("${konto.kontoInhaber} : ${konto.kontoStand} €")

}

class Produkt(){
    var name: String = ""
    var farbe: String = "42.689"
    var preis: Double = 1.99
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


class Konto(val kontoInhaber: String){
    var kontoStand: Double = 0.0

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

class Karte(){

    var farbe: String = "Herz"
    var wert: String = "Bube"

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

class Wuerfel(){

    var seiten = 6

    fun wuerfeln(): Int
    {
        return (0..seiten).random()
    }
}


class Auto(){
    var marke: String = "BMW"
    val maxGaengen: Int = 6
    var aktuellerGang: Int = 1

    var aktuelleGeschwindigkeit: Int = 0

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



