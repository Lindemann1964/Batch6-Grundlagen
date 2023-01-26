package Moebelhaus

open class MoebelStueck{
    var name: String
    var preis: Double

    var catalogNr: Int? = null
    var farbe: String = "weiss"
    open var moeglicheFarben: List<String> = listOf("weiss", "schwarz")

    constructor(name: String, preis: Double){
        this.name = name
        this.preis = preis
    }

    fun farbeWechseln(neueFarbe: String){
        if (neueFarbe in moeglicheFarben){
            farbe = neueFarbe
        }
        else
            println("Diese Farbe exist nicht für das Möbelstück $name")
    }

    override fun equals(other: Any?): Boolean {
        if (other is MoebelStueck){
            if (this === other){
                return true
            }
            else return (other.preis == this.preis) && (other.name == this.name)
        }
        else
            return false
    }


    override fun toString(): String {
        return "Das Möbelstück $name kostet $preis"
    }
}