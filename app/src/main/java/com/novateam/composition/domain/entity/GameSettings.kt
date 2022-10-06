package com.novateam.composition.domain.entity

data class GameSettings(
    val maxSumValue: Int,
    val minCountOfRightAnswers: Int,
    val minPercentRightAnswers: Int,
    val gameTimeInSeconds: Int
)