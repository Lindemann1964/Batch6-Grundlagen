class Pokemon(val name: String){
    override fun toString(): String {
        return this.name
    }
}
val bisasam = Pokemon("Bisasam")
val glumanda = Pokemon("Glumanda")
val glurak = Pokemon("Glurak")
val schiggy = Pokemon("Schiggy")
val pikachu = Pokemon("Pikachu")


// -----------------------------
fun main(){

    // TODO: Erstellen von Maps
    // NotenListe: Name zu Note
    var notenListe: Map<String, Int> = mapOf("Ariel" to 1, "Nemo" to 2, "Shrek" to 1, "Moana" to 3)

    // Pokedex: Nummer zu Pokemon
    var pokedex = mapOf<Int, Pokemon>(
        1 to bisasam,
        4 to glumanda,
        7 to schiggy,
        25 to pikachu,
    )

    // Addressbuch
    var addressBuch: MutableMap<String, MutableList<String>> = mutableMapOf(
        "Adriene" to mutableListOf("Teststrasse 1", "adri@cool.de"),
        "Fabi" to mutableListOf("Megaweg 333", "fabian@my-mail.de"),
        "Fabi" to mutableListOf("01237380132")
    )

    // TODO: Beispiel mit Obstladen
    var articles: MutableList<String> = mutableListOf("Banane", "Himbeere", "Traube", "Apfel", "Brombeere")
    var prices: MutableList<Double> = mutableListOf(0.44, 0.15, 0.05, 0.50, 0.2)
    // TODO: Preisliste
    var preisListe: MutableMap<String, Double> = mutableMapOf(
        "Banane" to 0.44,
        "Himbeere" to 0.15,
        articles[2] to prices[2],
        articles[3] to prices[3],
        articles[4] to prices[4]
    )

    println(preisListe)


    // -----------------------------
    // TODO: Werte abfragen

    // Ein Pokemon abfragen und ausdrucken
    var pokemon7: Pokemon? = pokedex[7]
    //var pokemon7 = pokedex.get(7) // ANALOG
    println("Pokemon 7: $pokemon7")

    // Eine Note abfragen und ausdrucken
    println("Nemo's Note: ${notenListe["Nemo"]}")

    // TODO: vorsicht mit null
    var arielsNote: Int? = notenListe["arriel"]
    println("Ariel's Note: $arielsNote")


// -----------------------------

    // TODO: Werte setzen

    addressBuch["Gabi"] = mutableListOf("0800 123456", "gabi@friends.de")
    addressBuch.put("Micha", mutableListOf("micha@net12.de"))

    // TODO: Vorsicht: DATENTYPEN BEACHTEN!
    addressBuch["Albert"] = mutableListOf("Albert@123.de")
//    addressBuch["Albert"] = 123

    // TODO: Vorsicht: Alter Wert wird überschrieben
    //addressBuch["Gabi"] = mutableListOf("Mcdonaldstrasse 123")
    addressBuch["Gabi"]!!.add("Mcdonaldstrasse 123")
    addressBuch["Gabi"]!![1]
    println(addressBuch)
}