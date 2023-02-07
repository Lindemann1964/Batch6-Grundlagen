package W7.Calender

//
//import java.time.LocalDate
//import java.time.LocalDateTime
//import java.time.LocalTime
//import java.time.Duration

import java.time.*

fun main(){

    var testDatum = LocalDate.of(1994, 8, 11)

    var testUhrzeit = LocalTime.of(12, 0, 0)

    var aktuelleUhrZeit = LocalTime.now()
    var aktuelleDatum = LocalDate.now()


    var aktuellesDatumMitUhrzeit = LocalDateTime.now()
    println(aktuellesDatumMitUhrzeit)


    var vorlesungsDauer = Duration.between(aktuelleUhrZeit, testUhrzeit)

    println(vorlesungsDauer.toMinutes())



}

fun daysUntilXmas(){
    var xmas = LocalDateTime.of(2022, 12, 24, 12, 0)
    val difference = Duration.between(LocalDateTime.now(), xmas)

    var days = difference.toDays().toInt()
    var hours = difference.toHours().toInt() // Gesamte Zeit in Stunden
    var minutes = difference.toMinutes().toInt() // Gesamte Zeit in Min

    hours -= days * 24                       // Stunden ohne Tage
    minutes = minutes - (days*24*60) - (hours*60)


    println("Bis Weihnachten sind es noch $days Tage, $hours Stunden " +
            "und $minutes Minuten.")

}
