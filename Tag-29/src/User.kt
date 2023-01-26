
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


}





