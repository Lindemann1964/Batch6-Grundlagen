fun main(){
    //  Simpler 10x loop
    var i: Int = 0

    while (i < 10){
        println(i)
        i++
    }

    //
//    // Waschmaschine Loop
//    var strom = true
//    val dauer = 90
//    while(strom){
//        var minuten = 0
//        while (minuten < dauer){
//            println("Waschen")
//            minuten ++
//        }
//        strom = false
//    }
//    println("die Waschmaschine ist fertig, bieb bieb bieb")

    // Einkaufsliste Loop

    var sortiment = mapOf<String, String>(
        "Banane" to "Obstabteilung, 2. Kiste",
        "Milch" to "Milchprodukte, linker Kühlschrank",
        "Schokolade" to "Süßwaren, 3. Regal, 2. Fach"
    )

    var einkaufsListe = mutableListOf("Banane", "Milch", "Schokolade")

//    // Variante 1:
//    while (einkaufsListe.isNotEmpty()){
//        var produkt = einkaufsListe.first()
//        var regal = sortiment[produkt]
//        println("Als nächstes kaufe ich $produkt. Ich finde es in $regal.")
//        // Abbruch Bedingung
//        einkaufsListe.removeFirst()
//    }

    // Variante 2: mit Laufvariable
    var index: Int = 0
    while (index < einkaufsListe.size){
        var produkt = einkaufsListe[index]
        var regal = sortiment[produkt]
        println("Als nächstes kaufe ich $produkt. Ich finde es in $regal.")
        // Abbruch Bedingung:
        index++
    }

    // Nutzer Eingabe
    var alter: Int? = null

    while (alter == null){
        try {
            println("Bitte geben sie ihr Alter ein:")
            alter = readln().toInt()

            if (alter < 0){
                println("Alter muss positiv sein")
                alter = null
            }

        } catch (ex: Exception){
            println("Fehlerhafte Eingabe! Versuchen sie es nocheinmal")
        }
    }
}