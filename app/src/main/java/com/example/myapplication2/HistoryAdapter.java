package com.example.myapplication2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.ViewHolder> {
    private final List<QuizResult> quizHistoryList;

    public HistoryAdapter(List<QuizResult> quizHistoryList) {
        this.quizHistoryList = quizHistoryList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_history, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        QuizResult quizResult = quizHistoryList.get(position);
        int noUrut = position + 1; // Nomor urut dimulai dari 1 (0-based index)
        holder.bindData(quizResult, noUrut);
    }

    @Override
    public int getItemCount() {
        return quizHistoryList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textViewNoUrut;
        private final TextView textViewScore;
        private final TextView textViewDate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNoUrut = itemView.findViewById(R.id.textViewNoUrut);
            textViewScore = itemView.findViewById(R.id.textViewScore);
            textViewDate = itemView.findViewById(R.id.textViewDate);
        }

        public void bindData(QuizResult quizResult, int noUrut) {
            textViewNoUrut.setText("Nomor Pengerjaan : " + noUrut);
            textViewScore.setText("Score: " + quizResult.getScore() + " dari total 15 soal");
            textViewDate.setText("Date: " + quizResult.getDate() + ", Time: " + quizResult.getTime());
        }
    }
}