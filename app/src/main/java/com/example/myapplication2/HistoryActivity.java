package com.example.myapplication2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HistoryAdapter historyAdapter;
    private List<QuizResult> allQuizHistory;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);  // Buat layout ini dengan RecyclerView

        recyclerView = findViewById(R.id.recyclerViewHistory);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Ambil NIS user yang login dari SharedPreferences user_data
        SharedPreferences userPref = getSharedPreferences("user_data", Context.MODE_PRIVATE);
        String nisLogin = userPref.getString("nis", null);

        if (nisLogin == null) {
            // Jika NIS belum ada, bisa tampilkan pesan atau handle error
            nisLogin = "";  // default kosong
        }

        // Ambil semua quiz history dari SharedPreferences quiz_history
        SharedPreferences quizPref = getSharedPreferences("quiz_history", Context.MODE_PRIVATE);
        String jsonQuizHistory = quizPref.getString("quiz_history", null);

        if (jsonQuizHistory != null) {
            allQuizHistory = new Gson().fromJson(jsonQuizHistory, new TypeToken<List<QuizResult>>() {}.getType());
        } else {
            allQuizHistory = new ArrayList<>();
        }

        // Filter data hanya yang sesuai nisLogin
        List<QuizResult> filteredQuizHistory = new ArrayList<>();
        for (QuizResult quizResult : allQuizHistory) {
            if (nisLogin.equals(quizResult.getNis())) {
                filteredQuizHistory.add(quizResult);
            }
        }

        // Set adapter dengan data yang sudah difilter
        historyAdapter = new HistoryAdapter(this, filteredQuizHistory);
        recyclerView.setAdapter(historyAdapter);
    }
}
