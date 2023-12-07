package com.example.kopring_game_commerce.repository

import com.example.kopring_game_commerce.entity.Stock
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StockRepository : JpaRepository<Stock, String>