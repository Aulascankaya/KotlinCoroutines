package com.ulas.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    //Dispatchers
    //Dispatchers.default -> CPU Intensive
    //Dispatchers.IO -> Input / Output, Networking
    //Dispatchers.Main -> UI
    //Dispatchers.Unconfined -> Inherited dispatcher


    //run this codes in MainActivity.kt
    //This code snippet demonstrates how coroutines can work on multiple threads using different Dispatchers.

    runBlocking {
        launch(Dispatchers.Main) {
            println("Main Thread : ${Thread.currentThread().name}")
        }
        launch(Dispatchers.IO) {
            println("IO Thread : ${Thread.currentThread().name}")
        }
        launch(Dispatchers.Default) {
            println("Default Thread : ${Thread.currentThread().name}")
        }
        launch(Dispatchers.Unconfined) {
            println("Unconfined Thread : ${Thread.currentThread().name}")
        }
    }
}