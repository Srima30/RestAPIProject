package com.example.onlinerestaurantmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinerestaurantmanagement.model.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer>{

}
