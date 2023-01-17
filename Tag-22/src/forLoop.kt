package W5.D2

fun main() {
//
//    // TODO: Show with while loop
//    println("10 Spiele mit while:")
//    var counter: Int = 1
//    while (counter <= 10) {
//        zufälligePizza(counter)
//        counter++
//    }
//
//    // TODO: show with for loop
//    println("10 Spiele mit for:")
//    for (i in 1..10) {
//        zufälligePizza(i)
//    }

    // TODO: show for with Shopping List
    var sortiment = mapOf<String, String>(
        "Banane" to "Obstabteilung, 2. Kiste",
        "Milch" to "Milchprodukte, linker Kühlschrank",
        "Schokolade" to "Süswaren, 3. Regal, 2. Fach"
    )
    var einkaufsListe = mutableListOf<String>("Banane", "Milch", "Schokolade")
    for (produkt in einkaufsListe){
        var regal = sortiment[produkt]
        println("Als nächstes kaufe ich $produkt. Ich finde es in $regal.")
        // Vorsicht vor Fehler:
        // Während For-Schleife darf man die Liste nicht verändern
        // einkaufsListe.remove(produkt)
    }


    /* Einkaufsliste mit while:
    while (einkaufsListe.isNotEmpty()){
        var produkt = einkaufsListe.first()
        var regal = sortiment[produkt]

        println("Als nächstes kaufe ich $produkt. Ich finde es in $regal.")
        // Abbruch Bedingung
        einkaufsListe.removeFirst()
    }*/


    // Beispiel mit 1x1
    for (i in 1..10){
        for (j in 1..10){
            println("$i * $j = ${i*j}")
        }
    }

    // Beispiel mit String
    var suchBuchstabe = 's'
    var counter = 0
    for (i in "Hi, my name is slim shady"){
        if (i == suchBuchstabe){
            counter ++
        }
    }
    println("Wie oft kommt '$suchBuchstabe' im Text vor: $counter")


    // For loop with Map
    var videos = mutableMapOf(
        "Batman" to 19.99,
        "Hangover" to 9.99,
        "Fight Club" to 9.99,
        "Amsterdam" to 29.99
    )
    for (entry in videos.entries){
        println("Der Film ${entry.key} kostet ${entry.value}€")
    }

    // Beispiel: Indices von Listen
    var filmliste = listOf("The Dark Knight Rises", "Das Boot", "Fight Club", "Amsterdam")
    for (idx in filmliste.indices){
        if (idx == 1)
            println("Film $idx: ${filmliste[idx]}")
    }

//    for (idx in videos.keys.indices){
//        if (idx+1 == 2) {
//            val key = videos.keys.toList()[idx]
//            println("Der Film ${key} kostet ${videos[key]} ")
//        }
//    }
}

//
fun zufälligePizza(game: Int) {
    val pizza = listOf("Hawaii", "Tonno", "Salami").random()
    println("Pizza $game:  $pizza.")
}