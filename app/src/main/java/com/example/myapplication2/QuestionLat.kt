package com.example.myapplication2

object QuestionLat {
    const val TOTAL_QUESTION_KEY: String = "total_question"
    const val SCORE_KEY: String = "score"


    //present
    private val objectId = arrayOf(1, 2, 3, 4, 5)

    private val objectQuestion = arrayOf(
        "Proses pertumbuhan dan perkembangan makhluk hidup mulai dari lahir atau menetas hingga dewasa disebut ?",
        "Tahapan daur hidup kumbang setelah dari telur adalah menjadi ?",
        "Metamorfosis tidak sempurna tidak mengalami masa ",
        "Perubahan bentuk dalam siklus kehidupan hewan di sebut",
        "Hewan berikut ini yang mengalami metamorfosis tidak sempurna adalah",

        )

    private val objectOptionOne = arrayOf(
        "Daur hidup",
        "kepompong",
        "Larva",
        "Daur hidup",
        "Nyamuk",
    )

    private val objectOptionTwo = arrayOf(
        "Perkembangbiakan",
        "Larva",
        "Telur",
        "Perkembangbiakan",
        "Capung",

        )

    private val objectOptionThree = arrayOf(
        "Metamorfosis",
        "kupa",
        "nimfa",
        "Metamorfosis",
        "Katak",

        )

    private val objectOptionFour = arrayOf(
        "Pertumbuhan",
        "Kumbang Dewasa",
        "Pupa",
        "Pertumbuhan",
        "Kumbang",

        )

    private val objectAnswer = arrayOf(1, 2, 4, 3, 2)

    fun getQuestions(): ArrayList<Questions> {
        val questionList = ArrayList<Questions>()
        for(position in objectId.indices) {
            val question = Questions()

            question.id = objectId[position]
            question.question = objectQuestion[position]
            // TODO buat ambil gambar
//            if(position <= 7)
//                question.image = objectImage[position]
            question.optionOne = objectOptionOne[position]
            question.optionTwo = objectOptionTwo[position]
            question.optionThree = objectOptionThree[position]
            question.optionFour = objectOptionFour[position]
            question.answer = objectAnswer[position]

            questionList.add(question)
        }

        return questionList
    }

    //past
    private val objectId2 = arrayOf(1, 2, 3, 4, 5)

    private val objectQuestion2 = arrayOf(
        "Hewan yang mengalami metamorfosis sempurna, kecuali",
        "Hewan yang daur hidupnya mengalami metamorfosis adalah",
        "Nama lain dari pupa adalah",
        "Berikut ini hewan yang mengalami metamorfosis sempurna adalah",
        "Daur hidup ayam dimulai saat ",

        )

    private val objectOptionOne2 = arrayOf(
        "Kupu-kupu",
        "Cicak",
        "Larva",
        "kecoa dan jangkrik",
        "Kelahiran dari perut induknya",
    )

    private val objectOptionTwo2 = arrayOf(
        "Katak",
        "Capung",
        "Ulat",
        "Nyamuk dan Belalang",
        "Menetas dari telur",

        )

    private val objectOptionThree2 = arrayOf(
        "Lalat",
        "Ular",
        "Kepompong",
        "nyamuk dan kupu-kupu",
        "Membelah dir",

        )

    private val objectOptionFour2 = arrayOf(
        "Belalang",
        "Ayam",
        "Telur",
        "Katak dan Belalang",
        "Bertunas",

        )

    private val objectAnswer2 = arrayOf(4, 2, 3, 3, 2)

    fun getQuestions2(): ArrayList<Questions> {
        val questionList = ArrayList<Questions>()
        for(position in objectId2.indices) {
            val question = Questions()

            question.id = objectId2[position]
            question.question = objectQuestion2[position]
            // TODO buat ambil gambar
//            if(position <= 7)
//                question.image = objectImage[position]
            question.optionOne = objectOptionOne2[position]
            question.optionTwo = objectOptionTwo2[position]
            question.optionThree = objectOptionThree2[position]
            question.optionFour = objectOptionFour2[position]
            question.answer = objectAnswer2[position]

            questionList.add(question)
        }

        return questionList
    }

    //future
    private val objectId3 = arrayOf(1, 2, 3, 4, 5)

    private val objectQuestion3 = arrayOf(
        "Yang merupakan proses daur hidup pada nyamuk adalah",
        "Berikut ini hewan yang mengalami tahap jentik-jentik dalam daur hidupnya adalah",
        "Ulat kemudian menjadi",
        "Kecebong bernafas dengan",
        "Kupu-kupu dalam daur hidupnya akan dikeluarkan dari",

        )

    private val objectOptionOne3 = arrayOf(
        "Telur – pupa – jentik-jentik – nyamuk",
        "Nyamuk ",
        "Kupu-kupu dewasa",
        "Trakhea",
        "Nimfa",
    )

    private val objectOptionTwo3 = arrayOf(
        "Telur – belatung – pupa – nyamuk",
        "Kecoa",
        "Nimfa",
        "Insang",
        "Ulat",

        )

    private val objectOptionThree3 = arrayOf(
        "Telur – jentik-jentik – kecebong – nyamuk",
        "Katak",
        "Larva",
        "Paru-paru",
        "Telur",

        )

    private val objectOptionFour3 = arrayOf(
        "Telur – jentik-jentik – pupa – nyamuk",
        "Lalat",
        "Kepompong",
        "Kulit",
        "Kepompong",

        )

    private val objectAnswer3 = arrayOf(4, 1, 4, 2, 4)

    fun getQuestions3(): ArrayList<Questions> {
        val questionList = ArrayList<Questions>()
        for(position in objectId3.indices) {
            val question = Questions()

            question.id = objectId3[position]
            question.question = objectQuestion3[position]
            // TODO buat ambil gambar
//            if(position <= 7)
//                question.image = objectImage[position]
            question.optionOne = objectOptionOne3[position]
            question.optionTwo = objectOptionTwo3[position]
            question.optionThree = objectOptionThree3[position]
            question.optionFour = objectOptionFour3[position]
            question.answer = objectAnswer3[position]

            questionList.add(question)
        }

        return questionList
    }

}