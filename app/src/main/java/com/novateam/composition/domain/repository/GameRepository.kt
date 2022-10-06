package com.novateam.composition.domain.repository

import com.novateam.composition.domain.entity.GameSettings
import com.novateam.composition.domain.entity.Level
import com.novateam.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(maxSumValue: Int, countOfOptions: Int): Question

    fun getGameSettings(level: Level): GameSettings
}