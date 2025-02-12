package com.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
