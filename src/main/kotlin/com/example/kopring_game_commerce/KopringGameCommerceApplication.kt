package com.example.kopring_game_commerce

import jakarta.annotation.PostConstruct
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

private val logger = KotlinLogging.logger {}

@SpringBootApplication
class KopringGameCommerceApplication {

    @Value("\${my-app.welcome-message}")
    val myAppWelcomeMessage: String = ""

    @PostConstruct
    fun printMyAppWelcomeMessage() {
        println(myAppWelcomeMessage)
    }
}

fun main(args: Array<String>) {
    runApplication<KopringGameCommerceApplication>(*args)

    // Logging
    logger.trace { "I'm trace! hello, world." }
    logger.debug { "I'm debug! Hello world." }
    logger.info { "I'm info! Hello world." }
    logger.warn { "I'm warn! Hello world." }
    logger.error { "I'm error! Hello world." }
}
