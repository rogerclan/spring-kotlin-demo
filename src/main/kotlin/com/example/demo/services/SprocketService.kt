package com.example.demo.services

import com.example.demo.models.Sprocket
import org.springframework.stereotype.Service

@Service
class SprocketService {

    fun getAll(): List<Sprocket> {
        val sprockets = mutableListOf<Sprocket>()
        sprockets.add(Sprocket("1234", 12, 1.2, 0.06f))
        sprockets.add(Sprocket("1235", 24, 2.1, 0.09f))
        sprockets.add(Sprocket("1236", 36, 2.9, 0.13f))
        return sprockets
    }
}