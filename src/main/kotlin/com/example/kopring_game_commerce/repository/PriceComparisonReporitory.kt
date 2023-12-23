package com.example.kopring_game_commerce.repository

import org.springframework.data.jpa.repository.JpaRepository

interface PriceComparisonRepository : JpaRepository<PriceComparison, Long> {
    fun findAllByProductName(productName: String): List<PriceComparison>
}