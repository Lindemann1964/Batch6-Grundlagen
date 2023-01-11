fun main(){

    val namen = listOf("Marvin", "Felix", "Niclas")
    val alter = mutableListOf(29, 32, 26)

    // Ist "Till" in Namen?
    println("Ist Till in der Liste 'namen'?")
    println(namen.contains("Till"))

    var marvUndNiclasEnthalten: Boolean = namen.containsAll(listOf("Marvin", "Niclas"))

    // Zufälliger Namen:
    var zufallsNamen = namen.random()
    println(zufallsNamen)

    // Sortiere die Alter:
    alter.sort()
    println(alter)

    // Sortierte Kopie von Namen
    val sortierteNamen = namen.sorted()

    println(namen)
    println(sortierteNamen)

    // TODO: Debug and Println

}