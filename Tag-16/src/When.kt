package W4.D1

fun main() {
    // Example 1: Birthday
    var birthday = "12.6.2002"
    val birthday_split = birthday.split(".")
    val monthNumber = birthday_split[1].toInt()
    val monthText = getMonthAsText(monthNumber)

    birthday = birthday_split[0] + "." + monthText + "." + birthday_split[2]

    println(birthday)


    // Example Weekend
    println("Gib ein welcher Wochentag heute ist (auf English)")
    var dayInput = readln()
    var isWeekend = isWeekend(dayInput)

    if (isWeekend){
        println("Hurra es ist Wochenende")
    }


    // Example: Anrufbeantworter
    println("Drücken sie die 1 um ihren Kontostand abzufragen, drücken sie 2 für Guthaben hinzufügen....")
    var input = readln().toInt()

    when (input){
        1 -> println("Kontostand Abfragen")
        2 -> println("Guthaben hinzufügen")
    }
}

fun getMonthAsText(month: Int): String{
    when (month){
        1 -> {
            return "Januar"
        }
        2 -> return "Februar"
        3 -> return "März"
        4 -> return "April"
        5 -> return "Mai"
        6 -> return "Juni"
        7 -> return "Juli"
        8 -> return "August"
        9 -> return "September"
        10 -> return "Oktober"
        11 -> return "November"
        12 -> return "Dezember"

        else -> {
            return "Bitte geben Sie einen gültigen Monat ein"
        }
    }
}


fun isWeekend(day: String): Boolean {
    var dayLower = day.lowercase()

    when (dayLower) {
        "saturday" -> return true
        "sunday" -> return true
        else -> return false
    }
}

