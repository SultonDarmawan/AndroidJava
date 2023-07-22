package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication2.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding : ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAboutBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.title = "About"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setLogo(R.drawable.ic_back)
        supportActionBar?.setDisplayUseLogoEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}