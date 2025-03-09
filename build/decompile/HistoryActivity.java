/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.os.Bundle
 *  android.view.View
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 */
package com.example.myapplication2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication2.HistoryAdapter;
import com.example.myapplication2.QuizResult;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014\u00a8\u0006\f"}, d2={"Lcom/example/myapplication2/HistoryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "getQuizHistory", "", "Lcom/example/myapplication2/QuizResult;", "context", "Landroid/content/Context;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class HistoryActivity
extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(2131558429);
        List<QuizResult> quizHistoryData = this.getQuizHistory((Context)this);
        View view = this.findViewById(2131362173);
        Intrinsics.checkNotNullExpressionValue((Object)view, "findViewById(R.id.recyclerViewHistory)");
        RecyclerView recyclerViewHistory = (RecyclerView)view;
        recyclerViewHistory.setLayoutManager((RecyclerView.LayoutManager)new LinearLayoutManager((Context)this));
        HistoryAdapter historyAdapter = new HistoryAdapter(quizHistoryData);
        recyclerViewHistory.setAdapter((RecyclerView.Adapter)historyAdapter);
    }

    @NotNull
    public final List<QuizResult> getQuizHistory(@NotNull Context context) {
        List list;
        Intrinsics.checkNotNullParameter((Object)context, "context");
        SharedPreferences sharedPref = context.getSharedPreferences("quiz_history", 0);
        String jsonQuizHistory = sharedPref.getString("quiz_history", null);
        if (jsonQuizHistory != null) {
            Object t = new Gson().fromJson(jsonQuizHistory, new TypeToken<List<? extends QuizResult>>(){}.getType());
            Intrinsics.checkNotNullExpressionValue(t, "{\n            Gson().fro\u2026lt>>() {}.type)\n        }");
            list = (List)t;
        } else {
            list = CollectionsKt.emptyList();
        }
        return list;
    }
}
