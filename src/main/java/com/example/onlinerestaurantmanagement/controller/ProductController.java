package com.example.onlinerestaurantmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlinerestaurantmanagement.model.ProductEntity;
import com.example.onlinerestaurantmanagement.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("pagination")
    public ResponseEntity<Page<ProductEntity>> getProductsByField(
            @RequestParam String field,     
            @RequestParam int pageNo,       
            @RequestParam int pageSize) {   
        Page<ProductEntity> products = productService.getProductsByField(field, pageNo, pageSize);
        return ResponseEntity.ok(products);
    }
	
	
}