package W4.D1

fun main() {

    var userLoggedIn: Boolean = false
    if (userLoggedIn){
        showHomeScreen()
    }
    else{
        showLoginScreen()
        userLoggedIn = true
    }

    // Umkehrbeispiel
    var userNotLoggedIn: Boolean = false
    if (userNotLoggedIn){
        showLoginScreen()
        userLoggedIn = true
    }
    else{
        showHomeScreen()
    }

}

fun showHomeScreen(){
   println("Willkommen, User!")
}

fun showLoginScreen(){
    println("Login erfordert. Bitte einloggen!")
    println("Username:")
    readln()
    println("Passwort:")
    readln()
}