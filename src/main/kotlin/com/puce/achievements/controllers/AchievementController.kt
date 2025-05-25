package com.puce.achievements.controllers

import com.puce.achievements.models.entities.Achievement
import com.puce.achievements.services.AchievementService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/achievements")
class AchievementController(
    private val service: AchievementService
) {

    @GetMapping
    fun getAllAchievements(): List<Achievement> {
        return service.findAll()
    }

    @PostMapping
    fun createAchievement(@RequestBody achievement: Achievement): Achievement {
        return service.save(achievement)
    }
}
