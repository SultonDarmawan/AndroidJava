package com.example.myapplication2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class AnimasiBelalang extends AppCompatActivity {
    private VideoView videoView;
    private String videoPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animasi_belalang);

        // Setup Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }

        // Setup VideoView
        videoView = findViewById(R.id.videoView);
        videoPath = "android.resource://" + getPackageName() + "/" + R.raw.metamorfosis2;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        // Tambahkan kontrol pemutaran
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

        // Tombol Fullscreen
        ImageButton btnFullscreen = findViewById(R.id.btnFullscreen);
        btnFullscreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnimasiBelalang.this, FullscreenVideoActivity.class);
                intent.putExtra("videoPath", videoPath);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
