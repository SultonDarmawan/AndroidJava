package com.example.myapplication2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class HistoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        // Ambil data riwayat kuis dari SharedPreferences
        val quizHistoryData = getQuizHistory(this)

        // Inisialisasi RecyclerView dan adapter
        val recyclerViewHistory: RecyclerView = findViewById(R.id.recyclerViewHistory)
        recyclerViewHistory.layoutManager = LinearLayoutManager(this)
        val historyAdapter = HistoryAdapter(quizHistoryData)
        recyclerViewHistory.adapter = historyAdapter
    }

    // Fungsi getQuizHistory untuk mendapatkan daftar nilai kuis sebelumnya dari SharedPreferences
    fun getQuizHistory(context: Context): List<QuizResult> {
        val sharedPref = context.getSharedPreferences("quiz_history", Context.MODE_PRIVATE)
        val jsonQuizHistory = sharedPref.getString("quiz_history", null)
        return if (jsonQuizHistory != null) {
            Gson().fromJson(jsonQuizHistory, object : TypeToken<List<QuizResult>>() {}.type)
        } else {
            emptyList()
        }
    }
}
