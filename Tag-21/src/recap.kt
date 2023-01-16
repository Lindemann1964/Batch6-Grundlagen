fun main(){
    val weekday: String = listOf("Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag").random()
    val isSunny: Boolean = false
    val isRaining: Boolean = true
    val temperature: Int = 12

    // TODO: If Else
    if (isRaining) {
        println("Es Regnet, nimm ein Regenschirm mit")
    } else if (isSunny) {
        println("Sonnencreme nicht vergessen")
    } else {
        println("Einen Schal mitbringen")
    }

    // TODO: When
    when (weekday){
        "Montag" -> {
            println("Heute ist Montag, wichtiges Meeting mit dem Chef um 14:00")
        }
        "Dienstag" -> {
            println("ArztTermin")
        }
        "Samstag" -> { println("Familien-Einkaufstag")
        }
        else -> {
            println("Heute hab ich nichts zu tun")
        }
    }

    // Ähnlich wie When
    if (weekday == "Montag"){
        println("Heute ist Montag, wichtiges Meeting mti dem Chef um 1400")
    }
    else if (weekday == "Dienstag")
        println("ArztTermin")


    // Unabhängige Bedingungen
    val hatHusten = true
    val hatFieber = false
    val hatMagenkraempfe = true

    if (hatHusten)
        println("Hustensaft")

    if (hatFieber)
        println("Aspirin")

    if (hatMagenkraempfe)
        println("Aktivia")

    // IN Operator
    if (temperature in 10..20){
        println("Mittelwarme Jacke anziehen")
    }

    when (temperature){
        in 0..10 -> println("warme Jacke anziehen")
        in 11..20 -> println("Mittelwarme Jacke anziehen")
        else -> println("heute brauche ich keine Jacke")
    }

    val einkaufListe = listOf("Banane", "Milch", "Eier", "Duschgel")

    if ("Duschgel" in einkaufListe){   //einkaufs.contains("Duschgel")
        println("Gehe auch zu Rossmann")
    }
    else
        println("Finde ich alles bei ALDI")

    // TODO: Bedingungen: Boolean
    //       Vergleichsoperatoren
    //       Verknüpfungsoperatoren
    // BEISPIELE:
    // Temperatur Vergleich

    if (temperature > 20){
        println("Shorts anziehen")
    }
    else if (temperature >= 10){
        println("Mittelwarme Jacke anziehen")
    }

    // Wochentag Vergleich
    if (weekday == "Montag")
        println("Ich hasse Montage")
    else
        println("Heute esse ich glücklich Lasagne")


    // Nicht / Not

    if (!isSunny)
        println("Brauche ich keine Sonnencreme")

    if (!(temperature > 20)){ // if (temperatur <= 20)
        println("Es ist kalt, ich kann keine Short anziehen")
    }

    // Und / And

    if (isSunny && isRaining){
        println("Heute kann man einen Regenbogen sehen")
    }

    if (isRaining && (temperature < 4))
        println("Es schneit")

    // Oder / Or

    if (isRaining || (temperature < 15)){
        println("Jacke mitnehmen")
    }


    // Try Catch
    try {
        var input: Int = readln().toInt()

    } catch (ex: Exception){
        println("Du hast einen falschen Input gemacht")
        var input = 0
    }
}