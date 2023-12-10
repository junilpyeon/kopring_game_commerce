package com.example.kopring_game_commerce.controller

import com.example.kopring_game_commerce.model.Stock
import com.example.kopring_game_commerce.service.StockQueryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StockController(
    private val stockService: StockQueryService
) {

    @GetMapping("/stocks")
    fun getStocks(): List<Stock> {
        return stockService.getStocks()
    }
}