package com.example.creayusavariablesenkotlin

fun unreadMessages(unreadCount: Int) {
    println("You have $unreadCount unread messages.")
}

fun totalMessages(unreadCount: Int, readCount: Int) {
    println("You have ${unreadCount + readCount} total messages in your inbox.")
}

fun resumenFotos(numberOfPhotos: Int, photosDeleted: Int) {
    println("$numberOfPhotos photos")
    println("$photosDeleted photos deleted")
    println("${numberOfPhotos - photosDeleted} photos left")
}

fun totalCarts(cartTotal: Int) {
    println("Total: $cartTotal")
}

fun main() {
    /*
    val readCount = 100
    val unreadCount = 5
    //unreadMessages(unreadCount=unreadCount)
    //totalMessages(unreadCount= unreadCount, readCount= readCount)
    */
    
    /*
    val numberOfPhotos = 100
    val photosDeleted = 10
    //resumenFotos(numberOfPhotos= numberOfPhotos, photosDeleted= photosDeleted)
    */
    
    /*
    var cartTotal = 0
    //totalCarts(cartTotal= cartTotal)
    cartTotal = 20
    //totalCarts(cartTotal= cartTotal)
    */

    /*
    var count: Int = 10
    unreadMessages(unreadCount= count)
    count = count + 1
    unreadMessages(unreadCount= count)   
    count++
    unreadMessages(unreadCount= count)
    count--
    unreadMessages(unreadCount= count)
    */
}