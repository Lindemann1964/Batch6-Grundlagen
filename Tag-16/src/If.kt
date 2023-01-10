package W4.D1

fun main() {

    var updateAvailable: Boolean = false

    if (updateAvailable){
        updateSystem()
        updateAvailable = false
    }

}

fun updateSystem(){
    println("Alle Programme werden geschlossen")
    println("update läuft")
    println("[--------50%--------]")
    println("System neustart")
    println("Update erfolgreich installiert")
}