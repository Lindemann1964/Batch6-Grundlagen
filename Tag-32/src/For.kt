fun main(){

    // For i
    for (i in 1..5){
        println("For i-Schleife")
    }


    for (i in 10 downTo 0 step 5){
        println(i)
    }



    var beispielText = """
        Weine nicht, wenn der Regen fällt, dam-dam, dam-dam
        Es gibt einen, der zu dir hält, dam-dam, dam-dam
        Marmor, Stein und Eisen bricht
        Aber unsere Liebe nicht
        Alles, alles geht vorbei
        Doch wir sind uns treu
        Kann ich einmal nicht bei dir sein, dam-dam, dam-dam
        Denk daran, du bist nicht allein, dam-dam, dam-dam
        Marmor, Stein und Eisen bricht
        Aber unsere Liebe nicht
        Alles, alles geht vorbei
        Doch wir sind uns treu
        Marmor, Stein und Eisen bricht
        Aber unsere Liebe nicht
        Alles, alles, alles geht vorbei
        Doch wir sind uns treu
        Nimm den goldenen Ring von mir dam-dam, dam-dam
        Bist du traurig, dann sagt er dir, dam-dam, dam-dam
        Marmor, Stein und Eisen bricht
        Aber unsere Liebe nicht
        Alles, alles geht vorbei
        Doch wir sind uns treu
        Marmor, Stein und Eisen bricht
        Aber unsere, unsere Liebe nicht
        Alles, alles, alles geht vorbei
        Doch wir sind uns treu
        Everybody now!
        Marmor, Stein und Eisen bricht
        Aber unsere Liebe nicht   
    """.trimIndent().lowercase()
    // For i mit range über Buchstaben (Char)
    for (i in 'a' .. 'z'){
        var count = countLetter(beispielText, i)

        println("Der Buchstabe '$i' kommt $count mal vor")
    }


    // For-In
    var warenKorb = mutableListOf(3.99, 1.99, 4.99, 2.99, 6.99, 10.50, 1.0)
    var summe = 0.0
    for (preis in warenKorb){
        summe += preis
    }
    println("Der Gesamtpreis unseres Warenkorbs ist $summe")

    var max = 0.0
    for (preis in warenKorb){
        if (preis > max)
            max = preis
    }
    println("Unser teuerster Artikel kostet $max")
    warenKorb.indexOf(max)


    // Beispiel: Werte in Liste verändern
    // Mitarbeiter rabatt: 20% auf alles
    for (preis in warenKorb){
        println("Der reduzierte Preist ist ${0.8 * preis}")

        var index = warenKorb.indexOf(preis)
        warenKorb[index] = 0.8 * preis
    }
    println(warenKorb)
    // So gehts auch
    for (index in warenKorb.indices){
        warenKorb[index] = 1.0
    }


    // for-in Schleife mit Maps
    var warenKorb2 = mapOf<String, Double>(
        "Creme" to 3.99,
        "Kaugummi" to 1.99,
        "Karotten" to 4.99
    )

    for (entry in warenKorb2){
        //println(entry)
        println("Der Artikel ${entry.key} hat einen Preis von ${entry.value}")
    }

    for (key in warenKorb2.keys)
        println(key)

    var summe2 = 0.0
    for (preis in warenKorb2.values)
        summe2 += preis

    println("Der Gesamtpreis von Warenkorb 2 ist: $summe2")








}

fun countLetter(text: String, letter: Char): Int{
    var count = 0

    // For-in Schleife
    for (i in text){
        if (i == letter)
            count ++
    }

    return count
}