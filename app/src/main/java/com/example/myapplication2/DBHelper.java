package com.example.myapplication2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Siswa.db";
    public static final String TABLE_NAME = "siswa";
    public static final int DATABASE_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE siswa (" +
                "nis TEXT PRIMARY KEY," +
                "nama TEXT," +
                "kelas TEXT," +
                "jenis_kelamin TEXT)");

        // Data otomatis dimasukkan saat database dibuat
        db.execSQL("INSERT INTO siswa (nis, nama, kelas, jenis_kelamin) VALUES " +
                "('12345', 'Budi', 'X IPA 1', 'Laki-laki')," +
                "('67890', 'Siti', 'X IPA 2', 'Perempuan')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS siswa");
        onCreate(db);
    }

    // Fungsi cek login
    public Cursor getUserByNis(String nis) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery("SELECT * FROM siswa WHERE nis = ?", new String[]{nis});
    }

    public String getNamaByNis(String nis) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT nama FROM siswa WHERE nis = ?", new String[]{nis});
        if (cursor.moveToFirst()) {
            String nama = cursor.getString(0);
            cursor.close();
            return nama;
        }
        cursor.close();
        return "-";
    }

    public String getKelasByNis(String nis) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT kelas FROM siswa WHERE nis = ?", new String[]{nis});
        if (cursor.moveToFirst()) {
            String kelas = cursor.getString(0);
            cursor.close();
            return kelas;
        }
        cursor.close();
        return "-";
    }
}
