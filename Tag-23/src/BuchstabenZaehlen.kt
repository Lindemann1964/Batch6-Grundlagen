fun main(){

    val songText = """
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

    // Gregor Lösung

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

}