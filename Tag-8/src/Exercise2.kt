fun main(){
//    Lege eine Liste an, und speichere darin deine 3 Lieblingsfilme

    var lieblingsFilme: MutableList<String> = mutableListOf(
        "Fast and the Furios",
        "The Wolf of Wallstreet",
        "Catch me if you can")

//    Lege eine 2. Liste an für die Bewertungen, bewerte dort jeden Film zw. 1 und 5.
    var bewertungen: MutableList<Double> = mutableListOf(4.2, 4.1, 4.9)

//    Mithilfe von .max() & .indexOf() bestimme, den Aller Lieblingsfilm
    var indexAllerLieblingsFilm = bewertungen.indexOf(bewertungen.max())
    var allerLieblingsFilm = lieblingsFilme[indexAllerLieblingsFilm]

//    Gebe den Namen von diesem auf der Konsole aus.
    println(allerLieblingsFilm)

}