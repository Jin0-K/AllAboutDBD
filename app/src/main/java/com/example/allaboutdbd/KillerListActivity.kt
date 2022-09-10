package com.example.allaboutdbd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_killer_list.*
import kotlinx.android.synthetic.main.list_entity.view.*

class KillerListActivity : AppCompatActivity() {

    val killerList = mutableListOf("Nurse", "Blight")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_killer_list)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        // Set layout manager for recycler view
        val layoutManager = LinearLayoutManager(this@KillerListActivity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        // Set layout manager of recycler view to layoutManager that just created
        rv_killerlist.layoutManager = layoutManager
        rv_killerlist.adapter = MyAdaptor()
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val portrait = itemView.iv_portrait
        val perks = mutableListOf(itemView.iv_perk1, itemView.iv_perk2, itemView.iv_perk3)
    }

    inner class MyAdaptor : RecyclerView.Adapter<MyViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            return MyViewHolder(LayoutInflater.from(this@KillerListActivity).inflate(R.layout.list_entity, parent, false))
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            // Start from here
        }

        override fun getItemCount(): Int {
            return killerList.size
        }
    }
}