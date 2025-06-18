package com.example.myapplication2;

import androidx.annotation.NonNull;

public class QuizResult {

    private final int score;
    @NonNull
    private final String date;
    @NonNull
    private final String time;
    @NonNull
    private final String nis;

    public QuizResult(int score, @NonNull String date, @NonNull String time, @NonNull String nis) {
        if (date == null) throw new IllegalArgumentException("date cannot be null");
        if (time == null) throw new IllegalArgumentException("time cannot be null");
        if (nis == null) throw new IllegalArgumentException("nis cannot be null");
        this.score = score;
        this.date = date;
        this.time = time;
        this.nis = nis;
    }

    public int getScore() {
        return score;
    }

    @NonNull
    public String getDate() {
        return date;
    }

    @NonNull
    public String getTime() {
        return time;
    }

    @NonNull
    public String getNis() {
        return nis;
    }

    @NonNull
    @Override
    public String toString() {
        return "QuizResult(score=" + score + ", date=" + date + ", time=" + time + ", nis=" + nis + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof QuizResult)) return false;
        QuizResult other = (QuizResult) obj;
        return score == other.score &&
                date.equals(other.date) &&
                time.equals(other.time) &&
                nis.equals(other.nis);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(score);
        result = 31 * result + date.hashCode();
        result = 31 * result + time.hashCode();
        result = 31 * result + nis.hashCode();
        return result;
    }
}
