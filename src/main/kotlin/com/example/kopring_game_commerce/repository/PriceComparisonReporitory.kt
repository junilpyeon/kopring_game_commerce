package com.example.kopring_game_commerce.repository

import com.example.kopring_game_commerce.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface PriceComparisonRepository : JpaRepository<Product, Long> {
    fun findAllByProductName(productName: String): List<Product>
}