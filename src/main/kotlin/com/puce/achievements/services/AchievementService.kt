package com.puce.achievements.services

import com.puce.achievements.models.entities.Achievement
import com.puce.achievements.repositories.AchievementRepository
import org.springframework.stereotype.Service

@Service
class AchievementService(
    private val repository: AchievementRepository
) {

    fun findAll(): List<Achievement> {
        return repository.findAll()
    }

    fun save(achievement: Achievement): Achievement {
        return repository.save(achievement)
    }
}