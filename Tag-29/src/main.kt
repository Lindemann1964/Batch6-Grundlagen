fun main() {
    var user: User = User(
        "peterPolo",
        "1",
        "123456A",
        UserData("Peter", "Polo", "22.11.1960", "peter@polo.com"))

    println(user.userName)
    //println(user.password)    // nicht möglich, da die Eigenschaft versteckt ist
    user.passwortVergessen()    // wenn wir das Pass

    var input = readln()
    var isValidPassword = user.checkPassword(input)

    if(isValidPassword){
        println("Du bist eingeloggt.")
    } else {
        println("Das Passwort ist falsch...")
    }

}