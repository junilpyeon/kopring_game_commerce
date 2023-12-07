package com.example.kopring_game_commerce.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "stocks")
class Stock(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: String,
    val type: String,
    val name: String,
    val code: String,
    val ticker: String,
    val updatedDate: LocalDateTime,
    val createdDate: LocalDateTime,
)