fun main(){

    // Minus Rechnen mit Integer Zahlen
//    var geburtsJahr: Int = 2001
//    var alter: Int = 2022 - geburtsJahr
//
//    alter ++ // alter = alter + 1
//
//    println("Mein Alter ist: $alter")

    // Minus und Mal Rechnen mit Double Zahlen
//    var kontoStand: Double = 1238.53
//    var clubMatePreis: Double = 1.50
//    var colaPreis: Double = 0.99
//
//    // Kaufe 2 Cola und 1 Club Mate
//    kontoStand -= ((2* colaPreis) + clubMatePreis)
//
//    // Kaufe eine 2. Clubmate
//    kontoStand -= clubMatePreis  // kontoStand = kontoStand - clubMatePreis
//
//    println("Mein Kontostand nach dem Einkauf beträgt: $kontoStand")

    // Geteilt und Modulo Rechnen
//    var anzahlPizzen: Int = 4
//    var anzahlPizzaStuecke: Int = 4 * 8
//    var anzahlPersonen: Int = 5
//
//    var anzahlStueckeProPerson: Int = anzahlPizzaStuecke / anzahlPersonen
//    var anzahlVerbleibendeStuecke: Int = anzahlPizzaStuecke % anzahlPersonen
//
//    // Addieren von Strings
//    var ausgabe: String = "Ich teile $anzahlPizzen Pizzen auf $anzahlPersonen Personen auf:\n"  // '\n' macht eine neue Zeile
//    ausgabe = ausgabe + "Jeder erhält $anzahlStueckeProPerson Stücke.\n"
//    ausgabe += "Es bleiben noch $anzahlVerbleibendeStuecke Stücke übrig."
//
//    println(ausgabe)


    // NULL Safety
    val zahl1: Int? = null
    val zahl2: Int = 3

    val result1: Int? = zahl1?.plus(zahl2)
    println(result1)


    val zahl3: Int? = 7
    val zahl4: Int = 3

    val result2: Int? = zahl3!! + zahl4
    println(result2)

}