package W6.D2

fun main() {

    Fahrrad(4)
    Fahrrad(3, "Test")


    var pizza1 = Pizza()
    var pizza2 = Pizza("Salami", 4.99)

}

class Fahrrad (val nr_gaenge: Int){

    val nr_reifen = 2
    var marke = ""
    var hatFederKupplung: Boolean = false

    constructor(nr_gaenge: Int, marke: String): this(nr_gaenge){
        this.marke = marke
    }


}

class Pizza(){

    var preis: Double = 5.99
    var name: String = ""

    constructor(name: String, preis: Double): this(){
        this.name = name
        this.preis = preis
    }


}