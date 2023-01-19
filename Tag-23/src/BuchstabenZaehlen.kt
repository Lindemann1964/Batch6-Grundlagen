fun main(){

    var songText = """
        May I have your attention, please? 
        May I have your attention, please? 
        Will the real Slim Shady please stand up? 
        I repeat, will the real Slim Shady please stand up? 
        We're gonna have a problem here? 
        Y'all act like you never seen a white person before 
        Jaws all on the floor like Pam, like Tommy just burst in the door 
        And started whoopin' her ass worse than before 
        They first were divorced, throwin' her over furniture (ah!) 
        It's the return of the-, oh, wait, no way, you're kidding 
        He didn't just say what I think he did, did he? 
        And Dr. Dre said-, nothing you idiots 
        Dr. Dre's dead, he's locked in my basement (haha) 
    """


    var zaehler = mutableMapOf<Char, Int>()

    for (zeichen in songText.lowercase()){

        if (zeichen in ('a' .. 'z')){
            if (zeichen in zaehler.keys){
                zaehler[zeichen] = zaehler[zeichen]!! + 1
            }
            else {
                zaehler[zeichen]  = 1
            }
        }
    }

    for (buchstabe in zaehler.keys.sorted()){
        println("Der Buchstabe '$buchstabe' kommt ${zaehler[buchstabe]} mal vor")
    }

    println()
    println()

    var bereitsVorgelesen = mutableSetOf<Char>()
    for (anzahl in zaehler.values.sorted()){
        for (buchstabe in zaehler.keys){
            if (zaehler[buchstabe] == anzahl && buchstabe !in bereitsVorgelesen){
                println("Der Buchstabe '$buchstabe' kommt $anzahl mal vor")
                bereitsVorgelesen.add(buchstabe)
            }
        }
    }


    /* Anzahl Worte:
            anzahl Leerzeichen zählen
     */

    songText = songText.lowercase()

    var satzZeichen = listOf(",", "?", ".","\t", "\n")

    for (zeichen in satzZeichen){
        songText = songText.replace(zeichen, "")
    }
    songText = songText.replace("    ", " ")
    songText = songText.replace("   ", " ")
    songText = songText.replace("  ", " ")


    var wortZaehler = mutableMapOf<String, Int>()

    var wortListe = songText.split(' ')

    for (wort in wortListe.sorted()){
        if (wort.length > 1 && wort[1] == 'a'){
            if (wort in wortZaehler.keys){
                wortZaehler[wort] = wortZaehler[wort]!! + 1
            }
            else {
                wortZaehler[wort] = 1
            }
        }
    }

    println(wortZaehler)

}