/*
 * Decompiled with CFR 0.150.
 *
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  androidx.appcompat.app.AppCompatActivity
 *  com.example.myapplication2.databinding.ActivityAboutBinding
 */
package com.example.myapplication2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication2.databinding.ActivityAboutBinding;

public class AboutActivity
        extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        ActivityAboutBinding binding = ActivityAboutBinding.inflate((LayoutInflater)this.getLayoutInflater());
        super.onCreate(savedInstanceState);
        this.setContentView((View)binding.getRoot());
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().setTitle((CharSequence)"About");
            this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            this.getSupportActionBar().setLogo(R.drawable.ic_back);
            this.getSupportActionBar().setDisplayUseLogoEnabled(true);
        }
    }

    public boolean onSupportNavigateUp() {
        this.onBackPressed();
        return super.onSupportNavigateUp();
    }
}
