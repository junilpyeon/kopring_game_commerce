package com.example.kopring_game_commerce

import mu.KotlinLogging
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

private val logger = KotlinLogging.logger {}

@SpringBootApplication
class KopringGameCommerceApplication

fun main(args: Array<String>) {
    runApplication<KopringGameCommerceApplication>(*args)
}
