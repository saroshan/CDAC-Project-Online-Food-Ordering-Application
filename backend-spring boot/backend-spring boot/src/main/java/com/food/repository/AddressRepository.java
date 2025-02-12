package com.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
