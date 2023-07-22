package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var rvTense: RecyclerView
    private val list = ArrayList<tense>()
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rvTense = findViewById(R.id.materi)
        rvTense.setHasFixedSize(true)

        list.addAll(getListTense)
        showRecyclerList()

        supportActionBar?.title = "Materi"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setLogo(R.drawable.ic_back)
        supportActionBar?.setDisplayUseLogoEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    private val getListTense: ArrayList<tense>
        get() {
            val dataName = resources.getStringArray(R.array.data_name)
            val datafoto = resources.obtainTypedArray(R.array.data_foto)

            val dataMateri = resources.getStringArray(R.array.tenses)
            val dataContoh = resources.getStringArray(R.array.contoh)
            val listTense = ArrayList<tense>()
            for (i in dataName.indices) {
                val tense =
                    tense(dataName[i], datafoto.getResourceId(i, -1), dataMateri[i], dataContoh[i])

                listTense.add(tense)
            }
            return listTense
        }


    private fun showRecyclerList() {
        rvTense.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = listAdapter(list)
        rvTense.adapter = listHeroAdapter
        listHeroAdapter.setOnItemClickCallback(object : listAdapter.OnItemClickCallback {
            override fun onItemClicked(data: tense) {
                showSelectedHero(data)
            }
        })
    }

    private fun showSelectedHero(hero: tense) {
        val intent = Intent(this@MainActivity, Materi::class.java)
        intent.putExtra(Materi.EXTRA_MATERI, hero)
        intent.putExtra(Materi.EXTRA_NAME, hero.name)
        startActivity(intent)
    }

}