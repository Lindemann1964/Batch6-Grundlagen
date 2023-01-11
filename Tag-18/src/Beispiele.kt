fun main(){
    // Beispiel Double Zahl einlesen
    println("Geben sie eine Kommazahl ein:")
    var eingabe = readln()

    var kommaZahl: Double
    try {
        kommaZahl = eingabe.toDouble()
    }catch (ex: Exception){
        eingabe = eingabe.replace(",", ".")
        kommaZahl = eingabe.toDouble()
    }

    println("Die Gewählte Zahl ist $kommaZahl")
}