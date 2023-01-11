package W1.D4

fun main() {

    // TODO: show possible ways

    var result1 = 20 % 3
    println(result1)

    var result2 = 24 % 5.5
    println(result2)


    var numberOne = 20
    var numberTwo = 5
    var result3 = numberOne % numberTwo

    println(result3)

    // TODO: show impossible ways
    // var result4 = "Niclas" % "Borrmann"
    // var result5 = "5a" % 22
    // var result6 = "5a" % 22.5
    // var result7 = 22 % "a"
    // var result8 = true % false



    // Example with clock
    var hours: Int = 0
    var minutes: Int = 0
    minutes += 1
    minutes %= 60
    hours %= 24


}