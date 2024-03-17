package com.ulas.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // LIGHT WEIGHTNESS
     /*
        GlobalScope.launch {
            repeat(100000){
                launch {
                    print("android")
                }
            }
        }

      */

        // SCOPE
        // Global Scope , runBlocking , CoroutineScope
        // runBlocking
       /* println("run blocking start")
        runBlocking {
            launch{
                delay(2000)
                println("run blocking")      //  1-run blocking start 2- run blocking(2sec delay) 3- run blocking end
            }
        }
        println("run blocking end")

        */

        //GlobalScope
          /*
          println("globalscope start")

        GlobalScope.launch {
            delay(5000)
            println("global scope")  // 1-globalscope start 2-global scope end 3- global scope (5sec delay)
        }
        println("global scope end")

           */


        //CoroutineScope

        /*
        println("coroutine scope start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("coroutine scope")             //1-coroutine scope start 2- coroutine scope end 3-coroutine scope(5sec delay)
        }
        println("coroutine scope end")

         */


    }
}

