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
class PriceComparisonController @Autowired constructor(
        private val gameService: FeedingGameService
) {
    @PostMapping("/movePlayer")
    fun movePlayer(@RequestParam direction: Direction): FeedingFood { // 플레이어 이동
        return gameService.movePlayer(direction)
    }

    @GetMapping("/moveFood")
    fun moveFood(): FeedingFood { // 음식 이동
        return gameService.moveFood()
    }

    @GetMapping("/getStatus")
    fun getStatus(): List<FeedingFood> { // 재고 조회
        return gameService.getStatus()
    }
}