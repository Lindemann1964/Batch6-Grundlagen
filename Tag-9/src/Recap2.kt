fun main(){
    val planets = mutableListOf(
        "Merkur", "Venus", "Erde", "Mars",
        "Jupiter", "Saturn", "Uranus", "Neptun",
        "Pluto"
    )

    val jupiterMonde = listOf("Europa", "Ganymede", "Io")

    // Hat Jupiter Monde?
    println("Jupiter hat Monde? - ${jupiterMonde.isNotEmpty()}")

    // Der wievielte Planet ist die Erde?
    val erdenIndex = planets.indexOf("Erde")
    println("Die Erde ist der ${erdenIndex+1}. Planet in unserem Sonnensystem")

    // Nur Gas Giganten
    val gasGiganten = planets.slice(4..7)
    println(gasGiganten)

    // TODO: Pluto ist kein Planet mehr
    planets.remove("Pluto")

}