package com.novateam.composition.domain.usecases

import com.novateam.composition.domain.entity.GameSettings
import com.novateam.composition.domain.entity.Level
import com.novateam.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}