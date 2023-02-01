fun main(){
    var i = 0
    println("\nWhile Schleife:")
    // While Schleife
    while (i <= 3){
        println(i)
        i += 1
    }
    println("Ende der While Schleife")


    i = 0
    println("\nDo-while Schleife:")
    // Do While Schleife
    do {
        println(i)
        i ++
    } while (i <= 3)
    println("Ende der do-while Schleife")

    // Komplizierteres Beispiel
    passwortAbfrageDoWhile()
    passwortAbfrageWhile()
}

fun passwortAbfrageDoWhile(){
    val PASSWORD = "guest"
    var nrVersuche = 0
    var userinput = ""
    do {
        println("Password eingeben!" )
        userinput = readln()
        nrVersuche ++
    } while (userinput != PASSWORD && nrVersuche < 3) //

    if (userinput == PASSWORD)
        println("Authentifizierung Erfolgreich")
    else
        println("Sie haben zu oft das Password falsch eingegeben")
}

fun passwortAbfrageWhile(){
    val PASSWORD = "guest"
    var nrVersuche = 0

    var userinput = ""
    while (userinput != PASSWORD && nrVersuche < 3) {
        println("Password eingeben!")
        userinput = readln()
        nrVersuche ++
    }
    if (userinput == PASSWORD)
        println("Authentifizierung Erfolgreich")
    else
        println("Sie haben das Password zu oft falsch eingegeben")
}


fun passwortAbfrageFor(){
    val PASSWORD = "guest"
    var nrVersuche = 0
    var userinput = ""

    for (i in 1..3){
        println("Password eingeben!")
        userinput = readln()

        if (userinput == PASSWORD){
            println("Authentifizierung Erfolgreich")
            break
        }
    }


    while (userinput != PASSWORD && nrVersuche < 3) {
        println("Password eingeben!")
        userinput = readln()
        nrVersuche ++
    }
    if (userinput == PASSWORD)
        println("Authentifizierung Erfolgreich")
    else
        println("Sie haben das Password zu oft falsch eingegeben")
}
