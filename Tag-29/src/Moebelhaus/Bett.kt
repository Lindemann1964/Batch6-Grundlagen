package Moebelhaus

class Bett(name: String,
           preis: Double,
           val hoehe: Double,
           val laenge: Double,
           val breite: Double,
           val matrazeInkl: Boolean = false) : MoebelStueck(name, preis){

    override var moeglicheFarben: List<String>  = listOf("Braun", "Schwarz")

}