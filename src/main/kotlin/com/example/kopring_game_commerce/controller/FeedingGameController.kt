package com.example.kopring_game_commerce.controller

import com.example.kopring_game_commerce.model.Direction
import com.example.kopring_game_commerce.entity.PetStatus
import com.example.kopring_game_commerce.service.FeedingGameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class FeedingGameController @Autowired constructor(
        private val gameService: FeedingGameService
) {
    @PostMapping("/movePlayer")
    fun movePlayer(@RequestParam direction: Direction): PetStatus { // 플레이어 이동
        return gameService.movePlayer(direction)
    }

    @GetMapping("/interactWithPet")
    fun interactWithPet(@RequestParam action: String): Any {
        return when (action.toLowerCase()) {
            "feed" -> gameService.feedPet()
            "caress" -> gameService.caressPet()
            else -> "Invalid action"
        }
    }

    @GetMapping("/getStatus")
    fun getStatus(): List<PetStatus> { // 재고 조회
        return gameService.getStatus()
    }
}