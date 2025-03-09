/*
 * Decompiled with CFR 0.150.
 */
package com.example.myapplication2;

import com.example.myapplication2.Questions;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"J\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"J\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010\u00a8\u0006%"}, d2={"Lcom/example/myapplication2/QuestionLat;", "", "()V", "SCORE_KEY", "", "TOTAL_QUESTION_KEY", "objectAnswer", "", "", "[Ljava/lang/Integer;", "objectAnswer2", "objectAnswer3", "objectId", "objectId2", "objectId3", "objectOptionFour", "[Ljava/lang/String;", "objectOptionFour2", "objectOptionFour3", "objectOptionOne", "objectOptionOne2", "objectOptionOne3", "objectOptionThree", "objectOptionThree2", "objectOptionThree3", "objectOptionTwo", "objectOptionTwo2", "objectOptionTwo3", "objectQuestion", "objectQuestion2", "objectQuestion3", "getQuestions", "Ljava/util/ArrayList;", "Lcom/example/myapplication2/Questions;", "Lkotlin/collections/ArrayList;", "getQuestions2", "getQuestions3", "app_debug"})
public final class QuestionLat {
    @NotNull
    public static final QuestionLat INSTANCE = new QuestionLat();
    @NotNull
    public static final String TOTAL_QUESTION_KEY = "total_question";
    @NotNull
    public static final String SCORE_KEY = "score";
    @NotNull
    private static final Integer[] objectId;
    @NotNull
    private static final String[] objectQuestion;
    @NotNull
    private static final String[] objectOptionOne;
    @NotNull
    private static final String[] objectOptionTwo;
    @NotNull
    private static final String[] objectOptionThree;
    @NotNull
    private static final String[] objectOptionFour;
    @NotNull
    private static final Integer[] objectAnswer;
    @NotNull
    private static final Integer[] objectId2;
    @NotNull
    private static final String[] objectQuestion2;
    @NotNull
    private static final String[] objectOptionOne2;
    @NotNull
    private static final String[] objectOptionTwo2;
    @NotNull
    private static final String[] objectOptionThree2;
    @NotNull
    private static final String[] objectOptionFour2;
    @NotNull
    private static final Integer[] objectAnswer2;
    @NotNull
    private static final Integer[] objectId3;
    @NotNull
    private static final String[] objectQuestion3;
    @NotNull
    private static final String[] objectOptionOne3;
    @NotNull
    private static final String[] objectOptionTwo3;
    @NotNull
    private static final String[] objectOptionThree3;
    @NotNull
    private static final String[] objectOptionFour3;
    @NotNull
    private static final Integer[] objectAnswer3;

    private QuestionLat() {
    }

    @NotNull
    public final ArrayList<Questions> getQuestions() {
        ArrayList<Questions> questionList = new ArrayList<Questions>();
        int n = objectId.length;
        for (int position = 0; position < n; ++position) {
            Questions question = new Questions(0, null, null, null, null, null, 0, 127, null);
            question.setId(objectId[position]);
            question.setQuestion(objectQuestion[position]);
            question.setOptionOne(objectOptionOne[position]);
            question.setOptionTwo(objectOptionTwo[position]);
            question.setOptionThree(objectOptionThree[position]);
            question.setOptionFour(objectOptionFour[position]);
            question.setAnswer(objectAnswer[position]);
            questionList.add(question);
        }
        return questionList;
    }

    @NotNull
    public final ArrayList<Questions> getQuestions2() {
        ArrayList<Questions> questionList = new ArrayList<Questions>();
        int n = objectId2.length;
        for (int position = 0; position < n; ++position) {
            Questions question = new Questions(0, null, null, null, null, null, 0, 127, null);
            question.setId(objectId2[position]);
            question.setQuestion(objectQuestion2[position]);
            question.setOptionOne(objectOptionOne2[position]);
            question.setOptionTwo(objectOptionTwo2[position]);
            question.setOptionThree(objectOptionThree2[position]);
            question.setOptionFour(objectOptionFour2[position]);
            question.setAnswer(objectAnswer2[position]);
            questionList.add(question);
        }
        return questionList;
    }

    @NotNull
    public final ArrayList<Questions> getQuestions3() {
        ArrayList<Questions> questionList = new ArrayList<Questions>();
        int n = objectId3.length;
        for (int position = 0; position < n; ++position) {
            Questions question = new Questions(0, null, null, null, null, null, 0, 127, null);
            question.setId(objectId3[position]);
            question.setQuestion(objectQuestion3[position]);
            question.setOptionOne(objectOptionOne3[position]);
            question.setOptionTwo(objectOptionTwo3[position]);
            question.setOptionThree(objectOptionThree3[position]);
            question.setOptionFour(objectOptionFour3[position]);
            question.setAnswer(objectAnswer3[position]);
            questionList.add(question);
        }
        return questionList;
    }

    static {
        Object[] arrobject = new Integer[]{1, 2, 3, 4, 5};
        objectId = arrobject;
        arrobject = new String[]{"Proses pertumbuhan dan perkembangan makhluk hidup mulai dari lahir atau menetas hingga dewasa disebut ?", "Tahapan daur hidup kumbang setelah dari telur adalah menjadi ?", "Metamorfosis tidak sempurna tidak mengalami masa ", "Perubahan bentuk dalam siklus kehidupan hewan di sebut", "Hewan berikut ini yang mengalami metamorfosis tidak sempurna adalah"};
        objectQuestion = arrobject;
        arrobject = new String[]{"Daur hidup", "kepompong", "Larva", "Daur hidup", "Nyamuk"};
        objectOptionOne = arrobject;
        arrobject = new String[]{"Perkembangbiakan", "Larva", "Telur", "Perkembangbiakan", "Capung"};
        objectOptionTwo = arrobject;
        arrobject = new String[]{"Metamorfosis", "kupa", "nimfa", "Metamorfosis", "Katak"};
        objectOptionThree = arrobject;
        arrobject = new String[]{"Pertumbuhan", "Kumbang Dewasa", "Pupa", "Pertumbuhan", "Kumbang"};
        objectOptionFour = arrobject;
        arrobject = new Integer[]{1, 2, 4, 3, 2};
        objectAnswer = arrobject;
        arrobject = new Integer[]{1, 2, 3, 4, 5};
        objectId2 = arrobject;
        arrobject = new String[]{"Hewan yang mengalami metamorfosis sempurna, kecuali", "Hewan yang daur hidupnya mengalami metamorfosis adalah", "Nama lain dari pupa adalah", "Berikut ini hewan yang mengalami metamorfosis sempurna adalah", "Daur hidup ayam dimulai saat "};
        objectQuestion2 = arrobject;
        arrobject = new String[]{"Kupu-kupu", "Cicak", "Larva", "kecoa dan jangkrik", "Kelahiran dari perut induknya"};
        objectOptionOne2 = arrobject;
        arrobject = new String[]{"Katak", "Capung", "Ulat", "Nyamuk dan Belalang", "Menetas dari telur"};
        objectOptionTwo2 = arrobject;
        arrobject = new String[]{"Lalat", "Ular", "Kepompong", "nyamuk dan kupu-kupu", "Membelah dir"};
        objectOptionThree2 = arrobject;
        arrobject = new String[]{"Belalang", "Ayam", "Telur", "Katak dan Belalang", "Bertunas"};
        objectOptionFour2 = arrobject;
        arrobject = new Integer[]{4, 2, 3, 3, 2};
        objectAnswer2 = arrobject;
        arrobject = new Integer[]{1, 2, 3, 4, 5};
        objectId3 = arrobject;
        arrobject = new String[]{"Yang merupakan proses daur hidup pada nyamuk adalah", "Berikut ini hewan yang mengalami tahap jentik-jentik dalam daur hidupnya adalah", "Ulat kemudian menjadi", "Kecebong bernafas dengan", "Kupu-kupu dalam daur hidupnya akan dikeluarkan dari"};
        objectQuestion3 = arrobject;
        arrobject = new String[]{"Telur \u2013 pupa \u2013 jentik-jentik \u2013 nyamuk", "Nyamuk ", "Kupu-kupu dewasa", "Trakhea", "Nimfa"};
        objectOptionOne3 = arrobject;
        arrobject = new String[]{"Telur \u2013 belatung \u2013 pupa \u2013 nyamuk", "Kecoa", "Nimfa", "Insang", "Ulat"};
        objectOptionTwo3 = arrobject;
        arrobject = new String[]{"Telur \u2013 jentik-jentik \u2013 kecebong \u2013 nyamuk", "Katak", "Larva", "Paru-paru", "Telur"};
        objectOptionThree3 = arrobject;
        arrobject = new String[]{"Telur \u2013 jentik-jentik \u2013 pupa \u2013 nyamuk", "Lalat", "Kepompong", "Kulit", "Kepompong"};
        objectOptionFour3 = arrobject;
        arrobject = new Integer[]{4, 1, 4, 2, 4};
        objectAnswer3 = arrobject;
    }
}
