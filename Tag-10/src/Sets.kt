package W2.D5

fun main(){

    val tierListe = mutableListOf("Tiger", "Rabe", "Hund")
    val tierSet = mutableSetOf("Tiger", "Rabe", "Hund")

    // Unterschied zwischen Listen und Sets
    tierListe.add("Tiger")
    tierSet.add("Tiger")

    // Zugriff auf Elemente
    tierListe[0]
    tierSet.elementAt(0)

    // Umwandlung zu Set
    val tierSetVonListe = tierListe.toSet()
    println(tierSetVonListe)


}