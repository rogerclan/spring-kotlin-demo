package com.example.demo.controllers

import com.example.demo.models.Sprocket
import com.example.demo.services.SprocketService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/sprockets")
class SprocketController(val sprocketService: SprocketService) {

    @GetMapping
    fun getAllSprockets(): ResponseEntity<List<Sprocket>> {
        return ResponseEntity.ok(sprocketService.getAll())
    }

    @GetMapping("/part_numbers")
    fun getAllSprocketPartNumbers(): ResponseEntity<List<String>> {
        return ResponseEntity.ok(sprocketService.getAll().map { it.partNumber })
    }
}