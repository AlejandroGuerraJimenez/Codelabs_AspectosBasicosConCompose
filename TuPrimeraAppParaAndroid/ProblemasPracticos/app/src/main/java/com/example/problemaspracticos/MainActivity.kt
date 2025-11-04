package com.example.problemaspracticos


fun ejercicio1() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.\n")
}

fun ejercicio2() {
    println("New chat message from a friend \n")    // Hace falta cerrar la string "" y poner bien el parentsis
}

fun ejercicio3() {
    var discountPercentage: Int = 0     // Para poder modificar el valor --> var
    var offer: String = ""              // Para poder modificar el valor --> var
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up! \n"

    println(offer)
}

fun ejercicio4() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids // si ambas fueran strings se concatenan las strings
    println("The total party size is: $total \n")
}

fun ejercicio5() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount // Si queremos que se sumen los valores no podemos tratarlo como String
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).\n")
}

fun ejercicio6_1() {
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result \n")
}

fun ejercicio6_2() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult \n")
}

fun ejercicio6_3() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = substract(firstNumber, thirdNumber)
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult \n")
}
fun ejercicio7_1() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"
    println(displayAlertMessage(operatingSystem, emailId))

}


fun ejercicio7_2() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))


    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
}

fun ejercicio8(){
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps)
    println("Walking $steps steps burns $caloriesBurned calories\n")
}

fun ejercicio9() {
    println(compararValores(300, 250))
    println(compararValores(300, 300))
    println(compararValores(200, 220))
    println()
}
fun ejercicio10() {
    climaCiudad(name = "Ankara", lowTemperature = 27, highTemperature = 31, chanceOfRain = 82)
    climaCiudad(name = "Tokyo", lowTemperature = 32, highTemperature = 36, chanceOfRain = 10)
    climaCiudad(name = "Cape Town", lowTemperature = 59, highTemperature = 64, chanceOfRain = 2)
    climaCiudad(name = "Guatemala City", lowTemperature = 50, highTemperature = 55, chanceOfRain = 7)
}

fun main() {
    ejercicio1()
    ejercicio2()
    ejercicio3()
    ejercicio4()
    ejercicio5()
    ejercicio6_1()
    ejercicio6_2()
    ejercicio6_3()
    ejercicio7_1()
    ejercicio7_2()
    ejercicio8()
    ejercicio9()
    ejercicio10()
}


fun climaCiudad(name: String, lowTemperature: Int, highTemperature: Int, chanceOfRain: Int) {
    println("City: $name")
    println("Low temperature: $lowTemperature, High temperature $highTemperature")
    println("Chance of rain: $chanceOfRain%")
    println()
}


fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId.\n"
}

fun add(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun substract(number1: Int, number2: Int): Int {
    return number1 - number2
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val CaloriesBurnetForEachStep = 0.004
    val totalCaloriesBurned = numberOfSteps * CaloriesBurnetForEachStep
    return totalCaloriesBurned
}

fun compararValores(timeSpentToday: Int, timeSpentYetsterday: Int): Boolean {
    return timeSpentToday > timeSpentYetsterday
}
