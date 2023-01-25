
fun main(){

    Flasche(750)


}

class Wuerfel(var seiten: Int){

    fun wuerfeln(): Int{
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

class Konto(val kontoInhaber: String, var kontoStand: Double = 0.0){

    fun geldEinzahlen(betrag: Double){
        this.kontoStand += betrag
    }
}

class Person(val name: String, var alter: Int = 0, var haarfarbe: String){

    fun haareFaerben(haarfarbe: String){
        this.haarfarbe = haarfarbe
    }
    fun geburtstag(){
        this.alter ++
    }

}

open class Flasche{
    var inhalt: Int

    init {
        println("Eine Flasche gerade erstellt")
    }

    constructor(inhalt: Int) {
        this.inhalt = inhalt
    }

}

class BierFlasche(inhalt: Int): Flasche(inhalt) {

}

