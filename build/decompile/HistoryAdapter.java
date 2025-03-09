/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 */
package com.example.myapplication2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication2.QuizResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2={"Lcom/example/myapplication2/HistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myapplication2/HistoryAdapter$ViewHolder;", "quizHistoryList", "", "Lcom/example/myapplication2/QuizResult;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class HistoryAdapter
extends RecyclerView.Adapter<ViewHolder> {
    @NotNull
    private final List<QuizResult> quizHistoryList;

    public HistoryAdapter(@NotNull List<QuizResult> quizHistoryList) {
        Intrinsics.checkNotNullParameter(quizHistoryList, "quizHistoryList");
        this.quizHistoryList = quizHistoryList;
    }

    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter((Object)parent, "parent");
        View view = LayoutInflater.from((Context)parent.getContext()).inflate(2131558457, parent, false);
        Intrinsics.checkNotNullExpressionValue((Object)view, "view");
        return new ViewHolder(view);
    }

    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter((Object)holder, "holder");
        QuizResult quizResult = this.quizHistoryList.get(position);
        int noUrut = position + 1;
        holder.bindData(quizResult, noUrut);
    }

    public int getItemCount() {
        return this.quizHistoryList.size();
    }

    @Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2={"Lcom/example/myapplication2/HistoryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/myapplication2/HistoryAdapter;Landroid/view/View;)V", "textViewDate", "Landroid/widget/TextView;", "textViewNoUrut", "textViewScore", "bindData", "", "quizResult", "Lcom/example/myapplication2/QuizResult;", "noUrut", "", "app_debug"})
    public final class ViewHolder
    extends RecyclerView.ViewHolder {
        @NotNull
        private final TextView textViewNoUrut;
        @NotNull
        private final TextView textViewScore;
        @NotNull
        private final TextView textViewDate;

        public ViewHolder(View itemView) {
            Intrinsics.checkNotNullParameter((Object)itemView, "itemView");
            super(itemView);
            View view = itemView.findViewById(2131362279);
            Intrinsics.checkNotNullExpressionValue((Object)view, "itemView.findViewById(R.id.textViewNoUrut)");
            this.textViewNoUrut = (TextView)view;
            View view2 = itemView.findViewById(2131362280);
            Intrinsics.checkNotNullExpressionValue((Object)view2, "itemView.findViewById(R.id.textViewScore)");
            this.textViewScore = (TextView)view2;
            View view3 = itemView.findViewById(2131362278);
            Intrinsics.checkNotNullExpressionValue((Object)view3, "itemView.findViewById(R.id.textViewDate)");
            this.textViewDate = (TextView)view3;
        }

        public final void bindData(@NotNull QuizResult quizResult, int noUrut) {
            Intrinsics.checkNotNullParameter(quizResult, "quizResult");
            this.textViewNoUrut.setText((CharSequence)("Nomor Pengerjaan : " + noUrut));
            this.textViewScore.setText((CharSequence)("Score: " + quizResult.getScore() + " dari total 15 soal"));
            this.textViewDate.setText((CharSequence)("Date: " + quizResult.getDate() + ", Time: " + quizResult.getTime()));
        }
    }
}
