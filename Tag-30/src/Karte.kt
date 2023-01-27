class Karte(val farbe: String,
            val wert: String) {

    fun wert(): Int{

        return when(this.wert){
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

    override fun toString(): String {
        return "$farbe $wert"
    }

}