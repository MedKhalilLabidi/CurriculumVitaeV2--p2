package com.example.curriculumvitaev2

import androidx.annotation.DrawableRes


data class Education(
    @DrawableRes
    val EduPic : Int,
    val EduName : String,
    val EduLoc : String,
    val EduFirstDate : String,
    val EduLastDate: String,
)