package com.example.myapplication2

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
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

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

        binding.btnLat.setOnClickListener{
            val intent = Intent(this@Materi, LatPast::class.java)
            startActivity(intent)
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
            materi1.text = dataMateri.materi
            materi2.text = dataMateri.contoh
            imageView3.setImageResource(dataMateri.foto)
        }

        // Tambahkan ini untuk menginisialisasi name
        name = dataMateri.name
    }

}