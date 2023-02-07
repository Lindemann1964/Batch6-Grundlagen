import java.io.File

fun main(){

    // Der Text der in die Datei geschrieben wird:
    var saveText = """
Hallo,👋🏻
ich bin einfach ein Test,
    um zu testen.
    """.trimMargin()


    // Datei = File
    // File()
    val filePath = "Tag-37/test.txt"
    val saveFile = File(filePath)

    // Datei schreiben
    saveFile.writeText(saveText)

    saveFile.appendText("\ntest blip blup")


    // Datei lesen
    var testText: String = saveFile.readText()
    var testTextZeilen: List<String> = saveFile.readLines()


    println(testText.length)
    println(testTextZeilen.size)



}


fun writeToSaveFile(filePath: String, saveText: String){

}

fun loadFromSaveFile(filePath: String): String{
    val saveFile = File(filePath)
    return saveFile.readText()
}
