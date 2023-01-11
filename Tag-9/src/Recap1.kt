fun main(){
    val bestellung = mutableListOf(
        "Margarita",
        "Tonno",
        "Hawaii",
        "Tonno"
    )

    // Pizza hinzufügen
    bestellung.add("Salame")

    // Getränke am Anfang hinzufügen
    val drinks = listOf("Cola", "Fanta", "Sprite")
    bestellung.addAll(0, drinks)

    // Alle "Tonno" löschen
    bestellung.removeAll(listOf("Tonno"))

    // TODO:  Finde die "Sprite", und ändere zu "Cola"
    bestellung[bestellung.indexOf("Sprite")] = "Cola"

    // TODO: Füge "Tiramisu" an 4. Stelle der Bestellungen hinzu
    bestellung.add(3, "Tiramisu")

    // index 0 = 1. Stelle
    // index 1 = 2. Stelle
    // index 3 = 4. Stelle

    println(bestellung)

}