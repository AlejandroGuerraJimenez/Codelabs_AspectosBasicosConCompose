package com.example.comocrearyusarfuncionesenkotlin


fun main() {

    /*
    val greeting = birhdayGreeting()
    println(greeting)
     */
    //println(birhdayGreeting())
    //println(birhdayGreeting("Rover"))
    //println(birhdayGreeting("Rex"))
}

fun birhdayGreeting(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}


fun birhdayGreeting(name: String): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}
