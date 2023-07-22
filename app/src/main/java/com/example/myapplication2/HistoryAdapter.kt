package com.example.myapplication2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HistoryAdapter(private val quizHistoryList: List<QuizResult>) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_history, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val quizResult = quizHistoryList[position]
        val noUrut = position + 1 // Nomor urut dimulai dari 1 (0-based index)
        holder.bindData(quizResult, noUrut)
    }

    override fun getItemCount(): Int {
        return quizHistoryList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textViewNoUrut: TextView = itemView.findViewById(R.id.textViewNoUrut)
        private val textViewScore: TextView = itemView.findViewById(R.id.textViewScore)
        private val textViewDate: TextView = itemView.findViewById(R.id.textViewDate)

        fun bindData(quizResult: QuizResult, noUrut: Int) {
            textViewNoUrut.text = "Nomo Pengerjaan : $noUrut"
            textViewScore.text = "Score: ${quizResult.score} dari total 10 soal"
            textViewDate.text = "Date: ${quizResult.date}, Time: ${quizResult.time}"
        }
    }
}
