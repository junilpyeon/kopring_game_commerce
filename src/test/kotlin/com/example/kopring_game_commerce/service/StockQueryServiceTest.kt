package com.example.kopring_game_commerce.service

import com.example.kopring_game_commerce.model.Stock
import com.example.kopring_game_commerce.repository.StockRepository
import io.mockk.junit5.MockKExtension
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.every
import io.mockk.verify
import io.mockk.confirmVerified
import org.junit.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.apache.commons.lang3.RandomStringUtils
import org.apache.commons.lang3.RandomUtils
import org.assertj.core.api.Assertions.assertThat


@ExtendWith(MockKExtension::class)
class StockQueryServiceTest {

    @InjectMockKs
    private lateinit var underTest: StockQueryService

    @MockK
    private lateinit var stockRepository: StockRepository

    @Test
    fun listStocks() {
        // given
        val stocks = generateSequence {
            randomStock()
        }
            .distinct()
            .take(randomSmallPlural())
            .toList()
        every {
            stockRepository.findAllAsModel()
        } returns stocks

        // when
        val actual = underTest.listStocks()

        // then
        assertThat(actual).isEqualTo(stocks)
        verify(exactly = 1) {
            stockRepository.findAllAsModel()
        }
        confirmVerified(stockRepository)
    }
}

fun randomStock() = Stock(
    id = randomShortAlphanumeric(),
    type = randomShortAlphanumeric(),
    name = randomShortAlphanumeric(),
    code = randomShortAlphanumeric(),
    ticker = randomShortAlphanumeric(),
)

fun randomSmallPlural(): Int = RandomUtils.nextInt(2, 10)

fun randomShortAlphanumeric(): String = RandomStringUtils.randomAlphanumeric(randomSmallPlural())