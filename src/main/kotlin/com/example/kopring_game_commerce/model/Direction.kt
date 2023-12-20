package com.example.kopring_game_commerce.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

enum class Direction(val value: String) {
    UP("up"), DOWN("down"), LEFT("left"), RIGHT("right")
}