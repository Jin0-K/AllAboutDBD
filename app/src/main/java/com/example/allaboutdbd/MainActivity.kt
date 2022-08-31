package com.example.allaboutdbd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.timerTask

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        startMainMenu()
    }

    fun startMainMenu() {
        if (!isDestroyed) {
            val intent = Intent(this@MainActivity, MainMenuActivity::class.java)
            //the task to do after timer ends
            val timertask = timerTask {
                if (!isDestroyed) {
                    startActivity(intent)
                    finish()
                }
            }

            //Initialize timer
            val timer = Timer()
            timer.schedule(timertask, 2000)

        }
    }
}