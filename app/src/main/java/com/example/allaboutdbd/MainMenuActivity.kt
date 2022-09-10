package com.example.allaboutdbd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_menu.*

class MainMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        killerSetOnClickListener()
    }

    private fun killerSetOnClickListener() {
        btn_killer.setOnClickListener {
            val intent = Intent(this@MainMenuActivity, KillerMainActivity::class.java)
            startActivity(intent)
        }
    }
}