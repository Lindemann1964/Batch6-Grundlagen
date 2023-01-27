
class User {
    val userId: String
    var userName: String
    private var password: String
    var userData: UserData

    constructor(userName: String, userId: String, password: String, userData: UserData) {
        this.userId = userId
        this.userName = userName
        this.password = password
        this.userData = userData
    }

    fun checkPassword(input: String): Boolean{
        return password == input
    }

    fun passAendern(altesPassword: String){
        if (altesPassword == this.password){
            println("Geben sie ihr neues Passwort ein!")
            this.password = readln()
        }
    }

    fun passwortVergessen(){

    }

}





