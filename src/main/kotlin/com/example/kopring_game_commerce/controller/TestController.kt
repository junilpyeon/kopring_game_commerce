package com.example.kopring_game_commerce.controller

import com.example.kopring_game_commerce.entity.Stock
import com.example.kopring_game_commerce.repository.StockRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StockController(
    private val stockRepository: StockRepository
) {

    @GetMapping("/stocks")
    fun listStocks(): List<Stock> {
        return stockRepository.findAll()
    }
}