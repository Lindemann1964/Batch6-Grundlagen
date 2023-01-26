package Moebelhaus

class Couch(name: String,
            preis: Double,
            val hoehe: Double,
            val laenge: Double,
            val breite: Double,
            val ausklappbar: Boolean): MoebelStueck(name, preis) {

    var ausgeklappt: Boolean = false

    constructor(name: String,
                preis: Double,
                hoehe: Double,
                laenge: Double,
                breite: Double,
                ausklappbar: Boolean,
                farben: List<String>): this(name, preis, hoehe, laenge, breite, ausklappbar){
        this.moeglicheFarben = farben
    }

    fun ausklappen(){
        if (this.ausklappbar){
            ausgeklappt = !ausgeklappt
        }
    }

}
