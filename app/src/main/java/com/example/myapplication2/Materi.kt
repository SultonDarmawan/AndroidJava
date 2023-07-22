package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.myapplication2.databinding.ActivityMateriBinding

class Materi : AppCompatActivity() {

    private lateinit var binding: ActivityMateriBinding
    private lateinit var name: String

    companion object {
        const val EXTRA_MATERI = "extra_materi"
        const val EXTRA_NAME = "name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMateriBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setData()

        name = intent.getStringExtra(EXTRA_NAME).toString()
        supportActionBar?.title = name
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setLogo(R.drawable.ic_back)
        supportActionBar?.setDisplayUseLogoEnabled(true)

        binding.btnLat.setOnClickListener{
            if (name == "Present Tense"){
                val intent = Intent(this@Materi, LatPresent::class.java)
                startActivity(intent)
            } else if (name == "Past Tense") {
                val intent = Intent(this@Materi, LatPast::class.java)
                startActivity(intent)
            } else{
                val intent = Intent(this@Materi, LatFuture::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }


    private fun setData() {
        val dataMateri = intent.getParcelableExtra<tense>(EXTRA_MATERI) as tense
        with(binding) {

            materi.text = dataMateri.name
            penjelasan.text = dataMateri.materi
            materiContoh.text = dataMateri.contoh
            imageView3.setImageResource(dataMateri.foto)
        }
    }
}