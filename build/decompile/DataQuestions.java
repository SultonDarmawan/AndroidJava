/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.example.myapplication2.Questions
 */
package com.example.myapplication2;

import com.example.myapplication2.Questions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class DataQuestions {
    public static final String TOTAL_QUESTION_KEY = "total_question";
    public static final String SCORE_KEY = "score";
    private static final int[] objectId = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45};
    private static final String[] objectQuestion = new String[]{"Proses pertumbuhan dan perkembangan makhluk hidup mulai dari lahir atau menetas hingga dewasa disebut ?", "Tahapan daur hidup kumbang setelah dari telur adalah menjadi ?", "Metamorfosis tidak sempurna tidak mengalami masa ", "Perubahan bentuk dalam siklus kehidupan hewan di sebut", "Hewan berikut ini yang mengalami metamorfosis tidak sempurna adalah", "Hewan yang mengalami metamorfosis sempurna, kecuali", "Hewan yang daur hidupnya mengalami metamorfosis adalah", "Nama lain dari pupa adalah", "Berikut ini hewan yang mengalami metamorfosis sempurna adalah", "Daur hidup ayam dimulai saat ", "Yang merupakan proses daur hidup pada nyamuk adalah", "Berikut ini hewan yang mengalami tahap jentik-jentik dalam daur hidupnya adalah", "Ulat kemudian menjadi", "Kecebong bernafas dengan", "Kupu-kupu dalam daur hidupnya akan dikeluarkan dari", "Berikut ini yang merupakan tahapan metamorfosis kupu-kupu adalah", "Perhatikan soal di bawah ini:\n1. Ayam\n\n2. Harimau\n\n3. Singa\n\n4. Kelinci\n\n5. Sapi\n\nContoh hewan yang bisa diternak masyarakat dengan aman adalah", "Pada siklus hidup kupu-kupu yang dapat merugikan petani pada fase ", "Perhatikan hewan-hewan berikut ini\n\n1. Ayam\n\n2. Ulat sutera\n\n3. Sapi\n\n4. Domba\n\n5. Ikan\n\nHewan yang dapat dijadikan sumber bahan pangan adalah nomor", "Pelestarian hewan dan tumbuhan adalah tanggung jawab", "Kucing menghasilkan anak dengan cara", "Yang membedakan aantara kecoa muda dengan kecoa dewasa ialah", "Contoh Contoh hewan yang daur hidupnya tidak mengalami metamorfosis adalah", "Urutan daur hidup pada kupu-kupu adalah", "Hewan yang daur hidupnya mengalami metamorfosis tidak sempurna adalah capungkarena dalam daur hidupnya tidak ada fase", "Setelah memasuki tahap telur, tahapan selanjutnya dalam daur hidup kupu-kupu yaitu", "Tahap memakan daun dalam daur kupu-kupu terjadi pada masa", "Kupu-kupu mengalami tahap kepompong dalam daur hidupnya. Hewan yang memilikidaur hidup seperti kupu-kupu adalah", "Metamorfosis sempurna terjadi pada", "Tahapan daur hidup kecoak yang benar yaitu", "Perhatikan hewan-hewan berikut ini\n\n1. Ayam\n\n2. Ulat sutera\n\n3. Sapi\n\n4. Domba\n\n5. Ikan\n\nHewan yang dapat dijadikan sumber bahan pangan adalah nomor", "Pelestarian hewan dan tumbuhan adalah tanggung jawab", "Kucing menghasilkan anak dengan cara", "Yang membedakan aantara kecoa muda dengan kecoa dewasa ialah", "Contoh Contoh hewan yang daur hidupnya tidak mengalami metamorfosis adalah", "Urutan daur hidup pada kupu-kupu adalah", "Hewan yang daur hidupnya mengalami metamorfosis tidak sempurna adalah capungkarena dalam daur hidupnya tidak ada fase", "Tahapan daur hidup kumbang setelah dari telur adalah menjadi ?", "Metamorfosis tidak sempurna tidak mengalami masa ", "Perubahan bentuk dalam siklus kehidupan hewan di sebut", "Hewan berikut ini yang mengalami metamorfosis tidak sempurna adalah", "Hewan yang mengalami metamorfosis sempurna, kecuali", "Hewan yang daur hidupnya mengalami metamorfosis adalah", "Nama lain dari pupa adalah", "Berikut ini hewan yang mengalami metamorfosis sempurna adalah"};
    private static final String[] objectOptionOne = new String[]{"Daur hidup", "kepompong", "Larva", "Daur hidup", "Nyamuk", "Kupu-kupu", "Cicak", "Larva", "kecoa dan jangkrik", "Kelahiran dari perut induknya", "Telur \u2013 pupa \u2013 jentik-jentik \u2013 nyamuk", "Nyamuk ", "Kupu-kupu dewasa", "Trakhea", "Nimfa", "Telur - kepompong - larva - kupu-kupu", "1,2,3", "Kepompong", "1,2,3", "Pemerintah", "Bertelur ", "Kecoa muda dan kecoa dewasa memiliki kaki", "Kecoa", "Ulat \u2013 telur \u2013 kepompong \u2013 kupu-kupu", "Kepompong dan capung", "Pua", "telur", "semut", "belalang", "telur \u2013 nimfa \u2013 kecoak", "1,2,3", "Pemerintah", "Bertelur ", "Kecoa muda dan kecoa dewasa memiliki kaki", "Kecoa", "Ulat \u2013 telur \u2013 kepompong \u2013 kupu-kupu", "Kepompong dan capung", "kepompong", "Larva", "Daur hidup", "Nyamuk", "Kupu-kupu", "Cicak", "Larva", "kecoa dan jangkrik"};
    private static final String[] objectOptionTwo = new String[]{"Perkembangbiakan", "Larva", "Telur", "Perkembangbiakan", "Capung", "Katak", "Capung", "Ulat", "Nyamuk dan Belalang", "Menetas dari telur", "Telur \u2013 belatung \u2013 pupa \u2013 nyamuk", "Kecoa", "Nimfa", "Insang", "Ulat", "Telur - larva - pupa - kupu-kupu", "1,4,5", "Ulat", "1,3,5", "Presiden", "Beranak dan bertelur", "Kecoa dewasa tidak bersayap", "Kupu-kupu", "Telur \u2013 kepompong \u2013 ulat \u2013 kupu-kupu", "Ulat dan kempompong", "ulat", "kepompong", "nyamuk ", "kecoa", "telur \u2013 kecoak \u2013 nimfa", "1,3,5", "Presiden", "Beranak dan bertelur", "Kecoa dewasa tidak bersayap", "Kupu-kupu", "Telur \u2013 kepompong \u2013 ulat \u2013 kupu-kupu", "Ulat dan kempompong", "Larva", "Telur", "Perkembangbiakan", "Capung", "Katak", "Capung", "Ulat", "Nyamuk dan Belalang"};
    private static final String[] objectOptionThree = new String[]{"Metamorfosis", "kupa", "nimfa", "Metamorfosis", "Katak", "Lalat", "Ular", "Kepompong", "nyamuk dan kupu-kupu", "Membelah dir", "Telur \u2013 jentik-jentik \u2013 kecebong \u2013 nyamuk", "Katak", "Larva", "Paru-paru", "Telur", "Telur - jentik-jentik - larva - kupu-kupu", "2,3,5", "Telur", "2,3,4", "Kita semua", "Membelah diri", "Kecoa muda tidak bersayap", "Kucing", "Telur \u2013 ulat \u2013 kepompong \u2013 kupu-kupu", "Telur dan ulat", "kepompong", "Kupu-kupu dewasa", "kecoak ", "Nyamuk", "kecoak \u2013 nimfa \u2013 telur", "2,3,4", "Kita semua", "Membelah diri", "Kecoa muda tidak bersayap", "Kucing", "Telur \u2013 ulat \u2013 kepompong \u2013 kupu-kupu", "Telur dan ulat", "kupa", "nimfa", "Metamorfosis", "Katak", "Lalat", "Ular", "Kepompong", "nyamuk dan kupu-kupu"};
    private static final String[] objectOptionFour = new String[]{"Pertumbuhan", "Kumbang Dewasa", "Pupa", "Pertumbuhan", "Kumbang", "Belalang", "Ayam", "Telur", "Katak dan Belalang", "Bertunas", "Telur \u2013 jentik-jentik \u2013 pupa \u2013 nyamuk", "Lalat", "Kepompong", "Kulit", "Kepompong", "Telur - ulat - kepompong - kupu-kupu", "3,4,5", "Kupu-kupu", "1,2,5", "Petugas kabun Binatang", "Beranak ", "Kecoa muda tidak memiliki kaki", "Nyamuk ", "Kupu-kupu \u2013 ulat \u2013 telur \u2013 kepompong", "Nimfa dan kepompong", "kupu-kupu", "kepompong", "Belalang", "Kucing", "nimfa \u2013 telur \u2013 kecoak", "1,2,5", "Petugas kabun Binatang", "Beranak ", "Kecoa muda tidak memiliki kaki", "Nyamuk ", "Kupu-kupu \u2013 ulat \u2013 telur \u2013 kepompong", "Nimfa dan kepompong", "Kumbang Dewasa", "Pupa", "Pertumbuhan", "Kumbang", "Belalang", "Ayam", "Telur", "Katak dan Belalang"};
    private static final int[] objectAnswer = new int[]{1, 2, 4, 3, 2, 4, 2, 3, 3, 2, 4, 1, 4, 2, 4, 1, 2, 2, 2, 3, 4, 3, 3, 3, 2, 2, 2, 2, 3, 1, 2, 3, 4, 3, 3, 3, 2, 2, 4, 3, 2, 4, 2, 3, 3};

    public static ArrayList<Questions> getQuestions() {
        ArrayList<Questions> questionList = new ArrayList<Questions>();
        ArrayList<Integer> shuffledIndices = new ArrayList<Integer>();
        for (int i = 0; i < objectId.length; ++i) {
            shuffledIndices.add(i);
        }
        Collections.shuffle(shuffledIndices);
        List takenIndices = shuffledIndices.subList(0, 15);
        Iterator iterator = takenIndices.iterator();
        while (iterator.hasNext()) {
            int correctIndex;
            int index = (Integer)iterator.next();
            Questions question = new Questions();
            question.id = objectId[index];
            question.question = objectQuestion[index];
            ArrayList<String> options = new ArrayList<String>();
            options.add(objectOptionOne[index]);
            options.add(objectOptionTwo[index]);
            options.add(objectOptionThree[index]);
            options.add(objectOptionFour[index]);
            Collections.shuffle(options);
            question.optionOne = (String)options.get(0);
            question.optionTwo = (String)options.get(1);
            question.optionThree = (String)options.get(2);
            question.optionFour = (String)options.get(3);
            question.answer = correctIndex = options.indexOf(objectOptionOne[index]) + 1;
            questionList.add(question);
        }
        return questionList;
    }
}
