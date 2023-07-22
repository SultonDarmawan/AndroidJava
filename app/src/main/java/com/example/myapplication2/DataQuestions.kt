package com.example.myapplication2

object DataQuestions {
    const val TOTAL_QUESTION_KEY: String = "total_question"
    const val SCORE_KEY: String = "score"

    private val objectId = arrayOf(
        // Present Tense (ID 1-10)
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
        // Past Tense (ID 11-20)
        11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
        // Future Tense (ID 21-30)
        21, 22, 23, 24, 25, 26, 27, 28, 29, 30
    )

    private val objectQuestion = arrayOf(
        // Present Tense
        "I play football in the yard.",
        "She sings beautifully.",
        "They speak English fluently.",
        "The train departs at 9 AM.",
        "My sister watches TV in the evening.",
        "He eats breakfast every morning.",
        "The sun rises in the east.",
        "The teacher explains the lesson.",
        "The birds sing in the tree.",
        "The cat chases the mouse.",
        // ... add more present tense questions (10 in total)

        // Past Tense
        "I cooked a cake yesterday.",
        "They went to the beach last summer.",
        "She finished her homework last night.",
        "He visited his grandparents last week.",
        "We watched a movie at the cinema.",
        "The dog barked loudly last night.",
        "She danced at the party.",
        "They played soccer in the park.",
        "I visited Paris last year.",
        "The children studied for the exam.",
        // ... add more past tense questions (10 in total)

        // Future Tense
        "I will visit my grandparents next week.",
        "She is going to become a teacher.",
        "We will have a meeting tomorrow.",
        "They are leaving for vacation next month.",
        "He will buy a new car soon.",
        "She is meeting her friends in the evening.",
        "I am going to learn to play the guitar.",
        "The school will organize a field trip.",
        "They will arrive at the airport at 6 PM.",
        "We are going to celebrate his birthday.",
        // ... add more future tense questions (10 in total)
    )

    private val objectOptionOne = arrayOf(
        // Present Tense
        "play",
        "sings",
        "speaks",
        "departs",
        "watches",
        "eats",
        "rises",
        "explains",
        "sing",
        "chases",
        // ... add more present tense options (10 in total)

        // Past Tense
        "cooked",
        "went",
        "finished",
        "visited",
        "watched",
        "barked",
        "danced",
        "played",
        "visited",
        "studied",
        // ... add more past tense options (10 in total)

        // Future Tense
        "will visit",
        "is going to become",
        "will have",
        "are leaving",
        "will buy",
        "is meeting",
        "am going to learn",
        "will organize",
        "will arrive",
        "are going to celebrate",
        // ... add more future tense options (10 in total)
    )

    private val objectOptionTwo = arrayOf(
        // Present Tense
        "plays",
        "sing",
        "speaking",
        "depart",
        "watch",
        "ate",
        "rise",
        "explain",
        "sings",
        "chase",
        // ... add more present tense options (10 in total)

        // Past Tense
        "cooking",
        "gone",
        "finish",
        "visits",
        "watches",
        "bark",
        "dancing",
        "playing",
        "visit",
        "study",
        // ... add more past tense options (10 in total)

        // Future Tense
        "visits",
        "will become",
        "having",
        "will leave",
        "buys",
        "meet",
        "going to learn",
        "organize",
        "arrive",
        "celebrate",
        // ... add more future tense options (10 in total)
    )

    private val objectOptionThree = arrayOf(
        // Present Tense
        "playing",
        "sang",
        "speak",
        "departing",
        "watched",
        "eat",
        "rising",
        "explaining",
        "song",
        "chased",
        // ... add more present tense options (10 in total)

        // Past Tense
        "cook",
        "go",
        "finishing",
        "visited",
        "watching",
        "barking",
        "dance",
        "plays",
        "visited",
        "studies",
        // ... add more past tense options (10 in total)

        // Future Tense
        "will visiting",
        "becoming",
        "has",
        "is leaving",
        "buying",
        "will meet",
        "to learn",
        "will organizing",
        "are arriving",
        "going to celebrating",
        // ... add more future tense options (10 in total)
    )

    private val objectOptionFour = arrayOf(
        // Present Tense
        "played",
        "is singing",
        "spoken",
        "departs",
        "watches",
        "eaten",
        "rose",
        "explains",
        "sang",
        "chased",
        // ... add more present tense options (10 in total)

        // Past Tense
        "cook",
        "went",
        "finishes",
        "visiting",
        "watched",
        "barked",
        "danced",
        "play",
        "visits",
        "study",
        // ... add more past tense options (10 in total)

        // Future Tense
        "visited",
        "to become",
        "having",
        "leaves",
        "bought",
        "meets",
        "learn",
        "organized",
        "arrives",
        "celebrates",
        // ... add more future tense options (10 in total)
    )

    private val objectAnswer = arrayOf(
        // Present Tense
        1, 2, 3, 1, 2, 3, 1, 2, 3, 4,
        // Past Tense
        1, 2, 3, 4, 1, 2, 3, 4, 1, 2,
        // Future Tense
        1, 2, 3, 4, 1, 2, 3, 4, 1, 2
    )

    fun getQuestions(): ArrayList<Questions> {
        val questionList = ArrayList<Questions>()

        // Create a list of question indices and shuffle them
        val shuffledIndices = objectId.indices.toMutableList().apply { shuffle() }.take(10)

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
