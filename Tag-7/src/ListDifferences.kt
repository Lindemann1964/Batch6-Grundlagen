fun main(){
    //// Vergleich mit Variablen/Konstanten
    val zahl1 = 1
    var zahl2 = 2

    //zahl1 += 1
    zahl2 += 1

    //zahl1 = 123
    zahl2 = 1223


    // Unterschiede zwischen Listen und MutableListen
    var list = mutableListOf(1,2,3)
    var list2 = mutableListOf(4,5)
    list = list2

    list[1] = 4
    list.add(9)
    list.remove(2)

    println(list)
    println(list2)

    val mutableList = mutableListOf(1,2,3)   // Demonstriert, dass auch eine Konstante als MutableList veränderbar ist
    mutableList[2] = 4
    mutableList.add(9)
    mutableList.remove(2)
    println(mutableList)

    // Variablen und Konstanten für Listen zeigen auf einen Speicherort
    var mutableList2 = mutableListOf(0,7)
    mutableList2 = mutableList
    mutableList.add(45)
    println(mutableList2)
}