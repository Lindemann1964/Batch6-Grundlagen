package W3.D5

import java.time.LocalDate        // Datum
import java.time.LocalDateTime    // Datum + Uhrzeit

import java.time.Period             // Unterschied zw. 2 Zeitpunkten
import java.time.Month


// Hier speichern wir alle Geburtstage ab
var birthdays = mutableMapOf<String, LocalDate>()

// Map von Monatsnamen zu Zahlen
val months = mapOf<String, Int>(
    "Januar" to 1,
    "Februar" to 2,
    "März" to 3,
    "April" to 4,
    "Mai" to 5,
    "Juni" to 6,
    "Juli" to 7,
    "August" to 8,
    "September" to 9,
    "Oktober" to 10,
    "November" to 11,
    "Dezember" to 12
)

fun main(){

    //addBirthday("Error", 1995, 2, 31) // Muss legitimes Datum sein

    addBirthday("Gordon", 1998,4,3)
    addBirthday("Cora", 1991, 8, 1)
    addBirthday("Felix", "27.4.1986")
    addBirthday("Markus", "12.12.1912")
    addBirthday("Nostradamus", "21.12.1503")
    addBirthday("Olaf Scholz", "14.6.1958")


    filterByMonth("Dezember")
    //filterByMonth(4)

    sortBirthdaysByName()
    println(birthdays)

}


fun getDate(day: Int, month: Int, year: Int): LocalDate{
    return LocalDate.of(year, month, day)
}

fun getDate(date: String): LocalDate{
    // Meine Funktion erfordert ein Datum mit folgender Struktur:
    // "Tag.Monat.Jahr"

    val dayMonthYear = date.split(".") // "14.12.2022" -> ["14", "12", "2022"]

    val day = dayMonthYear[0].toInt()
    val month = dayMonthYear[1].toInt()
    val year = dayMonthYear[2].toInt()

    return getDate(day, month, year)
}

fun calculateAge(birthday: LocalDate): Int{
    val today = LocalDate.now()
    val difference = Period.between(birthday, today)

    return difference.years
}



fun addBirthday(name: String, birthYear: Int, birthMonth: Int, birthDay: Int){
    birthdays[name] = getDate(birthDay, birthMonth, birthYear)
}

fun addBirthday(name: String, date: String){
    birthdays[name] = getDate(date)
}

fun filterByMonth(month: Int){
    val filteredView = birthdays.filter { it -> it.value.month == Month.of(month)}
    println(filteredView)
}

fun filterByMonth(month: String){
    filterByMonth(months[month]!!)
}

fun filterByName(input: String){
    var inputLower = input.lowercase()
    val filteredView = birthdays.filter { it -> it.key.lowercase().contains(inputLower)}
    println(filteredView)
}

fun sortBirthdaysByName(){
    // toSortedMap sortiert nach natürlicher Reihenfolge
    birthdays = birthdays.toSortedMap()
}
