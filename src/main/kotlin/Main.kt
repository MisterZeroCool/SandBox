fun main(args: Array<String>) {
    val greetingFunction: (String, Int) -> String = { playerName, numBuildings ->
        val currentYear = 2018
        println("Adding $numBuildings houses!")
        "Welcome to SimVillage, $playerName!  (copyright $currentYear)"
    }
    println(greetingFunction("Meliodas", 7))


    val greetingFunction2  = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses!")
        "Welcome to SimVillage, $playerName!  (copyright $currentYear)"
    }

    runSimulation("Meliondas", greetingFunction2)

    //-----------------------------------------------------------------------------------------
    runSimulation("Guyal") {playerName, numBuildings ->
        val currentYear = 2018
        println("Adding $numBuildings houses!")
        "Welcome to SimVillage, $playerName!  (copyright $currentYear)"
    }
}


fun runSimulation(playerName: String, greetingFunction2: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last()
    println(greetingFunction2(playerName, numBuildings))
}
