package com.example.myapplication2

object DataQuestions {
    const val TOTAL_QUESTION_KEY: String = "total_question"
    const val SCORE_KEY: String = "score"

    private val objectId = arrayOf(
        // Present Tense (ID 1-10)
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11, 12, 13, 14, 15,
        // Past Tense (ID 11-20)
        16, 17, 18, 19, 20,1, 22, 23, 24, 25, 26, 27, 28, 29, 30,
        // Future Tense (ID 21-30)
        31,32,33,34,35,36,37,38,39,40,41,42,43,44,45
    )

    private val objectQuestion = arrayOf(
        // Present Tense
        "Proses pertumbuhan dan perkembangan makhluk hidup mulai dari lahir atau menetas hingga dewasa disebut ?",
        "Tahapan daur hidup kumbang setelah dari telur adalah menjadi ?",
        "Metamorfosis tidak sempurna tidak mengalami masa ",
        "Perubahan bentuk dalam siklus kehidupan hewan di sebut",
        "Hewan berikut ini yang mengalami metamorfosis tidak sempurna adalah",
        "Hewan yang mengalami metamorfosis sempurna, kecuali",
        "Hewan yang daur hidupnya mengalami metamorfosis adalah",
        "Nama lain dari pupa adalah",
        "Berikut ini hewan yang mengalami metamorfosis sempurna adalah",
        "Daur hidup ayam dimulai saat ",
        "Yang merupakan proses daur hidup pada nyamuk adalah",
        "Berikut ini hewan yang mengalami tahap jentik-jentik dalam daur hidupnya adalah",
        "Ulat kemudian menjadi",
        "Kecebong bernafas dengan",
        "Kupu-kupu dalam daur hidupnya akan dikeluarkan dari",
        // ... add more present tense questions (10 in total)

        // Past Tense
        "Berikut ini yang merupakan tahapan metamorfosis kupu-kupu adalah",
        "Perhatikan soal di bawah ini:\n1. Ayam\n" +
                "\n" +
                "2. Harimau\n" +
                "\n" +
                "3. Singa\n" +
                "\n" +
                "4. Kelinci\n" +
                "\n" +
                "5. Sapi\n" +
                "\n" +
                "Contoh hewan yang bisa diternak masyarakat dengan aman adalah",
        "Pada siklus hidup kupu-kupu yang dapat merugikan petani pada fase ",
        "Perhatikan hewan-hewan berikut ini\n" +
                "\n" +
                "1. Ayam\n" +
                "\n" +
                "2. Ulat sutera\n" +
                "\n" +
                "3. Sapi\n" +
                "\n" +
                "4. Domba\n" +
                "\n" +
                "5. Ikan\n" +
                "\n" +
                "Hewan yang dapat dijadikan sumber bahan pangan adalah nomor",
        "Pelestarian hewan dan tumbuhan adalah tanggung jawab",
        "Kucing menghasilkan anak dengan cara",
        "Yang membedakan aantara kecoa muda dengan kecoa dewasa ialah",
        "Contoh Contoh hewan yang daur hidupnya tidak mengalami metamorfosis adalah",
        "Urutan daur hidup pada kupu-kupu adalah",
        "Hewan yang daur hidupnya mengalami metamorfosis tidak sempurna adalah capungkarena dalam daur hidupnya tidak ada fase",
        "Setelah memasuki tahap telur, tahapan selanjutnya dalam daur hidup kupu-kupu yaitu",
        "Tahap memakan daun dalam daur kupu-kupu terjadi pada masa",
        "Kupu-kupu mengalami tahap kepompong dalam daur hidupnya. Hewan yang memilikidaur hidup seperti kupu-kupu adalah",
        "Metamorfosis sempurna terjadi pada",
        "Tahapan daur hidup kecoak yang benar yaitu",
        // ... add more past tense questions (10 in total)

        // Future Tense

        "Perhatikan hewan-hewan berikut ini\n" +
                "\n" +
                "1. Ayam\n" +
                "\n" +
                "2. Ulat sutera\n" +
                "\n" +
                "3. Sapi\n" +
                "\n" +
                "4. Domba\n" +
                "\n" +
                "5. Ikan\n" +
                "\n" +
                "Hewan yang dapat dijadikan sumber bahan pangan adalah nomor",
        "Pelestarian hewan dan tumbuhan adalah tanggung jawab",
        "Kucing menghasilkan anak dengan cara",
        "Yang membedakan aantara kecoa muda dengan kecoa dewasa ialah",
        "Contoh Contoh hewan yang daur hidupnya tidak mengalami metamorfosis adalah",
        "Urutan daur hidup pada kupu-kupu adalah",
        "Hewan yang daur hidupnya mengalami metamorfosis tidak sempurna adalah capungkarena dalam daur hidupnya tidak ada fase",
        "Tahapan daur hidup kumbang setelah dari telur adalah menjadi ?",
        "Metamorfosis tidak sempurna tidak mengalami masa ",
        "Perubahan bentuk dalam siklus kehidupan hewan di sebut",
        "Hewan berikut ini yang mengalami metamorfosis tidak sempurna adalah",
        "Hewan yang mengalami metamorfosis sempurna, kecuali",
        "Hewan yang daur hidupnya mengalami metamorfosis adalah",
        "Nama lain dari pupa adalah",
        "Berikut ini hewan yang mengalami metamorfosis sempurna adalah"
        // ... add more future tense questions (10 in total)
    )

    private val objectOptionOne = arrayOf(
        // Present Tense

        "Daur hidup",
        "kepompong",
        "Larva",
        "Daur hidup",
        "Nyamuk",
        "Kupu-kupu",
        "Cicak",
        "Larva",
        "kecoa dan jangkrik",
        "Kelahiran dari perut induknya",
        "Telur – pupa – jentik-jentik – nyamuk",
        "Nyamuk ",
        "Kupu-kupu dewasa",
        "Trakhea",
        "Nimfa",
        // ... add more present tense options (10 in total)

        // Past Tense
        "Telur - kepompong - larva - kupu-kupu",
        "1,2,3",
        "Kepompong",
        "1,2,3",
        "Pemerintah",
        "Bertelur ",
        "Kecoa muda dan kecoa dewasa memiliki kaki",
        "Kecoa",
        "Ulat – telur – kepompong – kupu-kupu",
        "Kepompong dan capung",
        "Pua",
        "telur",
        "semut",
        "belalang",
        "telur – nimfa – kecoak",
        // ... add more past tense options (10 in total)

        // Future Tense
        "1,2,3",
        "Pemerintah",
        "Bertelur ",
        "Kecoa muda dan kecoa dewasa memiliki kaki",
        "Kecoa",
        "Ulat – telur – kepompong – kupu-kupu",
        "Kepompong dan capung","kepompong",
        "Larva",
        "Daur hidup",
        "Nyamuk",
        "Kupu-kupu",
        "Cicak",
        "Larva",
        "kecoa dan jangkrik"
        // ... add more future tense options (10 in total)
    )

    private val objectOptionTwo = arrayOf(
        // Present Tense
        "Perkembangbiakan",
        "Larva",
        "Telur",
        "Perkembangbiakan",
        "Capung",
        "Katak",
        "Capung",
        "Ulat",
        "Nyamuk dan Belalang",
        "Menetas dari telur",
        "Telur – belatung – pupa – nyamuk",
        "Kecoa",
        "Nimfa",
        "Insang",
        "Ulat",
        // ... add more present tense options (10 in total)

        // Past Tense
        "Telur - larva - pupa - kupu-kupu",
        "1,4,5",
        "Ulat",
        "1,3,5",
        "Presiden",
        "Beranak dan bertelur",
        "Kecoa dewasa tidak bersayap",
        "Kupu-kupu",
        "Telur – kepompong – ulat – kupu-kupu",
        "Ulat dan kempompong",
        "ulat",
        "kepompong",
        "nyamuk ",
        "kecoa",
        "telur – kecoak – nimfa",
        // ... add more past tense options (10 in total)

        // Future Tense
        "1,3,5",
        "Presiden",
        "Beranak dan bertelur",
        "Kecoa dewasa tidak bersayap",
        "Kupu-kupu",
        "Telur – kepompong – ulat – kupu-kupu",
        "Ulat dan kempompong","Larva",
        "Telur",
        "Perkembangbiakan",
        "Capung",
        "Katak",
        "Capung",
        "Ulat",
        "Nyamuk dan Belalang"
        // ... add more future tense options (10 in total)
    )

    private val objectOptionThree = arrayOf(
        // Present Tense
        "Metamorfosis",
        "kupa",
        "nimfa",
        "Metamorfosis",
        "Katak",
        "Lalat",
        "Ular",
        "Kepompong",
        "nyamuk dan kupu-kupu",
        "Membelah dir",
        "Telur – jentik-jentik – kecebong – nyamuk",
        "Katak",
        "Larva",
        "Paru-paru",
        "Telur",

        // ... add more present tense options (10 in total)

        // Past Tense
        "Telur - jentik-jentik - larva - kupu-kupu",
        "2,3,5",
        "Telur",
        "2,3,4",
        "Kita semua",
        "Membelah diri",
        "Kecoa muda tidak bersayap",
        "Kucing",
        "Telur – ulat – kepompong – kupu-kupu",
        "Telur dan ulat",
        "kepompong",
        "Kupu-kupu dewasa",
        "kecoak ",
        "Nyamuk",
        "kecoak – nimfa – telur",
        // ... add more past tense options (10 in total)

        // Future Tense
        "2,3,4",
        "Kita semua",
        "Membelah diri",
        "Kecoa muda tidak bersayap",
        "Kucing",
        "Telur – ulat – kepompong – kupu-kupu",
        "Telur dan ulat","kupa",
        "nimfa",
        "Metamorfosis",
        "Katak",
        "Lalat",
        "Ular",
        "Kepompong",
        "nyamuk dan kupu-kupu"
        // ... add more future tense options (10 in total)
    )

    private val objectOptionFour = arrayOf(
        // Present Tense
        "Pertumbuhan",
        "Kumbang Dewasa",
        "Pupa",
        "Pertumbuhan",
        "Kumbang",
        "Belalang",
        "Ayam",
        "Telur",
        "Katak dan Belalang",
        "Bertunas",
        "Telur – jentik-jentik – pupa – nyamuk",
        "Lalat",
        "Kepompong",
        "Kulit",
        "Kepompong",
        // ... add more present tense options (10 in total)

        // Past Tense
        "Telur - ulat - kepompong - kupu-kupu",
        "3,4,5",
        "Kupu-kupu",
        "1,2,5",
        "Petugas kabun Binatang",
        "Beranak ",
        "Kecoa muda tidak memiliki kaki",
        "Nyamuk ",
        "Kupu-kupu – ulat – telur – kepompong",
        "Nimfa dan kepompong",
        "kupu-kupu",
        "kepompong",
        "Belalang",
        "Kucing",
        "nimfa – telur – kecoak",
        // ... add more past tense options (10 in total)

        // Future Tense
        "1,2,5",
        "Petugas kabun Binatang",
        "Beranak ",
        "Kecoa muda tidak memiliki kaki",
        "Nyamuk ",
        "Kupu-kupu – ulat – telur – kepompong",
        "Nimfa dan kepompong",
        "Kumbang Dewasa",
        "Pupa",
        "Pertumbuhan",
        "Kumbang",
        "Belalang",
        "Ayam",
        "Telur",
        "Katak dan Belalang"
        // ... add more future tense options (10 in total)
    )

    private val objectAnswer = arrayOf(
        // Present Tense
        1, 2, 4, 3, 2, 4, 2, 3, 3, 2,4, 1, 4, 2, 4,
        // Past Tense
        1, 2, 2, 2, 3, 4, 3, 3, 3, 2,2, 2, 2, 3, 1,
        // Future Tense
        2, 3, 4, 3, 3, 3, 2, 2, 4, 3, 2, 4, 2, 3, 3
    )

    fun getQuestions(): ArrayList<Questions> {
        val questionList = ArrayList<Questions>()

        // Create a list of question indices and shuffle them
        val shuffledIndices = objectId.indices.toMutableList().apply { shuffle() }.take(15)

        // Add questions to the questionList in the shuffled order
        for (index in shuffledIndices) {
            val question = Questions()

            question.id = objectId[index]
            question.question = objectQuestion[index]
            // TODO buat ambil gambar
            // if (position <= 7)
            //    question.image = objectImage[position]

            // Shuffle the options for each question
            val options = mutableListOf(
                objectOptionOne[index],
                objectOptionTwo[index],
                objectOptionThree[index],
                objectOptionFour[index]
            ).apply { shuffle() }

            question.optionOne = options[0]
            question.optionTwo = options[1]
            question.optionThree = options[2]
            question.optionFour = options[3]

            // Sesuaikan jawaban dengan urutan pilihan yang sudah diacak
            question.answer = options.indexOfFirst { it == objectOptionOne[index] } + 1
            questionList.add(question)
        }

        return questionList
    }
}
