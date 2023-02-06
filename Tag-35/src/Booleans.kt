import kotlin.math.round

open class Produkt(val name: String, var preis: Double){
    var sonderAktion: Boolean = false

    override fun equals(other: Any?): Boolean {

        if (other is Produkt){
            return this.name == other.name && this.preis == other.preis
        }
        return super.equals(other)
    }


}

class Getraenk(name: String, preis: Double): Produkt(name, preis){

    val alkoholisch: Boolean
    val alkohol_gehalt: Double

    init {
        val nameLower = name.lowercase()
        alkoholisch = name in listOf("Bier", "Wein", "Weizen", "Honig-Met") ||
                nameLower.contains("bier") || nameLower.contains("schnaps") ||
                nameLower.contains("likör") || nameLower.contains("brand") ||
                nameLower.contains("wein")

        alkohol_gehalt = alkoholGehalt()
    }

    fun alkoholGehalt(): Double{
        if (alkoholisch) {
            return if (this.name.lowercase().contains("bier"))
                5.0
            else if (this.name.lowercase().contains("schnaps"))
                40.0
            else if (this.name.lowercase().contains("likör"))
                18.0
            else if (this.name.lowercase().contains("brand"))
                35.0
            else {
                println("Wie viel Alkohol hat $name?")
                readln().toDouble()
            }
        }
        else
            return 0.0
    }
}


fun main(){


    val a = Produkt("Test", 1.0)
    val b = Produkt("Test", 1.0)

    println(a == b)

    println(a === b)

    print(1 == 1)

//
//    val sortiment = mutableMapOf<Produkt, Int>(
//        Produkt("Nutella", 3.99) to 5,
//        Produkt("Marmelade", 1.32) to 9,
//        Produkt("Butter", 0.87) to 12,
//        Produkt("Margarine", 0.55) to 8,
//        Produkt("Müsli", 2.99) to 4,
//        Produkt("Cornflakes", 0.99) to 5,
//        Getraenk("Bier: Augustiner Hell", 1.45) to 32,
//        Getraenk("Bier: Jever", 1.20) to 32,
//        Getraenk("Erdinger Weisbier", 1.45) to 32,
//        Getraenk("Rotwein", 6.99) to 3,
//        Getraenk("Weiswein", 4.49) to 4,
//        Getraenk("Coca Cola 1l", 1.99) to 5,
//        Getraenk("Coca Cola 0.5l", 1.00) to 13,
//        Getraenk("Kirschlikör", 8.99) to 2,
//        Getraenk("Obstbrand", 9.99) to 3
//    )
//
//    val einkaufsWagen = mutableMapOf<Produkt, Int>()
//
//
//    do {
//        val produkt = produktWahl(sortiment)
//
//        if (produkt in einkaufsWagen.keys)
//            einkaufsWagen[produkt] = einkaufsWagen[produkt]!! + 1
//        else
//            einkaufsWagen[produkt] = 1
//
//
//        println("\nMöchten sie weiter einkaufen? (J/N)")
//        val eingabe = readln().lowercase()
//    } while(eingabe != "n")
//
//
//
//    // Kauft der Nutzer Nutella? (Nutella 2 zum Preis von 1)
//    for (einkauf in einkaufsWagen){
//        val produkt = einkauf.key
//        var anzahl = einkauf.value
//
//        if (produkt.name == "Nutella"){
//            if (anzahl >= 2){
//                einkaufsWagen[Produkt("2f1 Nutella", -produkt.preis)] = anzahl/2
//            }
//            /*
//                1 / 2 = 0
//                2 / 2 = 1
//                3 / 2 = 1
//                4 / 2 = 2
//             */
//        }
//    }
//
//
//
//
//    var kauftAlkohol: Boolean = false
//    for (produkt in einkaufsWagen.keys){
//        if (produkt is Getraenk){ // produkt == Getraenk
//            if (produkt.alkoholisch){
//                kauftAlkohol = true
//                break
//            }
//        }
//    }
//
//
//    /*
//        var i = 50
//        i is Int
//        i is Double
//        i is Produkt
//
//        i == 50
//     */
//
//    if (kauftAlkohol){
//        println("Sie versuchen Alkohol zu kaufen. Wie alt sind sie?")
//        var alter = readln().toInt()
//
//        if (alter >= 18){
//            println("Sie dürfen den Alkohol kaufen")
//        }
//        else
//            println("Sie dürfen den Alkohol nicht kaufen")
//    }
//
//    println("Der Gesamtpreis ihres Einkaufs beträgt: ${gesamtPreis(einkaufsWagen)}")

}


fun gesamtPreis(einkaufsWagen: Map<Produkt, Int>): Double{
    var total: Double = 0.0

    for (produkt in einkaufsWagen){
        total += (produkt.key.preis * produkt.value)
    }

    return total
}


fun produktWahl(sortiment: MutableMap<Produkt, Int>): Produkt{
    var auswahl: Produkt? = null
    val produkte = sortiment.keys.toList()

    while (auswahl == null){
        println("Wählen sie ein Produkt: ")
        for (i in produkte.indices){
            println("$i für ${produkte[i].name} ${produkte[i].preis}")
        }

        try {
            val eingabe = readln().toInt()

            if (eingabe in produkte.indices){
                auswahl = produkte[eingabe]
            }
            else
                print("Ungültiger Index, versuchen sie es noch einmal\n")

        } catch (ex: Exception){
            println("Ungültige Eingabe, bitte geben sie eine Zahl ein\n")
        }
    }
    println("Sie haben ${auswahl.name} gewählt \n")
    return auswahl
}