package Bank

fun main(){

    val meineBank = Bank()

    meineBank.geldAbheben("Gordon", 20.0)

    val konto1 = meineBank.register.first()
    val konto2 = meineBank.register.last()

}