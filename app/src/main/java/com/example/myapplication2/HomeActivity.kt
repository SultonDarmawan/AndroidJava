package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication2.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnMateri.setOnClickListener {
            val intent = Intent(this@HomeActivity, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnQuiz.setOnClickListener {
            val intent = Intent(this@HomeActivity, QuestionActivity::class.java)
            startActivity(intent)
        }
        binding.btnHistory.setOnClickListener {
            startActivity(Intent(this, HistoryActivity::class.java))
        }
        binding.btnAbout.setOnClickListener {
            val intent = Intent(this@HomeActivity, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}