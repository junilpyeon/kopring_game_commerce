package com.example.kopring_game_commerce.repository

import com.example.kopring_game_commerce.entity.FeedingFood
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PriceComparisonRepository : JpaRepository<FeedingFood, Long>