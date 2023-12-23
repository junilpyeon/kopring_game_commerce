package com.example.kopring_game_commerce.controller

import com.example.kopring_game_commerce.model.Direction
import com.example.kopring_game_commerce.entity.FeedingFood
import com.example.kopring_game_commerce.service.FeedingGameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/price-comparison")
class PriceComparisonController @Autowired constructor(
    private val priceComparisonService: PriceComparisonService
) {
    @GetMapping
    fun getAllProducts(): List<PriceComparison> {
        return priceComparisonService.getAllProducts()
    }

    @GetMapping("/{productName}")
    fun getProductsByName(@PathVariable productName: String): List<PriceComparison> {
        return priceComparisonService.getProductsByName(productName)
    }

    // Add more CRUD operations and other endpoints as needed
}