
class MountainBike(weight: Double, var hasSuspension: Boolean = false): Bicycle(weight) {
    override var gears: Int = 24
    var lockout: Boolean = false


    fun lockSuspension() {
        lockout = true
    }

    fun unlockSuspension() {
        lockout = false
    }

}


