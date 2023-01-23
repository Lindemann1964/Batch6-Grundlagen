
/*
    Pseudocode für Blackjack:

    geld = 50.00

    while(geld > 0.0){
        // Spielstart

        kartenStapel = kartendeck.toMutableList()
        mischen(kartenStapel)

        spielerHand = mutableListOf<Karte>()     // Karten sind Strings
        dealerHand = mutableListOf<Karte>()

        gebot = geldBieten()

        // Der Spieler erhält 2 Start Karten
        spielerHand.add(eineKarteZiehen())
        spielerHand.add(eineKarteZiehen())

        // Der Dealer erhält 2 Start Karten
        dealerHand.add(eineKarteZiehen())
        dealerHand.add(eineKarteZiehen())

        while (Spieler möchte eine Karte mehr)
            spielStandAusdrucken() // druckt die Hand des Spielers, Wert, und 1 Karte des Dealers aus
            spielZug()          // Frägt den Spieler, ob er noch (eine) Karte(n) möchte

        dealerSpielzug()    // Füllt die Hand des dealers anhand der Regeln (bis 17 muss er ziehen)

        var gewonnen: Boolean = gewinnerErmitteln() // Ermittelt ob der Spieler oder Dealer gewonnen hat

        if (gewonnen){
            geld += gebot
        }
        else{
            geld -= gebot
        }

    }

 */
