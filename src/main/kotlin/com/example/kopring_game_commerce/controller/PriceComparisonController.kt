package com.example.kopring_game_commerce.controller

import com.example.kopring_game_commerce.entity.Product
import com.example.kopring_game_commerce.service.PriceComparisonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/price-comparison")
class PriceComparisonController @Autowired constructor(
    private val priceComparisonService: PriceComparisonService
) {
    @GetMapping
    fun getAllProducts(): List<Product> {
        return priceComparisonService.getAllProducts()
    }

    @GetMapping("/{productName}")
    fun getProductsByName(@PathVariable productName: String): List<Product> {
        return priceComparisonService.getProductsByName(productName)
    }

    // Add more CRUD operations and other endpoints as needed
}