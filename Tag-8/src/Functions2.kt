fun main(){

    var articles: MutableList<String> = mutableListOf("Banane", "Himbeere", "Gurke", "Tomate", "Himbeere")
    var quantities: MutableList<Int> = mutableListOf(3, 2, 100, 2, 9, 120)
    var prices: MutableList<Double> = mutableListOf(0.44, 0.35, 0.05, 0.50, 0.3, 0.06)

    // TODO: add single article at first index
    println("Bevor wir den Apfel hinzugefügt haben: $articles")
    articles.add(0, "Apfel")
    println("Nachdem wir den Apfel hinzugefügt haben: $articles")

    // TODO: add multiple items to articles
    println("Bevor wir addAll ausgeführt haben: $articles")

    var sonderAngebote = listOf("Sauerampfer", "Rhabarber")
    articles.addAll(sonderAngebote)

    quantities.addAll(listOf(5, 5))

    var sonderPreise = mutableListOf(0.45, 0.99)
    prices.addAll(sonderPreise)

    println("Nachdem wir addAll ausgeführt haben: $articles")


    // TODO: fill all elements
    //quantities.fill(10)
    println(quantities)


    // TODO: new list with only the Vegetables
    var onlyVegetables = articles.slice(3..4) // 3..4
    println(onlyVegetables)

    // TODO: new list with only the last 2 elements
    var nrArticles = articles.size
    var onlySpecials = articles.slice(nrArticles-2 ..nrArticles-1)
    //     println(onlySpecials)

//
//    // TODO: remove element at index
//    println("Davor: $articles")
//    articles.removeAt(3)
//    println("Danach: $articles")
//
//    // TODO: remove multiple elements
//    println("Vor dem Löschen: $articles")
//    var removeTheseObjects = listOf("Himbeere", "Apfel")
//    articles.removeAll(removeTheseObjects)
//    println("Nach dem Löschen: $articles")
//
//    // TODO: new list with only Banane und Apfel (2 options: RemoveAll or RetainAll)
//    println("Davor: $articles")
//    articles.retainAll(listOf("Banane", "Apfel"))
//    println("Danach: $articles")

    // TODO: check if Ananas is in our list
    var containsPineapple = articles.contains("Ananas")
    println("Haben wir Ananas im Angebot: $containsPineapple")

    // TODO: check if we have Banane and Apfel
    var containsBananaAndApple = articles.containsAll(listOf("Banane", "Apfel"))
    println("Haben wir Banane und Apfel im Angebot: $containsBananaAndApple")

    // TODO: last index of item
    println("Unser Sortiment: $articles")
    var indexOfHimbeere = articles.indexOf("Himbeere")
    println(indexOfHimbeere)
    var lastIndexOfHimbeere = articles.lastIndexOf("Himbeere")
    println(lastIndexOfHimbeere)


    // TODO: randomly shuffle prices
    println("Preise vor dem Mischen: $prices")
    prices.shuffle()
    println("Preise nach dem Mischen: $prices")

    // TODO: sort articles
    println("Unsortiertes Sortiment: $articles")
    articles.sort()
    println("Sortiertes Sortiment: $articles")

    // TODO: sort quantities
    println("Anzahl unsortiert: $quantities")
    var sortedQuantities = quantities.sorted()
    println("Anzahl sortiert: $quantities")
    println("Anzahl sortiert: $sortedQuantities")

    // TODO: get random article
    var randomArticle = articles.random()
    println("Du solltest heute folgendes zufälliges Produkt essen: $randomArticle")

}