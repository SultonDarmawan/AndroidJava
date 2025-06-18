package com.example.myapplication2;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText editNis;
    Button btnLogin;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // Pastikan layout sudah ada dan benar

        editNis = findViewById(R.id.editNis);
        btnLogin = findViewById(R.id.btnLogin);
        dbHelper = new DBHelper(this);

        btnLogin.setOnClickListener(v -> {
            String nis = editNis.getText().toString().trim();
            if (nis.isEmpty()) {
                Toast.makeText(this, "NIS tidak boleh kosong", Toast.LENGTH_SHORT).show();
                return;
            }

            Cursor cursor = dbHelper.getUserByNis(nis);
            if (cursor.moveToFirst()) {
                // Simpan NIS ke SharedPreferences
                getSharedPreferences("user_data", MODE_PRIVATE)
                        .edit()
                        .putString("nis", nis)
                        .apply();

                // Optional: bisa juga simpan data lain kalau perlu
                getSharedPreferences("user_data", MODE_PRIVATE)
                        .edit()
                        .putString("nama", cursor.getString(cursor.getColumnIndexOrThrow("nama")))
                        .putString("kelas", cursor.getString(cursor.getColumnIndexOrThrow("kelas")))
                        .putString("jenis_kelamin", cursor.getString(cursor.getColumnIndexOrThrow("jenis_kelamin")))
                        .apply();

                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                intent.putExtra("nis", nis);
                intent.putExtra("nama", cursor.getString(cursor.getColumnIndexOrThrow("nama")));
                intent.putExtra("kelas", cursor.getString(cursor.getColumnIndexOrThrow("kelas")));
                intent.putExtra("jenis_kelamin", cursor.getString(cursor.getColumnIndexOrThrow("jenis_kelamin")));
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(this, "NIS tidak ditemukan", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
