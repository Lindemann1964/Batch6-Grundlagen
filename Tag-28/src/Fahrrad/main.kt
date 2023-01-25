

fun main() {
    // Instanziierung
    var roadBike: Bicycle = Bicycle(9.82)
    var mountainBike: MountainBike = MountainBike(13.22, true)

    // Methoden aufruf
    roadBike.changeGear(3)
    mountainBike.changeGear(10)


    if (mountainBike.hasSuspension)
        mountainBike.lockSuspension()
}