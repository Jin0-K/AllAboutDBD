package com.example.allaboutdbd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_killer_main.*

class KillerMainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_killer_main)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val btnClicked = intent.getBooleanExtra("Killer", true)
        if (btnClicked) {
            charactersSetOnClickListener()
        }
        else {
            tv_title.setText(R.string.survivor)
            btn_addons.setText(R.string.items_addons)
        }

    }

    private fun charactersSetOnClickListener() {
        btn_characters.setOnClickListener {
            val intent = Intent(this@KillerMainActivity, KillerListActivity::class.java)
            startActivity(intent)
        }
    }
}