package com.example.onlinerestaurantmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class ProductEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int productid;
	public String productname;
	public double productprice;
	
	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductEntity(int productid, String productname, double productprice) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	
	}
