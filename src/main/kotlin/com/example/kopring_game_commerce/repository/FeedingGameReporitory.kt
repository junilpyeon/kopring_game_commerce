package com.example.kopring_game_commerce.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
class FeedingGameReporitory {
    interface StockRepository : JpaRepository<Stock, Long>
}