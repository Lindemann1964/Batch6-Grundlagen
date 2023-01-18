fun main(){
    // Ranges Beispiele
    for (i in 1.. 5)
        println(i)

    for (i in 5.. 1)
        println(i)

    for (i in 1 downTo 5)
        println(i)

    for (i in 1.. 5 step 2)
        println(i)

    for (i in 5 downTo 1 step 2)
        println(i)

    // Praxis Aufgaben
    var favorites: MutableList<String> = mutableListOf(
        "Pad Thai",
        "Burrito",
        "Carbonara",
        "Paella",
        "Chivito"
    )
    // 1: Liste ausdrucken
    println("\nAufgabe 1: ")

    // Option 1:
    for (essen in favorites)
        println(essen)
    // Option 2:
    for (i in favorites.indices)
        println(favorites[i])
    // Option 3:
    for (i in 0 until favorites.size)
        println(favorites[i])


    // 2: Liste rückwärts ausdrucken
    println("\nAufgabe 2: ")
    // Option von Eugen:
    for (i in favorites.size -1  downTo 0){
        println(favorites[i])
    }

    // Option 1:
    for (essen in favorites.reversed())
        println(essen)
    // Option 2:
    for (i in favorites.indices.reversed())
        println(favorites[i])

    // 3: Nach Text filtern
    println("\nAufgabe 3: ")

    var suchText = "a"
    for (essen in favorites){
        if (essen.contains(suchText)) {
            println(essen)
        }
    }

    // 4: Liste aufteilen
    println("\nAufgabe 4: ")

    var gefilterteFavorites = mutableListOf<String>()
    var rest = mutableListOf<String>()
    for (essen in favorites){
        if (essen.contains(suchText)) {
            gefilterteFavorites.add(essen)
        }
        else{
            rest.add(essen)
        }
    }
    println(gefilterteFavorites)
    println(rest)


    println(gefilterteFavorites + rest)
}