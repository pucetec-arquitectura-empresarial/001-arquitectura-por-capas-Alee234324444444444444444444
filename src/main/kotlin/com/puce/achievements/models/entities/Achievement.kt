package com.puce.achievements.models.entities

import jakarta.persistence.Column
import java.time.LocalDate
import jakarta.persistence.Id
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType.IDENTITY

@Entity
data class Achievement(
    @Id @GeneratedValue(strategy = IDENTITY)
    val id: Long = 0,
    val title: String = "",
    val description: String = "",
    val category: String = "",
    val date: LocalDate = LocalDate.now(),
    @Column(name = "student_name")
    val studentName: String = ""
)