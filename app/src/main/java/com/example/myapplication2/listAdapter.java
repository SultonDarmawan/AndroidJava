package com.example.myapplication2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class listAdapter extends RecyclerView.Adapter<listAdapter.ListViewHolder> {
    private ArrayList<tense> listtense;
    private OnItemClickCallback onItemClickCallback;

    public listAdapter(ArrayList<tense> listtense) {
        this.listtense = listtense;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_material, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        tense tense = listtense.get(position);
        holder.imgPhoto.setImageResource(tense.getFoto());
        holder.tvName.setText(tense.getName());

        holder.itemView.setOnClickListener(v -> {
            if (onItemClickCallback != null) {
                onItemClickCallback.onItemClicked(listtense.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listtense.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.iv_material);
            tvName = itemView.findViewById(R.id.tv_title_material);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(tense data);
    }
}