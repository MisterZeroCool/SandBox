import java.util.StringJoiner

fun main(args: Array<String>) {


    val greetingFunction: (String, Int) -> String = { playerName, numBuildings ->
        val currentYear = 2018
        println("Adding $numBuildings houses!")
        "Welcome to SimVillage, $playerName!  (copyright $currentYear)"
    }
    println(greetingFunction("Meliodas", 7))

    val greetingFunction1  = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses!")
        "Welcome to SimVillage, $playerName!  (copyright $currentYear)"
    }

    println(greetingFunction("Meliodas", 2))

    val greetingFunction2  = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses!")
        "Welcome to SimVillage, $playerName!  (copyright $currentYear)"
    }
    runSimulation("Meliodas", greetingFunction2)


    //-----------------------------------------------------------------------------------------
    runSimulation2("Guyal", ::printConstructionCost) {playerName, numBuildings ->
        val currentYear = 2018
        println("Adding $numBuildings houses!")
        "Welcome to SimVillage, $playerName!  (copyright $currentYear)"
    }

    runSimulation()
}


fun runSimulation(playerName: String, greetingFunction2: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last()
    println(greetingFunction2(playerName, numBuildings))
}

inline fun runSimulation2(
    playerName: String,
    costPrinter: (Int) -> Unit,
    greetingFunction2: (String, Int) -> String) {
    val numBuildings = (1..3).last()
    costPrinter(numBuildings)
    println(greetingFunction2(playerName, numBuildings))
}

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}
//Тип функций как возвращаемый тип--------------------------------------------------------------------------------------------------------------------
fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
}
fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2018
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}

fun sum(a:Int, b: Int){
    val sum = a+b
    println(sum)
}