package com.example.onlinerestaurantmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlinerestaurantmanagement.model.CustomerEntity;
import com.example.onlinerestaurantmanagement.service.CustomerService;


@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@PostMapping("/add")
	public CustomerEntity addProductData(@RequestBody CustomerEntity customer )
	{
		return service.addproduct(customer);
		
		
	}
	@GetMapping("/show")
	public List<CustomerEntity> show(){
		return (List<CustomerEntity>)service.showdetails();
	}
	@GetMapping("/get{productId}")
	public CustomerEntity getByproductId(@PathVariable Integer customerId) {
		return service.getById (customerId);
	}


	
	@PutMapping("update")
	public CustomerEntity modify(@RequestBody CustomerEntity customer ) {
		return service.changeinfo(customer);
	}
	@PutMapping("updatebyid/{id}")
	public String modifybyid(@PathVariable int id, @RequestBody CustomerEntity customer) {
		return service.updateinfobyid(id,customer);
	}
	@DeleteMapping("deletedetail")
		public String del(@RequestBody CustomerEntity customer) {
			service.deleteinfo(customer);
			return "Deleted successfully";
		}
	
	@DeleteMapping("delid/{id}")
	public void deletemyid(@PathVariable int id) {
		service.deleteid(id);
	}
	
	@DeleteMapping("delparamid")
	public void deletemyparamid (@RequestParam int id) {
		service.deletepid(id);
	}
	}

