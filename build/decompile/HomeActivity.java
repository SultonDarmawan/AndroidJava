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
 *  com.example.myapplication2.databinding.ActivityHomeBinding
 */
package com.example.myapplication2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication2.AboutActivity;
import com.example.myapplication2.HistoryActivity;
import com.example.myapplication2.MainActivity;
import com.example.myapplication2.QuestionActivity;
import com.example.myapplication2.databinding.ActivityHomeBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2={"Lcom/example/myapplication2/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/myapplication2/databinding/ActivityHomeBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class HomeActivity
extends AppCompatActivity {
    private ActivityHomeBinding binding;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityHomeBinding activityHomeBinding = ActivityHomeBinding.inflate((LayoutInflater)this.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue((Object)activityHomeBinding, "inflate(layoutInflater)");
        this.binding = activityHomeBinding;
        ActivityHomeBinding activityHomeBinding2 = this.binding;
        if (activityHomeBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHomeBinding2 = null;
        }
        this.setContentView((View)activityHomeBinding2.getRoot());
        ActivityHomeBinding activityHomeBinding3 = this.binding;
        if (activityHomeBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHomeBinding3 = null;
        }
        activityHomeBinding3.btnMateri.setOnClickListener(arg_0 -> HomeActivity.onCreate$lambda$0(this, arg_0));
        ActivityHomeBinding activityHomeBinding4 = this.binding;
        if (activityHomeBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHomeBinding4 = null;
        }
        activityHomeBinding4.btnQuiz.setOnClickListener(arg_0 -> HomeActivity.onCreate$lambda$1(this, arg_0));
        ActivityHomeBinding activityHomeBinding5 = this.binding;
        if (activityHomeBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHomeBinding5 = null;
        }
        activityHomeBinding5.btnHistory.setOnClickListener(arg_0 -> HomeActivity.onCreate$lambda$2(this, arg_0));
        ActivityHomeBinding activityHomeBinding6 = this.binding;
        if (activityHomeBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHomeBinding6 = null;
        }
        activityHomeBinding6.btnAbout.setOnClickListener(arg_0 -> HomeActivity.onCreate$lambda$3(this, arg_0));
    }

    private static final void onCreate$lambda$0(HomeActivity this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intent intent = new Intent((Context)this$0, MainActivity.class);
        this$0.startActivity(intent);
    }

    private static final void onCreate$lambda$1(HomeActivity this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intent intent = new Intent((Context)this$0, QuestionActivity.class);
        this$0.startActivity(intent);
    }

    private static final void onCreate$lambda$2(HomeActivity this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        this$0.startActivity(new Intent((Context)this$0, HistoryActivity.class));
    }

    private static final void onCreate$lambda$3(HomeActivity this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intent intent = new Intent((Context)this$0, AboutActivity.class);
        this$0.startActivity(intent);
    }
}
