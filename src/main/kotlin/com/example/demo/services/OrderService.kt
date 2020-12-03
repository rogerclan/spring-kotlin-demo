package com.example.demo.services

import com.example.demo.models.Order
import org.springframework.stereotype.Service

@Service
class OrderService {
    private val orders = mutableMapOf<String, Order>()

    fun getAll(): List<Order> {
        return orders.values.toList()
    }

    fun addOrUpdateOrder(order: Order): Boolean {
        orders[order.orderId] = order
        return true
    }

    fun removeOrder(id: String): Boolean {
        val order = orders.remove(id)
        return order != null
    }
}