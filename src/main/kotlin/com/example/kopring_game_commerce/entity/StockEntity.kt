package com.example.kopring_game_commerce.entity

import jakarta.persistence.*
import com.example.kopring_game_commerce.model.Stock

@Entity
@Table(name = "stocks")
class StockEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: String,
    val type: String,
    val name: String,
    val code: String,
    val ticker: String,
    //val updatedDate: LocalDateTime,
    //val createdDate: LocalDateTime,
)

fun StockEntity.toModel(): Stock {
    return Stock(
        id = this.id,
        type = this.type,
        name = this.name,
        code = this.code,
        ticker = this.ticker,
    )
}