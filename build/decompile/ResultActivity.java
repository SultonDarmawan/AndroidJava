/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  androidx.appcompat.app.AppCompatActivity
 *  com.example.myapplication2.databinding.ActivityResultBinding
 */
package com.example.myapplication2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication2.HomeActivity;
import com.example.myapplication2.databinding.ActivityResultBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2={"Lcom/example/myapplication2/ResultActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/myapplication2/databinding/ActivityResultBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class ResultActivity
extends AppCompatActivity {
    private ActivityResultBinding binding;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityResultBinding activityResultBinding = ActivityResultBinding.inflate((LayoutInflater)this.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue((Object)activityResultBinding, "inflate(layoutInflater)");
        this.binding = activityResultBinding;
        ActivityResultBinding activityResultBinding2 = this.binding;
        if (activityResultBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityResultBinding2 = null;
        }
        this.setContentView((View)activityResultBinding2.getRoot());
        int totalQuestions = this.getIntent().getIntExtra("total_question", 0);
        int totalScores = this.getIntent().getIntExtra("score", 0);
        ActivityResultBinding activityResultBinding3 = this.binding;
        if (activityResultBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityResultBinding3 = null;
        }
        activityResultBinding3.tvScore.setText((CharSequence)("Your score is " + totalScores + " out of " + totalQuestions));
        ActivityResultBinding activityResultBinding4 = this.binding;
        if (activityResultBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityResultBinding4 = null;
        }
        activityResultBinding4.btnFinish.setOnClickListener(arg_0 -> ResultActivity.onCreate$lambda$0(this, arg_0));
    }

    private static final void onCreate$lambda$0(ResultActivity this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        this$0.startActivity(new Intent((Context)this$0, HomeActivity.class));
        this$0.finish();
    }
}
