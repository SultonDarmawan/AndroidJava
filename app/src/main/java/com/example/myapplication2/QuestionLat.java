package com.example.myapplication2;

import java.util.ArrayList;

public class QuestionLat {
    public static final String TOTAL_QUESTION_KEY = "total_question";
    public static final String SCORE_KEY = "score";

    public static ArrayList<Questions> getQuestions() {
        int[] objectId = {1, 2, 3, 4, 5};
        String[] objectQuestion = {
                "Proses pertumbuhan dan perkembangan makhluk hidup mulai dari lahir atau menetas hingga dewasa disebut ?",
                "Tahapan daur hidup kumbang setelah dari telur adalah menjadi ?",
                "Metamorfosis tidak sempurna tidak mengalami masa ",
                "Perubahan bentuk dalam siklus kehidupan hewan di sebut",
                "Hewan berikut ini yang mengalami metamorfosis tidak sempurna adalah"
        };

        String[] objectOptionOne = {"Daur hidup", "kepompong", "Larva", "Daur hidup", "Nyamuk"};
        String[] objectOptionTwo = {"Perkembangbiakan", "Larva", "Telur", "Perkembangbiakan", "Capung"};
        String[] objectOptionThree = {"Metamorfosis", "kupa", "nimfa", "Metamorfosis", "Katak"};
        String[] objectOptionFour = {"Pertumbuhan", "Kumbang Dewasa", "Pupa", "Pertumbuhan", "Kumbang"};
        int[] objectAnswer = {1, 2, 4, 3, 2};

        ArrayList<Questions> questionList = new ArrayList<>();
        for (int i = 0; i < objectId.length; i++) {
            Questions question = new Questions();
            question.setId(objectId[i]);
            question.setQuestion(objectQuestion[i]);
            question.setOptionOne(objectOptionOne[i]);
            question.setOptionTwo(objectOptionTwo[i]);
            question.setOptionThree(objectOptionThree[i]);
            question.setOptionFour(objectOptionFour[i]);
            question.setAnswer(objectAnswer[i]);
            questionList.add(question);
        }
        return questionList;
    }

    public static ArrayList<Questions> getQuestions2() {
        int[] objectId = {1, 2, 3, 4, 5};
        String[] objectQuestion = {
                "Hewan yang mengalami metamorfosis sempurna, kecuali",
                "Hewan yang daur hidupnya mengalami metamorfosis adalah",
                "Nama lain dari pupa adalah",
                "Berikut ini hewan yang mengalami metamorfosis sempurna adalah",
                "Daur hidup ayam dimulai saat "
        };

        String[] objectOptionOne = {"Kupu-kupu", "Cicak", "Larva", "kecoa dan jangkrik", "Kelahiran dari perut induknya"};
        String[] objectOptionTwo = {"Katak", "Capung", "Ulat", "Nyamuk dan Belalang", "Menetas dari telur"};
        String[] objectOptionThree = {"Lalat", "Ular", "Kepompong", "nyamuk dan kupu-kupu", "Membelah diri"};
        String[] objectOptionFour = {"Belalang", "Ayam", "Telur", "Katak dan Belalang", "Bertunas"};
        int[] objectAnswer = {4, 2, 3, 3, 2};

        ArrayList<Questions> questionList = new ArrayList<>();
        for (int i = 0; i < objectId.length; i++) {
            Questions question = new Questions();
            question.setId(objectId[i]);
            question.setQuestion(objectQuestion[i]);
            question.setOptionOne(objectOptionOne[i]);
            question.setOptionTwo(objectOptionTwo[i]);
            question.setOptionThree(objectOptionThree[i]);
            question.setOptionFour(objectOptionFour[i]);
            question.setAnswer(objectAnswer[i]);
            questionList.add(question);
        }
        return questionList;
    }

    public static ArrayList<Questions> getQuestions3() {
        int[] objectId = {1, 2, 3, 4, 5};
        String[] objectQuestion = {
                "Yang merupakan proses daur hidup pada nyamuk adalah",
                "Berikut ini hewan yang mengalami tahap jentik-jentik dalam daur hidupnya adalah",
                "Ulat kemudian menjadi",
                "Kecebong bernafas dengan",
                "Kupu-kupu dalam daur hidupnya akan dikeluarkan dari"
        };

        String[] objectOptionOne = {"Telur – pupa – jentik-jentik – nyamuk", "Nyamuk", "Kupu-kupu dewasa", "Trakhea", "Nimfa"};
        String[] objectOptionTwo = {"Telur – belatung – pupa – nyamuk", "Kecoa", "Nimfa", "Insang", "Ulat"};
        String[] objectOptionThree = {"Telur – jentik-jentik – kecebong – nyamuk", "Katak", "Larva", "Paru-paru", "Telur"};
        String[] objectOptionFour = {"Telur – jentik-jentik – pupa – nyamuk", "Lalat", "Kepompong", "Kulit", "Kepompong"};
        int[] objectAnswer = {4, 1, 4, 2, 4};

        ArrayList<Questions> questionList = new ArrayList<>();
        for (int i = 0; i < objectId.length; i++) {
            Questions question = new Questions();
            question.setId(objectId[i]);
            question.setQuestion(objectQuestion[i]);
            question.setOptionOne(objectOptionOne[i]);
            question.setOptionTwo(objectOptionTwo[i]);
            question.setOptionThree(objectOptionThree[i]);
            question.setOptionFour(objectOptionFour[i]);
            question.setAnswer(objectAnswer[i]);
            questionList.add(question);
        }
        return questionList;
    }
}