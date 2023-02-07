fun main(){

    // Beispiele für Characters
    var buchstabe: Char = 'a'
    println('A' == buchstabe)

    buchstabe = '7'
    buchstabe = ','
    buchstabe = '\t'
    buchstabe = "hallo".first()

    // Beispiele für Strings
    // Escaped String
    var escapedString: String = "Hallo, ich bin ein Text.\n" +
            "\"Ich bin die zweite Zeile.\""
    println(escapedString)

    // Man kann Strings vergleichen
    println("A1" > "A2")
    println("A1" < "B1")

    // Raw String
    var rawString: String = """
        Hallo,
        ich bin ein sehr detaillierter Text.
        
        Es funktionieren sogar emojis: "😀"
        
        Bis dann ;)
    """.trimIndent()
    println(rawString)


    // Emojis
    escapedString = "Emojis sind komisch"
    println(escapedString)
    println("Länge ohne Emoji ${escapedString.length}")

    escapedString = "Emojis sind komisch🤔"
    println("Länge mit Emoji ${escapedString.length}")

    println(escapedString[19])
    println(escapedString[20])

}