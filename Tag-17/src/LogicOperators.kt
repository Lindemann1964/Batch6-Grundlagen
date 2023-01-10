fun main() {
    val isSunny: Boolean = getRandomBoolean()
    val isRaining: Boolean = getRandomBoolean()
    val isWindy: Boolean = getRandomBoolean()
    val isDay: Boolean = getRandomBoolean()

    val temperature = getRandomTemperature() //zw. -5 und 30 Grad Celcius

    // TODO: NOT
    // Cloudy
    val isCloudy: Boolean = !(isSunny)

    // Warm Outside
    val isWarm = !(temperature < 20)

    // Night
    val isNight = !isDay


    // TODO: AND
    // Rainbow
    if (isRaining && isSunny)
        println("Wir sehen heute einen Regenbogen")

    // Snow
    val isSnowing: Boolean = isRaining && (temperature < 4)
    if (isSnowing)
        println("Es schneit")

    // Sunscreen
    if (isSunny && temperature > 25){
        println("Heute sollte ich besser eincremen")
    }

    // TODO: OR
    // Jacket
    if (isWindy || isRaining || temperature < 10)
        println("Heute sollte ich eine Jacke anziehen")
}

fun getRandomBoolean(): Boolean{
    return listOf(true,false).random()
}

fun getRandomTemperature(): Int{
    return (-5..30).random()
}