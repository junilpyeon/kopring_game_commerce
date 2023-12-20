package com.example.kopring_game_commerce.controller

import com.example.kopring_game_commerce.model.Direction
import com.example.kopring_game_commerce.entity.FeedingFood
import com.example.kopring_game_commerce.service.GameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class FeedingGameController @Autowired constructor(
        private val gameService: GameService // 수정된 부분
) {
    @PostMapping("/movePlayer")
    fun movePlayer(@RequestParam direction: Direction): FeedingFood { // 수정된 부분
        return gameService.movePlayer(direction)
    }

    @GetMapping("/moveFood")
    fun moveFood(): FeedingFood { // 수정된 부분
        return gameService.moveFood()
    }

    @GetMapping("/getStocks")
    fun getStocks(): List<FeedingFood> { // 수정된 부분
        return gameService.getStocks()
    }
}