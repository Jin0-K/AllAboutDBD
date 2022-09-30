package com.example.allaboutdbd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.allaboutdbd.databinding.ActivityMainMenuBinding
import kotlinx.android.synthetic.main.activity_main_menu.*

class MainMenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        killerSurvivorSetOnClickListener()
    }

    private fun killerSurvivorSetOnClickListener() {
        btn_killer.setOnClickListener {
            val intent = Intent(this@MainMenuActivity, KillerMainActivity::class.java)
            intent.putExtra("Killer", true)
            startActivity(intent)
        }
        btn_survivor.setOnClickListener {
            val intent = Intent(this@MainMenuActivity, KillerMainActivity::class.java)
            intent.putExtra("Killer", false)
            startActivity(intent)
        }
    }
}