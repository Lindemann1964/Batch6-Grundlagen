class Produkt(val name: String, var preis: Double) {


    override fun toString(): String {
        return "${this.name}: ${this.preis}"
    }


}