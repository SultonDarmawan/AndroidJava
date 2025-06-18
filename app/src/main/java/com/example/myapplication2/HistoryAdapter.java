package com.example.myapplication2;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.ViewHolder> {
    private final List<QuizResult> quizHistoryList;
    private final Context context;

    public HistoryAdapter(Context context, List<QuizResult> quizHistoryList) {
        this.context = context;
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
        int noUrut = position + 1;
        holder.bindData(context, quizResult, noUrut);
    }

    @Override
    public int getItemCount() {
        return quizHistoryList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textViewNoUrut;
        private final TextView textViewNis;
        private final TextView textViewNama;
        private final TextView textViewKelas;
        private final TextView textViewScore;
        private final TextView textViewDate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNoUrut = itemView.findViewById(R.id.textViewNoUrut);
            textViewNis = itemView.findViewById(R.id.textViewNis);
            textViewNama = itemView.findViewById(R.id.textViewNama);
            textViewKelas = itemView.findViewById(R.id.textViewKelas);
            textViewScore = itemView.findViewById(R.id.textViewScore);
            textViewDate = itemView.findViewById(R.id.textViewDate);
        }

        public void bindData(Context context, QuizResult quizResult, int noUrut) {
            DBHelper dbHelper = new DBHelper(context);

            String nis = quizResult.getNis();
            Log.d("HistoryAdapter", "NIS yang dipakai: " + nis);
            if (nis == null) nis = "";

            String nama = dbHelper.getNamaByNis(nis);
            if (nama == null) nama = "Nama tidak ditemukan";

            String kelas = dbHelper.getKelasByNis(nis);
            if (kelas == null) kelas = "-";

            textViewNoUrut.setText("Nomor Pengerjaan : " + noUrut);
            textViewNis.setText("NIS : " + nis);
            textViewNama.setText("Nama : " + nama);
            textViewKelas.setText("Kelas : " + kelas);
            textViewScore.setText("Score: " + quizResult.getScore() + " dari total 15 soal");
            textViewDate.setText("Tanggal: " + quizResult.getDate() + ", Pukul: " + quizResult.getTime());
        }
    }
}
