package com.example.allaboutdbd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.allaboutdbd.databinding.ActivityKillerListBinding
import kotlinx.android.synthetic.main.activity_killer_list.*
import kotlinx.android.synthetic.main.list_entity.view.*

class KillerListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityKillerListBinding

    val killerList = listOf(
        Character("Trapper", mutableListOf()),
        Character("Wraith", mutableListOf()),
        Character("Hillbilly", mutableListOf()),
        Character("Nurse", mutableListOf()),
        Character("Shape", mutableListOf()),
        Character("Hag", mutableListOf())
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKillerListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        // Set layout manager for recycler view
        val layoutManager = LinearLayoutManager(this@KillerListActivity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        // Set layout manager of recycler view to layoutManager that just created
        rv_killerlist.layoutManager = LinearLayoutManager(this)
        rv_killerlist.adapter = MyAdaptor(killerList)
    }

    inner class CharacterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val portrait = itemView.iv_portrait
        val perks = mutableListOf(itemView.iv_perk1, itemView.iv_perk2, itemView.iv_perk3)

        fun bind(character: Character) {
            itemView.tv_name.text = character.name
            // no drawable data yet
        }
    }

    inner class MyAdaptor(private val characters: List<Character>)
        : RecyclerView.Adapter<CharacterViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
            return CharacterViewHolder(
                LayoutInflater.from(this@KillerListActivity).inflate(
                    R.layout.list_entity,
                    parent,
                    false
                )
            )
        }

        override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
            holder.bind(characters[position])
        }

        override fun getItemCount(): Int = killerList.size
    }
}