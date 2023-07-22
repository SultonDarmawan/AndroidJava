package com.example.myapplication2

object QuestionLat {
    const val TOTAL_QUESTION_KEY: String = "total_question"
    const val SCORE_KEY: String = "score"


    //present
    private val objectId = arrayOf(1, 2, 3, 4, 5)

    private val objectQuestion = arrayOf(
        "I play football   \nTermasuk kedalam tenses manakah kalimat tersebut",
        "Present Tense adalah Tenses yang digunakan untuk menggambarkan",
        "Rumus dari present tense adalah",
        "jika menggunakan V + ing  \nTermasuk kedalam tenses apakah kalimat tersebut",
        "contoh dari kalimat present tense yang benar adalah",

        )

    private val objectOptionOne = arrayOf(
        "Present Tense",
        "Masa sekarang",
        "S + V1 + O",
        "Present Continous Tense",
        "I play football in field",
    )

    private val objectOptionTwo = arrayOf(
        "Past Tense",
        "Masa lampau",
        "S + V2 + O",
        "Future Tense",
        "I cooked a cake yesterday",

        )

    private val objectOptionThree = arrayOf(
        "Past Perfect Tense",
        "Masa depan",
        "S + V3 + O",
        "Past Tense",
        "i am playing football with my friends",

        )

    private val objectOptionFour = arrayOf(
        "Present Perfect Tense",
        "semua jawaban salah",
        "S + V1 + ing + O",
        "semua jawaban salah",
        "Mercury",

        )

    private val objectAnswer = arrayOf(1, 1, 1, 1, 1)

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
        "I cooked a cake yesterday  \nTermasuk kedalam tenses manakah kalimat tersebut",
        "Past Tense adalah Tenses yang digunakan untuk menggambarkan",
        "Rumus dari Past tense adalah",
        "I made a homework two days ago \nTermasuk kedalam tenses apakah kalimat tersebut",
        "contoh dari kalimat past  tense yang benar adalah",

        )

    private val objectOptionOne2 = arrayOf(
        "Past tense",
        "Masa lampau",
        "S + V2 + O",
        "Past tense",
        "I made a cake two days ago",
    )

    private val objectOptionTwo2 = arrayOf(
        "Present Tense",
        "Masa Sekarang",
        "S + V1 + O",
        "Future Tense",
        "I cook a cake ",

        )

    private val objectOptionThree2 = arrayOf(
        "Present continous tense",
        "a dan b salah",
        "S + V1 + ing + O",
        "Present Continous tense",
        "i am playing football with my friends",

        )

    private val objectOptionFour2 = arrayOf(
        "future tense",
        "Masa yang akan datang",
        "S + will + tobe + verb",
        "Semua jawaban salah",
        "Mercury",

        )

    private val objectAnswer2 = arrayOf(1, 1, 1, 1, 1)

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
        " 10 years Later  \nTermasuk kedalam tenses manakah kalimat tersebut",
        "Future Tense adalah Tenses yang digunakan untuk menggambarkan",
        "Rumus dari future tense adalah",
        "I will be a teacher \nTermasuk kedalam tenses apakah kalimat tersebut",
        "contoh dari kalimat future tense yang benar adalah",

        )

    private val objectOptionOne3 = arrayOf(
        "Future Tense ",
        "Masa depan",
        "S + will/shall + subject + verb",
        "Future Tense",
        "I will be a teacher",
    )

    private val objectOptionTwo3 = arrayOf(
        "Present Tense",
        "Masa lampau",
        "S + V1 + O",
        "Past Tense",
        "I cooked a cake yesterday",

        )

    private val objectOptionThree3 = arrayOf(
        "Past Tense",
        "Masa sekarang",
        "S + V1 + ing + O",
        "Present Continous tense",
        "i am playing football with my friends",

        )

    private val objectOptionFour3 = arrayOf(
        "Present Perfect Tense",
        "Tidak ada jawaban yang benar",
        "S + V2 + O",
        "ketiga jawaban salah",
        "Mercury",

        )

    private val objectAnswer3 = arrayOf(1, 1, 1, 1, 1)

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