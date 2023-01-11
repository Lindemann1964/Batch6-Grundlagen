fun main(){

    var alleKundenNamen = listOf<String>("Martin", "Gordon", "Evropi")
    var alleKundenAlter = listOf<Int>(42, 51, 33)

//    Lege eine Liste an für deine 3 Lieblingsessen / Lieblingstiere
    var lieblingsEssen = mutableListOf("Schnitzel", "Ramen", "Sushi")

//    Benutze 2 mal die Funktion .add() um ein neues Element hinzuzufügen.
    lieblingsEssen.add("Pad Thai")
    lieblingsEssen.add("Tacos")

//    Benutze nun .first(), println() und .remove() um das Element an der ersten Stelle auszugeben.
//    Danach entferne dieses Element aus der Liste
    println(lieblingsEssen.first())
    lieblingsEssen.remove(lieblingsEssen.first())
    //lieblingsEssen.removeAt(0)
    // lieblingsEssen.indexOf(lieblingsEssen.first()))

//    Drucke den Rest der Liste auf der Konsole aus
    println(lieblingsEssen)

}