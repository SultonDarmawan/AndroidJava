/*
 * Decompiled with CFR 0.150.
 *
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.LayoutInflater
 *  android.view.View
 *  androidx.appcompat.app.ActionBar
 *  androidx.appcompat.app.AppCompatActivity
 *  com.example.myapplication2.databinding.ActivityMateri3Binding
 */
package com.example.myapplication2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication2.databinding.ActivityMateri3Binding;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2={"Lcom/example/myapplication2/Materi3;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/myapplication2/databinding/ActivityMateri3Binding;", "name", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "setData", "Companion", "app_debug"})
public final class Materi3
        extends AppCompatActivity {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private ActivityMateri3Binding binding;
    private String name;
    @NotNull
    public static final String EXTRA_MATERI = "extra_materi";
    @NotNull
    public static final String EXTRA_NAME = "name";

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        ActivityMateri3Binding activityMateri3Binding;
        super.onCreate(savedInstanceState);
        ActivityMateri3Binding activityMateri3Binding2 = ActivityMateri3Binding.inflate((LayoutInflater)this.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue((Object)activityMateri3Binding2, "inflate(layoutInflater)");
        this.binding = activityMateri3Binding2;
        ActivityMateri3Binding activityMateri3Binding3 = this.binding;
        if (activityMateri3Binding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMateri3Binding3 = null;
        }
        this.setContentView((View)activityMateri3Binding3.getRoot());
        this.setData();

        ActivityMateri3Binding activityMateri3Binding4 = this.binding;
        if (activityMateri3Binding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMateri3Binding4 = null;
        }
        this.setSupportActionBar(activityMateri3Binding4.toolbar);
        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        ActionBar actionBar2 = this.getSupportActionBar();
        if (actionBar2 != null) {
            actionBar2.setHomeButtonEnabled(true);
        }
        if ((activityMateri3Binding = this.binding) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMateri3Binding = null;
        }
        activityMateri3Binding.btnLat.setOnClickListener(arg_0 -> Materi3.onCreate$lambda$0(this, arg_0));
        activityMateri3Binding.imageView4.setOnClickListener(arg_0 -> Materi3.onCreate$lambda2$0(this, arg_0));
        activityMateri3Binding.imageView5.setOnClickListener(arg_0 -> Materi3.onCreate$lambda3$0(this, arg_0));
        activityMateri3Binding.imageView6.setOnClickListener(arg_0 -> Materi3.onCreate$lambda4$0(this, arg_0));
    }

    public boolean onSupportNavigateUp() {
        this.onBackPressed();
        return super.onSupportNavigateUp();
    }

    private final void setData() {
        Parcelable parcelable = this.getIntent().getParcelableExtra(EXTRA_MATERI);
        Intrinsics.checkNotNull((Object)parcelable, "null cannot be cast to non-null type com.example.myapplication2.tense");
        tense dataMateri = (tense)parcelable;
        ActivityMateri3Binding activityMateri3Binding = this.binding;
        if (activityMateri3Binding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMateri3Binding = null;
        }
        ActivityMateri3Binding $this$setData_u24lambda_u241 = activityMateri3Binding;
        boolean bl = false;
        $this$setData_u24lambda_u241.materi.setText((CharSequence)dataMateri.getName());
        $this$setData_u24lambda_u241.materi1.setText((CharSequence)dataMateri.getMateri());
        $this$setData_u24lambda_u241.materi2.setText((CharSequence)dataMateri.getContoh());
        $this$setData_u24lambda_u241.imageView3.setImageResource(dataMateri.getFoto());
        this.name = dataMateri.getName();
    }

    private static final void onCreate$lambda$0(Materi3 this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intent intent = new Intent((Context)this$0, LatFuture.class);
        this$0.startActivity(intent);
    }

    private static final void onCreate$lambda2$0(Materi3 this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intent intent = new Intent((Context)this$0, AnimasiKucing.class);
        this$0.startActivity(intent);
    }


    private static final void onCreate$lambda3$0(Materi3 this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intent intent = new Intent((Context)this$0, AnimasiSapi.class);
        this$0.startActivity(intent);
    }


    private static final void onCreate$lambda4$0(Materi3 this$0, View it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intent intent = new Intent((Context)this$0, AnimasiAyam.class);
        this$0.startActivity(intent);
    }

    @Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2={"Lcom/example/myapplication2/Materi3$Companion;", "", "()V", "EXTRA_MATERI", "", "EXTRA_NAME", "app_debug"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
