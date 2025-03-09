package com.example.myapplication2;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication2.databinding.ActivityMainBinding;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvtense;
    private final ArrayList<tense> list = new ArrayList<>();
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        rvtense = findViewById(R.id.materi);
        rvtense.setHasFixedSize(true);

        list.addAll(getListtense());
        showRecyclerList();

        setSupportActionBar(binding.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    private ArrayList<tense> getListtense() {
        String[] dataName = getResources().getStringArray(R.array.data_name);
        TypedArray dataFoto = getResources().obtainTypedArray(R.array.data_foto);
        String[] dataMateri = getResources().getStringArray(R.array.tenses);
        String[] dataContoh = getResources().getStringArray(R.array.contoh);

        ArrayList<tense> listtense = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++) {
            tense tense = new tense(dataName[i], dataFoto.getResourceId(i, -1), dataMateri[i], dataContoh[i]);
            listtense.add(tense);
        }
        dataFoto.recycle();
        return listtense;
    }

    private void showRecyclerList() {
        rvtense.setLayoutManager(new LinearLayoutManager(this));
        listAdapter listHeroAdapter = new listAdapter(list);
        rvtense.setAdapter(listHeroAdapter);
        listHeroAdapter.setOnItemClickCallback(this::showSelectedHero);
    }

    private void showSelectedHero(tense hero) {
        Intent intent;
        if (hero.getName().equals("Metamorfosis Sempurna")) {
            intent = new Intent(MainActivity.this, Materi.class);
        } else if (hero.getName().equals("Metamorfosis Tidak Sempurna")) {
            intent = new Intent(MainActivity.this, Materi2.class);
        } else {
            intent = new Intent(MainActivity.this, Materi3.class);
        }
        intent.putExtra(Materi.EXTRA_MATERI, hero);
        intent.putExtra(Materi.EXTRA_NAME, hero.getName());
        startActivity(intent);
    }
}
