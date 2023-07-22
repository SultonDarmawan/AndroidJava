package com.example.myapplication2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class listAdapter(private val listTense: ArrayList<tense>) : RecyclerView.Adapter<listAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_material, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, foto) = listTense[position]

        holder.imgPhoto.setImageResource(foto)
        holder.tvName.text = name

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listTense[holder.adapterPosition])
        }

    }

    override fun getItemCount(): Int = listTense.size

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.iv_material)
        val tvName: TextView = itemView.findViewById(R.id.tv_title_material)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: tense)
    }
}