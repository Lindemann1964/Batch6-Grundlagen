fun main(){
    /*
        Wiederholung Modulo:

        10 % 2 = 0
        10 % 3 = 1
        10 % 4 = 2
        10 % 5 = 0

        sek = (sek + 1 ) % 60
        h = (h + 1) % 24

     */


    // Break lässt uns Schleifen vorher Abbrechen
    var primNumbers = mutableListOf<Int>()
    for (i in 2..100){
        var prim = true
        for (j in 2 until i){
            if (i % j == 0){  // i / j
                prim = false
                break
            }
        }
        if (prim){
            println("$i ist eine Primzahl")
            primNumbers.add(i)
        }
    }

    println("Alle Primzahlen: $primNumbers")

    // Continue lässt uns iterationen in unseren Schleifen über Springen
    for (i in 2..100){
        if (i in primNumbers)
            continue

        var deviders = mutableListOf<Int>()
        for (j in 2 until i){
            if (i % j == 0){
                deviders.add(j)
            }
        }

        println("$i ist teilbar durch $deviders")


    }


}