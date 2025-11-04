package com.example.creayusavariablesenkotlin

fun unreadMessages(unreadCount: Int) {
    /*
     * This program displays the number of unread messages
     */
    println("You have $unreadCount unread messages.")
}

fun totalMessages(unreadCount: Int, readCount: Int) {
    /*
     * This program displays the number of messages
     * in the user's inbox.
     */
    println("You have ${unreadCount + readCount} total messages in your inbox.")
}

fun resumenFotos(numberOfPhotos: Int, photosDeleted: Int) {
    /*
     * This program displays the number of photos left
     */
    println("$numberOfPhotos photos")
    println("$photosDeleted photos deleted")
    println("${numberOfPhotos - photosDeleted} photos left")
}

fun totalCarts(cartTotal: Int) {
    /*
     * This program displays the number of carts
     */
    println("Total: $cartTotal")
}

fun imprimirTotalMilla(trip1: Double, trip2: Double, trip3: Double) {
    /*
     * This program displays the number of miles driven on a trip.
     */
    val totalTripLength: Double = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")
}

fun recordatorioReunion(nextMeeting: String, date: String) {
    /*
     * This program displays a meeting reminder
     */
    val reminders = nextMeeting + date + "at work"
    println(reminders)
}

fun imprimirComillas() {
    /*
     * This program displays a message with quotation marks.
     */
    println("Say \"hello\"")
}

fun imprimirEstado(estado: Boolean) {
    /*
     * This program displays the state of the notification.
     */
    println("Are notifications enabled? " + estado)
}

fun main() {
    /*
    val readCount = 100
    val unreadCount = 5
    //unreadMessages(unreadCount = unreadCount)
    //totalMessages(unreadCount = unreadCount, readCount= readCount)
    */

    /*
    val numberOfPhotos = 100
    val photosDeleted = 10
    //resumenFotos(numberOfPhotos = numberOfPhotos, photosDeleted = photosDeleted)
    */

    /*
    var cartTotal = 0
    //totalCarts(cartTotal = cartTotal)
    cartTotal = 20
    //totalCarts(cartTotal = cartTotal)
    */

    /*
    var count: Int = 10 // Create a variabe for the number of unread messages
    //unreadMessages(unreadCount = count)
    count = count + 1 // Increase the number of messages by 1
    //unreadMessages(unreadCount = count)
    count++ // Increase the number of messages by 1
    //unreadMessages(unreadCount = count)
    count-- // Decrease the number of messages by 1
    //unreadMessages(unreadCount = count)
    */

    /*
    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
    //imprimirTotalMilla(trip1 = trip1, trip2 = trip2, trip3 = trip3)
    */

    /*
    val nextMeeting = "Next meeting: "
    val date = "January 1 "
    recordatorioReunion(nextMeeting = nextMeeting, date = date)
    */

    //imprimirComillas()

    val notificationEnable: Boolean = false
    imprimirEstado(estado = notificationEnable)
}

