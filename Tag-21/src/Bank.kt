val kunden = mutableMapOf<String, Double>(
    "Gordon" to 0.00,
    "Evropi" to 1000.000,
    "Can" to 200.0

)

fun auszahlung(kunde: String, betrag: Double){
    if (kunde in kunden.keys){
        var kontoStand = kunden[kunde]

        if (kontoStand != null) {
            if (kontoStand >= betrag && betrag < 500){
                kunden[kunde] = kunden[kunde]!! - betrag
            }
        }
    }
}

fun main(){

    auszahlung("Evropi", 500.0)
    auszahlung("Gordon", 100.0)

}