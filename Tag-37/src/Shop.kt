import java.io.File

class Shop() {


    var bestand = mutableMapOf<Produkt, Int>()

    init {

    }

    constructor(filepath: String): this(){
        bestandLaden(filepath)
    }


    fun bestandSpeichern(filepath: String){
        var saveDatei = File(filepath)
        saveDatei.appendText("Name\tPreis\tAnzahl\n")


        for (entry in bestand){
            var name = entry.key.name
            var preis  = entry.key.preis
            var anzahl = entry.value

            var text = "$name\t$preis\t$anzahl\n"
            saveDatei.appendText(text)
        }
    }

    fun bestandLaden(filepath: String){

        this.bestand = mutableMapOf<Produkt, Int>()

        var saveDatei = File(filepath)

        var zeilen = saveDatei.readLines()

        var i = 0
        for (zeile in zeilen) {
            if (i == 0) {
               i++
               continue
            }
            else {
                val infos = zeile.split('\t')
                var name: String = infos[0]
                var preis: Double = infos[1].toDouble()
                var anzahl = infos[2].toInt()
                this.bestand[Produkt(name, preis)] = anzahl
            }

        }

    }
}

fun main(){
    var meinShop = Shop("Tag-37/Bestand.tsv")
}