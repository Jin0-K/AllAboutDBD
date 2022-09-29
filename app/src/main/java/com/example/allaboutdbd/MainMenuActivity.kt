package com.example.allaboutdbd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.allaboutdbd.databinding.ActivityMainBinding
import com.example.allaboutdbd.databinding.ActivityMainMenuBinding
import kotlinx.android.synthetic.main.activity_main_menu.*

class MainMenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        killerSetOnClickListener(binding.btnKiller)
    }

    private fun killerSetOnClickListener(btn:Button) {
        btn.setOnClickListener {
            val intent = Intent(this@MainMenuActivity, KillerMainActivity::class.java)
            startActivity(intent)
        }
    }
}