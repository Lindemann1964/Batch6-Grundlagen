

fun main(){
    var testListe = mutableListOf(1,23,1,231,3243)

    test(liste=testListe)


}

fun test(liste: MutableList<Int>){

    liste.clear()
    println(liste)
}