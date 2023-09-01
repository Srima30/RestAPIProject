package com.example.onlinerestaurantmanagement.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.onlinerestaurantmanagement.model.CustomerEntity;

import com.example.onlinerestaurantmanagement.repository.CustomerRepository;


@Service
public class CustomerService {
@Autowired
private CustomerRepository repository;

public CustomerEntity addproduct(CustomerEntity customer)
{
	return repository.save(customer);
}
public List<CustomerEntity> showdetails()
{
	return (List<CustomerEntity>)repository.findAll();
}
public CustomerEntity getById(Integer customerId) {
	return repository.findById(customerId).get();   
	}
public Optional<CustomerEntity> showbyid(int id){
	return repository.findById(id);
}
public CustomerEntity changeinfo(CustomerEntity customer) {
	return repository.saveAndFlush(customer);
}

public String updateinfobyid(int id,CustomerEntity customer) {
	repository.saveAndFlush(customer);
	if(repository.existsById(id)) {
		return "UPDATED";
	}
	else {
		return "Enter valid id";
	}
}
public void deleteinfo(CustomerEntity customer) {
	repository.delete(customer);
}

public void deleteid(int id) {
	repository.deleteById(id);
}

public void deletepid(int id) {
	repository.deleteById(id);
}

			}

