package com.example.myapplication2;

import android.os.Parcel;
import android.os.Parcelable;

public class tense implements Parcelable {
    private String name;
    private int foto;
    private String materi;
    private String contoh;

    public tense(String name, int foto, String materi, String contoh) {
        this.name = name;
        this.foto = foto;
        this.materi = materi;
        this.contoh = contoh;
    }

    protected tense(Parcel in) {
        name = in.readString();
        foto = in.readInt();
        materi = in.readString();
        contoh = in.readString();
    }

    public static final Creator<tense> CREATOR = new Creator<tense>() {
        @Override
        public tense createFromParcel(Parcel in) {
            return new tense(in);
        }

        @Override
        public tense[] newArray(int size) {
            return new tense[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(foto);
        parcel.writeString(materi);
        parcel.writeString(contoh);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getMateri() {
        return materi;
    }

    public void setMateri(String materi) {
        this.materi = materi;
    }

    public String getContoh() {
        return contoh;
    }

    public void setContoh(String contoh) {
        this.contoh = contoh;
    }
}
