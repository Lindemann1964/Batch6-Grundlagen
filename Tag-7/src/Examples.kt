fun main(){

    val farbListe = listOf("rot", "lila", "schwarz")

    val museumsListe = mutableListOf<String>()
    val bewertungsListe = mutableListOf<Double>()


    var nameDesMuseums = readln()
    museumsListe.add(nameDesMuseums)
    var userRatings = listOf<Int>(4,5,4,3)
    bewertungsListe.add(userRatings.average())


    nameDesMuseums = readln()
    museumsListe.add(nameDesMuseums)
    userRatings = listOf(1, 2, 3, 1, 2, 1)
    bewertungsListe.add(userRatings.average())


    userRatings = listOf()
    println(museumsListe)
    println(bewertungsListe)

}