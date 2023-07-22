package com.example.myapplication2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class tense (
    val name : String,
    val foto : Int,
    val materi : String,
    val contoh : String

): Parcelable