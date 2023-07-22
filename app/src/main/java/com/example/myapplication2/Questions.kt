package com.example.myapplication2

data class Questions(
    var id: Int = 0,
    var question: String = "",
//    var image: Int = 0,
    var optionOne: String = "",
    var optionTwo: String = "",
    var optionThree: String = "",
    var optionFour: String = "",
    var answer: Int = 0
)
