package com.example.kopring_game_commerce.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GameController @Autowired constructor(
    private val gameService: GameService
) {
    @PostMapping("/movePlayer")
    fun movePlayer(@RequestParam direction: Direction): Stock {
        return gameService.movePlayer(direction)
    }

    @GetMapping("/moveFood")
    fun moveFood(): Stock {
        return gameService.moveFood()
    }

    @GetMapping("/getStocks")
    fun getStocks(): List<Stock> {
        return gameService.getStocks()
    }
}