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

fun main() {
    val unreadCount = 5
    val readCount = 100
    val numberOfPhotos = 100
    val photosDeleted = 10
    //unreadMessages(unreadCount=unreadCount)
    //totalMessages(unreadCount= unreadCount, readCount= readCount)
    resumenFotos(numberOfPhotos= numberOfPhotos, photosDeleted= photosDeleted)
}