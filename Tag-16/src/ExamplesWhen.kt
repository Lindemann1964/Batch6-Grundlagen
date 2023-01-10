fun main(){

    println("Geben sie Ihr Alter ein:")
    when (readln().toInt()){
        in 0..17 -> {
            println("Zeige Inhalte für Kinder")
        }
        else -> {
            println("Zeige jeden Inhalt")
        }
    }

    var filmliste = listOf("The Batman", "Queen's Gambit", "Fight Club", "The Matrix", "Toy Story")
    println("Geben sie einen Index ein")

    var input = readln().toInt()
    when (input){
        in 0..filmliste.size-1 -> {
            println("Sie haben sich für ${filmliste[0]} entschieden")
        }
        else -> println("Sie haben eine falsche Eingabe gemacht")
    }


}