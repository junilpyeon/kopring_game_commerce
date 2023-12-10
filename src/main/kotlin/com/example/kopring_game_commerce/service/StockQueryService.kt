package com.example.kopring_game_commerce.service

import com.example.kopring_game_commerce.entity.Stock
import com.example.kopring_game_commerce.repository.StockRepository
import org.springframework.stereotype.Service

@Service
class StockQueryService(
    private val stockRepository: StockRepository
) {

    fun getStocks(): List<Stock> {
        return stockRepository.findAllAsModel()
    }
}