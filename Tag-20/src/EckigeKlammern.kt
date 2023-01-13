fun main(){
    /* TODO:
        Listen Indizierung
           - Indices fangen immer bei 0 an!
           - Aufpassen mit IndexOutOfBoundsException
     */
    val einkaufswagen =  mutableListOf("Spagetti", "Hähnchenbrust", "Zitrone", "Creme Fraiche")
    // Mit Index abfragen
    einkaufswagen[0]      // Spagetti

    // Mit Index verändern
    einkaufswagen[3] = "Sahne"

    // Vorsicht mit IndexOutOfBoundsException!
    //einkaufswagen[-1]
    //einkaufswagen[5]

    /* TODO:
          Map Indizierung
            - Indizierung via Key (=Schlüssel) -> Datentypen beachten
            - Aufpassen mit null
     */
    val artikelListe = mutableMapOf(
        "Creme Fraiche" to 1.99,
        "Hähnchenbrust" to 3.45,
        "Sahne" to 0.67,
        "Spagetti" to 0.99,
        "Zitrone" to 0.34
    )

    // Werte abfragen: Vorsicht mit Null
    val sahnePreis: Double? = artikelListe["Sahne"]      // 0.67
    val spagettiPreis: Double? = artikelListe["spageti"] // null
    var zitronePreis: Double = artikelListe["Zitrone"]!!

    // Vorsicht: NullPointerException
    // zitronePreis = artikelListe["zitrone"]!! // NullPointerException

    // Werte hinzufügen
    artikelListe["Parmesan"] = 4.20
    artikelListe["Sahne"] = 0.8             // Existierende Schlüssel werden überschrieben



    /* TODO:
            String Indizierung
     */
    val vorname = "Max"
    val nachname = "Musterfrau"

    // Werte abfragen
    vorname[0]  // M
    vorname[1]  // a
    //vorname[5]  // String Index Out Of Bounds Exception

    // Vorsicht: Strings sind nicht mutable (=veränderbar)
    //nachname[1] = 'a'

    // Lösung: kotlin.text.StringBuilder
    val nachName = StringBuilder("Musterfrau")
    nachName[1] = 'a'
    println(nachName) // Masterfrau
    // man kann von und zu StringBuilder konvertieren
    StringBuilder(vorname)
    nachName.toString()

}