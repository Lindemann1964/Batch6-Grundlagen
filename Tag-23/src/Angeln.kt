fun main(){
    // TODO: Fische Fangen
    var fische = listOf("Aal", "Hering", "Makrele", "Hecht", "Barsch", "Dose")
    var box = mutableListOf<String>()

    var letzterFang: String

    do {
        letzterFang = fische.random()
        box.add(letzterFang)

    } while (letzterFang != "Dose")


    println(box)



}