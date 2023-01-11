fun main() {
    var towers: MutableList<String> = mutableListOf(
        "Burj Khalifa",
        "Shanghai Tower",
        "Makkah Royal Clock Tower Hotel",
        "Ping an Finance Center",
        "Lotte World Tower"
    )


    val heights: List<Int> = listOf(
        828,
        632,
        1601,
        599,
        555)

    val places: List<String> = listOf(
        "Dubai",
        "Shanghai",
        "Mekka",
        "Shenzhen",
        "Seoul"
    )

    // TODO: print list of highest towers
    println("Die Top ${towers.size} der höchsten Türme der Welt:")
    println("Platz 1: Der ${towers[0]} ist ${heights[0]} Meter hoch und steht in ${places[0]}.")
    println("Platz 2: Der ${towers[1]} ist ${heights[1]} Meter hoch und steht in ${places[1]}.")
    println("Platz 3: Der ${towers[2]} ist ${heights[2]} Meter hoch und steht in ${places[2]}.")
    println("Platz 4: Der ${towers[3]} ist ${heights[3]} Meter hoch und steht in ${places[3]}.")
    println("Platz 5: Der ${towers[4]} ist ${heights[4]} Meter hoch und steht in ${places[4]}.")



    var index: Int = heights.indexOf(heights.max())
    println("Der höchste Turm ${towers[index]} ist ${heights[index]} Meter hoch und steht in ${places[index]}.")

    index = heights.indexOf(heights.min())
    println("Der niedrigste Turm ${towers[index]} ist ${heights[index]} Meter hoch und steht in ${places[index]}.")



}