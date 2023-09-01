package com.example.onlinerestaurantmanagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinerestaurantmanagement.model.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

}
