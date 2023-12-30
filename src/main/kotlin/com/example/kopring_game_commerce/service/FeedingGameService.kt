package com.example.kopring_game_commerce.service

import com.example.kopring_game_commerce.model.Direction
import com.example.kopring_game_commerce.entity.FeedingFood
import com.example.kopring_game_commerce.repository.FeedingFoodRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class FeedingGameService @Autowired constructor(
        private val feedingFoodRepository: FeedingFoodRepository
) {
    fun movePlayer(direction: Direction): FeedingFood {
        // 여기에 플레이어를 움직이는 로직 추가
        // feedingFoodRepository.save(...) 등의 메서드를 사용하여 데이터베이스에 저장할 수 있음
        // (예: feedingFoodRepository.save(FeedingFood(x, y)))
        return FeedingFood(x = 0, y = 0) // 임시로 생성된 FeedingFood 객체 반환
    }

    fun feedPet(): FeedingFood {
        // 여기에 펫에게 먹이 주는 로직 추가
        // feedingFoodRepository.save(...) 등의 메서드를 사용하여 데이터베이스에 저장할 수 있음
        // (예: feedingFoodRepository.save(FeedingFood(x, y)))
        return FeedingFood(x = 0, y = 0) // 임시로 생성된 FeedingFood 객체 반환
    }

    fun caressPet(): FeedingFood {
        // 여기에 펫을 쓰다듬는 로직 추가
        // feedingFoodRepository.save(...) 등의 메서드를 사용하여 데이터베이스에 저장할 수 있음
        // (예: feedingFoodRepository.save(FeedingFood(x, y)))
        return FeedingFood(x = 0, y = 0) // 임시로 생성된 FeedingFood 객체 반환
    }

    fun getStatus(): List<FeedingFood> {
        return feedingFoodRepository.findAll()
    }
}
