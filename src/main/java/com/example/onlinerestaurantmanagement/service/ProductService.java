package com.example.onlinerestaurantmanagement.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.onlinerestaurantmanagement.model.ProductEntity;
import com.example.onlinerestaurantmanagement.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Page<ProductEntity> getProductsByField(String field, int pageNo, int pageSize) {
		Sort sort = Sort.by(field);
		Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        return productRepository.findAll(pageable);
	}

}