
open class Bicycle(var weight: Double) {
    open var gears: Int = 12
    var gear: Int = 1


    constructor(weight: Double, maxGears: Int): this(weight){
        this.gears = maxGears
    }


    fun changeGear(newGear: Int) {
        if (newGear in 1..gears) {
            this.gear = newGear
        }
    }
}



