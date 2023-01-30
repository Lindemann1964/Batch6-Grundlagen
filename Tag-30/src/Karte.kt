class Karte(val farbe: String,
            var zahl: String) {

    fun wert(): Int{
        return when(this.zahl){
            "1" -> 1
            "2" -> 2
            "3" -> 3
            "4" -> 4
            "5" -> 5
            "6" -> 6
            "7" -> 7
            "8" -> 8
            "9" -> 9
            in listOf("10", "K", "B", "D") -> 10
            "A" -> 11
            else -> 0
        }


    }

    fun assZuEins(){
        if (zahl == "A")
            zahl = "1"
    }

    override fun toString(): String {
        return "$farbe ${if (zahl=="1") "A" else zahl}"
    }

}