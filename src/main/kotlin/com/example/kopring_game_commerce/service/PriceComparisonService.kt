package com.example.kopring_game_commerce.service

import com.example.kopring_game_commerce.model.Direction
import com.example.kopring_game_commerce.entity.FeedingFood
import com.example.kopring_game_commerce.entity.Product
import com.example.kopring_game_commerce.repository.FeedingFoodRepository
import com.example.kopring_game_commerce.repository.PriceComparisonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PriceComparisonService @Autowired constructor(
    private val priceComparisonRepository: PriceComparisonRepository
) {
    fun getAllProducts(): List<Product> {
        return priceComparisonRepository.findAll()
    }

    fun getProductsByName(productName: String): List<Product> {
        return priceComparisonRepository.findAllByProductName(productName)
    }

    // Add more methods as needed for business logic
}
