package com.example.coroutines

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var TAG="oooooooooooooooooooooo"

        Log.d(TAG,"MAIN STARTS  ${Thread.currentThread().name}")

        GlobalScope.launch{
            Log.d(TAG,"Nested STARTS  ${Thread.currentThread().name}")
            delay(5000)
            Log.d(TAG,"Nested Ends  ${Thread.currentThread().name}")


        }
        runBlocking {
            delay(2000)

        }
        Log.d(TAG,"MAIN Ends  ${Thread.currentThread().name}")




    }
}