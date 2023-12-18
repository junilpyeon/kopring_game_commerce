package com.example.kopring_game_commerce.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GameService @Autowired constructor(
    private val stockRepository: StockRepository
) {
    fun movePlayer(direction: Direction): Stock {
        // 여기에 플레이어를 움직이는 로직 추가
        // stockRepository.save(...) 등의 메서드를 사용하여 데이터베이스에 저장할 수 있음
        // (예: stockRepository.save(Stock(x, y)))
        return Stock(x = 0, y = 0) // 임시로 생성된 Stock 객체 반환
    }

    fun moveFood(): Stock {
        // 여기에 먹이를 움직이는 로직 추가
        // stockRepository.save(...) 등의 메서드를 사용하여 데이터베이스에 저장할 수 있음
        // (예: stockRepository.save(Stock(x, y)))
        return Stock(x = 0, y = 0) // 임시로 생성된 Stock 객체 반환
    }

    fun getStocks(): List<Stock> {
        return stockRepository.findAll()
    }
}