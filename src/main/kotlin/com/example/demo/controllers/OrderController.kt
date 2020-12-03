package com.example.demo.controllers

import com.example.demo.models.Order
import com.example.demo.services.OrderService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/orders")
class OrderController(val orderService: OrderService) {

    @GetMapping
    fun getAll(): ResponseEntity<List<Order>> {
        return ResponseEntity.ok(orderService.getAll())
    }

    @PostMapping
    fun addOrder(@RequestBody order: Order): ResponseEntity<Boolean> {
        return ResponseEntity.ok(orderService.addOrUpdateOrder(order))
    }

    @DeleteMapping("/{id}")
    fun deleteOrder(@PathVariable id: String): ResponseEntity<Boolean> {
        return ResponseEntity.ok(orderService.removeOrder(id))
    }
}