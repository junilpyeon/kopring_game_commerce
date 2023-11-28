package com.example.kopring_game_commerce

import jakarta.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

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
}
