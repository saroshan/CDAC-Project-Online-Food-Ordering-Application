package com.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
