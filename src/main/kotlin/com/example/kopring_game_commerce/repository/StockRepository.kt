package com.example.kopring_game_commerce.repository

import com.example.kopring_game_commerce.entity.StockEntity
import com.example.kopring_game_commerce.model.Stock
import me.sample.myapp.entity.toModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StockRepository : JpaRepository<StockEntity, String> {

    fun findAllAsModel(): List<Stock> {
        return this.findAll().map { it.toModel() }
    }
}