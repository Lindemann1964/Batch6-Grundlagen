fun main(){
    // BREAK
    var i: Int = 1
    while(true){
        println("$i mal $i ist = ${i * i}")
        i++
        if (i > 3){
            break
        }
    }


    // CONTINUE
    for (i in (0..10)){
        if (i % 2 != 0){
            continue
        }
        println(i)
    }

    // Beispiele
    // Alkoholische Getränke
    var drinks = mutableMapOf<String, Boolean>(
        "Wein" to true,
        "Bier" to true,
        "Saft" to false,
        "Milch" to false,
        "Schnaps" to true,
        "Wasser" to false
    )
    // Drucke nur alkoholische Getränke aus
    for (entry in drinks.entries) {
        var isAlcoholic = entry.value
        if (!isAlcoholic) {
            continue
        }
        println("${entry.key} hat alcohol")
    }




    var userLoggedIn = true

    while(userLoggedIn){
        // do something

        println("Möchten sie sich ausloggen (J/N")

        if (readln() == "J"){
            break
        }


    }
    userLoggedIn = false





}