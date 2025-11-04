package com.example.comocrearyusarfuncionesenkotlin


fun main() {

    /*
    val greeting = birhdayGreeting()
    println(greeting)
     */
    //println(birhdayGreeting())

    /*
    println(birhdayGreeting("Rover"))
    println(birhdayGreeting("Rex"))
     */

    /*
    println(birhdayGreeting(age = 5, name = "Rover")) // orden incorrecto --> Al nombrar las variables da igual el orden
    println(birhdayGreeting("Rex", 2))  // orden correcto --> no necesario nombrar las variables
     */

    /*
    println(birhdayGreetingDefault(age = 5))
    println(birhdayGreetingDefault("Rex", 2))
     */
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

fun birhdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}


fun birhdayGreetingDefault(name: String = "Rover", age: Int): String {
    return  "Happy Birthday, $name! You are now $age years old!"
}